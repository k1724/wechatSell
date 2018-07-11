package com.imocc.sell.service.impl;

import com.imocc.sell.dataobject.ProductInfo;
import com.imocc.sell.dto.CarDTO;
import com.imocc.sell.enums.ProductStatusEnum;
import com.imocc.sell.enums.ResultEnum;
import com.imocc.sell.exception.SellException;
import com.imocc.sell.repository.ProductInfoRepository;
import com.imocc.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author miss.ke
 * @date 2018-7-10
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    @Override
    public void increaseStock(List<CarDTO> carDTOList) {

    }

    @Override
    @Transactional
    public void decreaseStock(List<CarDTO> carDTOList) {
        for( CarDTO carDTO : carDTOList) {
            ProductInfo productInfo = repository.findById(carDTO.getProductId()).get();
            if(productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Integer result = productInfo.getProductStock() - carDTO.getProductQuantity();
            if(result < 0 ) {
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            productInfo.setProductStock(result);

            repository.save(productInfo);
        }
    }
}
