package org.sang.trade.service;

import org.sang.config.dto.TimeUtil;
import org.sang.config.pojo.course.OrderInfo;
import org.sang.config.pojo.course.OrderPay;
import org.sang.course.service.OrderInfoService;
import org.sang.course.service.OrderPayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Random;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderInfoService orderInfoService;
    @Resource
    private OrderPayService orderPayService;

    @Override
    public OrderInfo loadOrderInfo(String orderNo) throws Exception {
        return orderInfoService.queryByOrderNO(orderNo);
    }

    //支付成功
    @Override
    public void paySuccess(String orderNo, int payType, String tradeNo) throws Exception {
        //修改订单信息
        OrderInfo orderInfo = this.loadOrderInfo(orderNo);
        orderInfo.setOrderStatus(2);
        orderInfo.setPayType(payType);
        orderInfoService.update(orderInfo);
        //添加交易流水号

        OrderPay orderPay = new OrderPay();
        orderPay.setOrderNo(Long.parseLong(orderNo));
        orderPay.setPayType(payType);
        orderPay.setOrderStatus(2);
        orderPay.setSerialNumber(Long.parseLong(TimeUtil.getMillPrimaryKey()));

        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < 19; i++) {
            rs.append(r.nextInt(10));
        }
        String id = r.toString();
        orderPay.setId(Long.valueOf(id));

        orderPayService.insert(orderPay);
    }

    //支付失败
    @Override
    public void payFailed(String orderNo, int payType, String tradeNo) throws Exception {
        //修改订单信息
        OrderInfo orderInfo = this.loadOrderInfo(orderNo);
        orderInfo.setOrderStatus(3);
        orderInfo.setPayType(payType);
        orderInfoService.update(orderInfo);
        //添加交易流水号
        OrderPay orderPay = new OrderPay();
        orderPay.setOrderNo(Long.parseLong(orderNo));
        orderPay.setPayType(payType);
        orderPay.setOrderStatus(3);
        orderPay.setSerialNumber(Long.parseLong(TimeUtil.getMillPrimaryKey()));

        Random r = new Random();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < 19; i++) {
            rs.append(r.nextInt(10));
        }
        String id = r.toString();
        orderPay.setId(Long.valueOf(id));

        orderPayService.insert(orderPay);
    }
}
