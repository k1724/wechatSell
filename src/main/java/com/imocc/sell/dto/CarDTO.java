package com.imocc.sell.dto;

import lombok.Data;

/**
 * 购物车
 * @author miss.ke
 * @date 2018-7-11
 */
@Data
public class CarDTO {

    /** 商品ID */
    private String productId;

    /** 数量 */
    private Integer productQuantity;

    public CarDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
