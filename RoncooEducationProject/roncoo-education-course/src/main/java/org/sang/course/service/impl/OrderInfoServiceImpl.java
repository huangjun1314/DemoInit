package org.sang.course.service.impl;


import org.springframework.stereotype.Service;
import org.sang.course.dao.OrderInfoDao;
import org.sang.course.service.OrderInfoService;
import org.sang.config.pojo.course.OrderInfo;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单信息表(OrderInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
@Service("orderInfoService")
public class OrderInfoServiceImpl implements OrderInfoService {
    @Resource
    private OrderInfoDao orderInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderInfo queryById(Long id) {
        return this.orderInfoDao.queryById(id);
    }

    @Override
    public OrderInfo queryByOrderNO(String orderNo) {
        return this.orderInfoDao.queryByOrderNO(orderNo);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<OrderInfo> queryAllByLimit(int offset, int limit) {
        return this.orderInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param orderInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OrderInfo insert(OrderInfo orderInfo) {
        this.orderInfoDao.insert(orderInfo);
        return orderInfo;
    }

    /**
     * 修改数据
     *
     * @param orderInfo 实例对象
     * @return 实例对象
     */
    @Override
    public OrderInfo update(OrderInfo orderInfo) {
        this.orderInfoDao.update(orderInfo);
        return this.queryById(orderInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.orderInfoDao.deleteById(id) > 0;
    }

    @Override
    public List<OrderInfo> queryAll(OrderInfo orderInfo) {
        return this.orderInfoDao.queryAll(orderInfo);
    }
}