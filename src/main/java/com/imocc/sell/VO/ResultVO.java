package com.imocc.sell.VO;

import lombok.Data;

/**
 * 外部接口返回对象
 * @author miss.ke
 * @date 2018-7-10
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体内容 */
    private T date;
}
