package com.imocc.sell.service;

import com.imocc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author miss.ke
 * @date 2018-7-10
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
