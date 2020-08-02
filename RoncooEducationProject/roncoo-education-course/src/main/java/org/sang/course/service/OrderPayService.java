package org.sang.course.service;


import org.sang.config.pojo.course.OrderPay;

import java.util.List;

/**
 * 订单支付信息表(OrderPay)表服务接口
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public interface OrderPayService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderPay queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<OrderPay> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderPay 实例对象
     * @return 实例对象
     */
    OrderPay insert(OrderPay orderPay);

    /**
     * 修改数据
     *
     * @param orderPay 实例对象
     * @return 实例对象
     */
    OrderPay update(OrderPay orderPay);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过实体作为筛选条件查询
     *
     * @param orderPay 实例对象
     * @return 对象列表
     */
    List<OrderPay> queryAll(OrderPay orderPay);

}