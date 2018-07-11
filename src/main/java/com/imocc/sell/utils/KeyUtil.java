package com.imocc.sell.utils;

import java.util.Random;

/**
 * @author miss.ke
 * @date 2018-7-11
 */
public class KeyUtil {
    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     */
    public static synchronized String genUniqueKey(){
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
