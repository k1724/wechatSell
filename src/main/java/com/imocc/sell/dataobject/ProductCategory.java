package com.imocc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author miss.ke
 * @date 2018-7-9
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

    /** 类目ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;

    /** 类目名字*/
    private String categoryName;

    /** 类目编号*/
    private Integer categoryType;

    public ProductCategory(){

    }

    public ProductCategory(String categoryName, Integer categoryType){
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }

}
