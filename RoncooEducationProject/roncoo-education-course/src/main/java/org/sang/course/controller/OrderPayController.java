package org.sang.course.controller;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sang.course.service.OrderPayService;
import org.sang.config.pojo.course.OrderPay;

import javax.annotation.Resource;

/**
 * 订单支付信息表(OrderPay)表控制层
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@RestController
@RequestMapping("orderPay")
@Api(tags = "订单支付信息表(OrderPay)表控制层")
public class OrderPayController {
    /**
     * 服务对象
     */
    @Resource
    private OrderPayService orderPayService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderPay selectOne(Long id) {
        return this.orderPayService.queryById(id);
    }

}
