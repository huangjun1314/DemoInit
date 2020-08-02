package org.sang.trade.service;


import org.sang.config.pojo.course.OrderInfo;

public interface OrderService {
    public OrderInfo loadOrderInfo(String orderNo) throws Exception;
    public void paySuccess(String orderNo, int payType, String tradeNo)throws Exception;
    public void payFailed(String orderNo, int payType, String tradeNo)throws Exception;
}
