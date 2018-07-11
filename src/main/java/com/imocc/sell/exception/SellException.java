package com.imocc.sell.exception;

import com.imocc.sell.enums.ResultEnum;

/**
 * @author miss.ke
 * @date 2018-7-11
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
