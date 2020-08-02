package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.OrderPayDao;
import org.sang.course.service.OrderPayService;
import org.sang.config.pojo.course.OrderPay;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单支付信息表(OrderPay)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("orderPayService")
public class OrderPayServiceImpl implements OrderPayService {
    @Resource
    private OrderPayDao orderPayDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderPay queryById(Long id) {
        return this.orderPayDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderPay> queryAllByLimit(int offset, int limit) {
        return this.orderPayDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderPay 实例对象
     * @return 实例对象
     */
    @Override
    public OrderPay insert(OrderPay orderPay) {
        this.orderPayDao.insert(orderPay);
        return orderPay;
    }

    /**
     * 修改数据
     *
     * @param orderPay 实例对象
     * @return 实例对象
     */
    @Override
    public OrderPay update(OrderPay orderPay) {
        this.orderPayDao.update(orderPay);
        return this.queryById(orderPay.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderPayDao.deleteById(id) > 0;
    }

    @Override
    public List<OrderPay> queryAll(OrderPay orderPay) {
        return this.orderPayDao.queryAll(orderPay);
    }
}