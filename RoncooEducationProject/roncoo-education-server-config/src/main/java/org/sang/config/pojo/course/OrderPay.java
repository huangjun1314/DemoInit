package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单支付信息表(OrderPay)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class OrderPay implements Serializable {
    private static final long serialVersionUID = 591191514546690675L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 订单号
    */
    private Long orderNo;
    /**
    * 流水号
    */
    private Long serialNumber;
    /**
    * 订单状态：1待支付，2成功支付，3支付失败，4已关闭，5已退款, 6订单解绑
    */
    private Integer orderStatus;
    /**
    * 支付方式：1微信支付，2支付宝支付，3积分支付，4手工录单
    */
    private Integer payType;
    /**
    * 支付时间
    */
    private Date payTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

}