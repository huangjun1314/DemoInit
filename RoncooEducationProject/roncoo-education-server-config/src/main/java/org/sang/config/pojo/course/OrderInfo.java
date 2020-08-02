package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单信息表(OrderInfo)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class OrderInfo implements Serializable {
    private static final long serialVersionUID = 999865186376453040L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 修改时间
    */
    private Date gmtModified;
    /**
    * 讲师用户编号
    */
    private Long lecturerUserNo;
    /**
    * 讲师名称
    */
    private String lecturerName;
    /**
    * 用户编号
    */
    private Long userNo;
    /**
    * 用户电话
    */
    private String mobile;
    /**
    * 用户注册时间
    */
    private Date registerTime;
    /**
    * 订单号
    */
    private Long orderNo;
    /**
    * 课程ID
    */
    private Long courseId;
    /**
    * 课程名称
    */
    private String courseName;
    /**
    * 应付金额
    */
    private Double pricePayable;
    /**
    * 优惠金额
    */
    private Double priceDiscount;
    /**
    * 实付金额
    */
    private Double pricePaid;
    /**
    * 平台收入
    */
    private Double platformProfit;
    /**
    * 讲师收入
    */
    private Double lecturerProfit;
    /**
    * 交易类型：1线上支付，2线下支付
    */
    private Integer tradeType;
    /**
    * 支付方式：1微信支付，2支付宝支付
    */
    private Integer payType;
    /**
    * 购买渠道：1web
    */
    private Integer channelType;
    /**
    * 订单状态：1待支付，2成功支付，3支付失败，4已关闭
    */
    private Integer orderStatus;
    /**
    * 是否显示给讲师(1是，0否)
    */
    private Integer isShowLecturer;
    /**
    * 是否显示给用户看(1是，0否)
    */
    private Integer isShowUser;
    /**
    * 客户备注
    */
    private String remarkCus;
    /**
    * 后台备注
    */
    private String remark;
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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getPricePayable() {
        return pricePayable;
    }

    public void setPricePayable(Double pricePayable) {
        this.pricePayable = pricePayable;
    }

    public Double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Double getPricePaid() {
        return pricePaid;
    }

    public void setPricePaid(Double pricePaid) {
        this.pricePaid = pricePaid;
    }

    public Double getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(Double platformProfit) {
        this.platformProfit = platformProfit;
    }

    public Double getLecturerProfit() {
        return lecturerProfit;
    }

    public void setLecturerProfit(Double lecturerProfit) {
        this.lecturerProfit = lecturerProfit;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getChannelType() {
        return channelType;
    }

    public void setChannelType(Integer channelType) {
        this.channelType = channelType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getIsShowLecturer() {
        return isShowLecturer;
    }

    public void setIsShowLecturer(Integer isShowLecturer) {
        this.isShowLecturer = isShowLecturer;
    }

    public Integer getIsShowUser() {
        return isShowUser;
    }

    public void setIsShowUser(Integer isShowUser) {
        this.isShowUser = isShowUser;
    }

    public String getRemarkCus() {
        return remarkCus;
    }

    public void setRemarkCus(String remarkCus) {
        this.remarkCus = remarkCus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", lecturerUserNo=" + lecturerUserNo +
                ", lecturerName='" + lecturerName + '\'' +
                ", userNo=" + userNo +
                ", mobile='" + mobile + '\'' +
                ", registerTime=" + registerTime +
                ", orderNo=" + orderNo +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", pricePayable=" + pricePayable +
                ", priceDiscount=" + priceDiscount +
                ", pricePaid=" + pricePaid +
                ", platformProfit=" + platformProfit +
                ", lecturerProfit=" + lecturerProfit +
                ", tradeType=" + tradeType +
                ", payType=" + payType +
                ", channelType=" + channelType +
                ", orderStatus=" + orderStatus +
                ", isShowLecturer=" + isShowLecturer +
                ", isShowUser=" + isShowUser +
                ", remarkCus='" + remarkCus + '\'' +
                ", remark='" + remark + '\'' +
                ", payTime=" + payTime +
                '}';
    }
}