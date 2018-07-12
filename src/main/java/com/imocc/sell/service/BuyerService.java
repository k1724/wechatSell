package com.imocc.sell.service;

import com.imocc.sell.dto.OrderDTO;

/**
 * @author miss.ke
 * @date 2018-7-12
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
