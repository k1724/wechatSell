package com.imocc.sell.dto;

import com.imocc.sell.dataobject.OrderDetail;
import com.imocc.sell.enums.OrderStatusEnum;
import com.imocc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.springframework.data.annotation.Transient;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author miss.ke
 * @date 2018-7-11
 */
@Data
public class OrderDTO {

    /**
     * 订单ID
     */
    private String orderId;

    /** 买家名字 */
    private String buyerName;

    /** 买家手机号 */
    private String buyerPhone;

    /** 买家地址 */
    private String buyerAddress;

    /** 买家微信Openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态，默认为0新下单 */
    private Integer orderStatus ;

    /** 支付状态，默认为0未支付 */
    private Integer payStatus ;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;

    /** 订单明细 */
    @Transient
    private List<OrderDetail> orderDetailList;

}
