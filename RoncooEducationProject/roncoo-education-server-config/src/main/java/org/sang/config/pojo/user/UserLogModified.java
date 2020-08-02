package org.sang.config.pojo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户修改日志(UserLogModified)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:38:19
 */
public class UserLogModified implements Serializable {
    private static final long serialVersionUID = 514950445860070761L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 用户编号
    */
    private Long userNo;
    /**
    * 原手机号
    */
    private String mobileOld;
    /**
    * 新手机
    */
    private String mobileNew;
    /**
    * 备注
    */
    private String remark;


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

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public String getMobileOld() {
        return mobileOld;
    }

    public void setMobileOld(String mobileOld) {
        this.mobileOld = mobileOld;
    }

    public String getMobileNew() {
        return mobileNew;
    }

    public void setMobileNew(String mobileNew) {
        this.mobileNew = mobileNew;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}