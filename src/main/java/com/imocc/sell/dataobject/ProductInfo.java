package com.imocc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author miss.ke
 * @date 2018-7-10
 */
@Entity
@Data
public class ProductInfo {

    @Id
    private String productId;

    /** 名字 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String ProductDescription;

    /** 小图 */
    private String productIcon;

    /** 商品状态 */
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;
}
