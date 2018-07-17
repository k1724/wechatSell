package com.imocc.sell.utils;

import com.imocc.sell.enums.CodeEnum;

/**
 * @author miss.ke
 * @date 2018-7-15
 */
public class EnumUtil {

    public static <T extends CodeEnum>T getByCode(Integer code, Class<T> enumClass){
        for(T each : enumClass.getEnumConstants()){
            if(code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
