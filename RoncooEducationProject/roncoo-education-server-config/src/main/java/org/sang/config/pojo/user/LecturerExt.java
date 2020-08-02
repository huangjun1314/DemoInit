package org.sang.config.pojo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 讲师账户信息表(LecturerExt)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:38:19
 */
public class LecturerExt implements Serializable {
    private static final long serialVersionUID = 521124990009202568L;
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
    * 状态(1:正常，0:禁用)
    */
    private Integer statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 讲师用户编号
    */
    private Long lecturerUserNo;
    /**
    * 总收入
    */
    private Double totalIncome;
    /**
    * 已提金额
    */
    private Double historyMoney;
    /**
    * 可提余额
    */
    private Double enableBalances;
    /**
    * 冻结金额
    */
    private Double freezeBalances;
    /**
    * sign
    */
    private String sign;
    /**
    * 银行卡号
    */
    private String bankCardNo;
    /**
    * 银行名称
    */
    private String bankName;
    /**
    * 银行支行名称
    */
    private String bankBranchName;
    /**
    * 银行开户名
    */
    private String bankUserName;
    /**
    * 银行身份证号
    */
    private String bankIdCardNo;


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

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getLecturerUserNo() {
        return lecturerUserNo;
    }

    public void setLecturerUserNo(Long lecturerUserNo) {
        this.lecturerUserNo = lecturerUserNo;
    }

    public Double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(Double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public Double getHistoryMoney() {
        return historyMoney;
    }

    public void setHistoryMoney(Double historyMoney) {
        this.historyMoney = historyMoney;
    }

    public Double getEnableBalances() {
        return enableBalances;
    }

    public void setEnableBalances(Double enableBalances) {
        this.enableBalances = enableBalances;
    }

    public Double getFreezeBalances() {
        return freezeBalances;
    }

    public void setFreezeBalances(Double freezeBalances) {
        this.freezeBalances = freezeBalances;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getBankIdCardNo() {
        return bankIdCardNo;
    }

    public void setBankIdCardNo(String bankIdCardNo) {
        this.bankIdCardNo = bankIdCardNo;
    }

}