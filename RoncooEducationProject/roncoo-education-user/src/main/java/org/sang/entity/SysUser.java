package org.sang.entity;

import java.util.Date;
import java.util.List;

/**
 * 后台用户信息
 */
public class SysUser {

    /**
     * 主键id
     * */
    private String id;
    /**
     * 创建时间
     * */
    private Date gmtCreate;
    /**
     * 修改时间
     * */
    private Date gmtModified;
    /**
     * 状态（1：正常，0：禁用）
     */
    private int statusId;
    /**
     * 排序
     */
    private int sort;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 备注
     */
    private String remark;
    /**
     * 角色信息
     */
    private List<SysRole> sysRoleList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<SysRole> getSysRoleList() {
        return sysRoleList;
    }

    public void setSysRoleList(List<SysRole> sysRoleList) {
        this.sysRoleList = sysRoleList;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", sort=" + sort +
                ", userNo=" + userNo +
                ", mobile=" + mobile +
                ", realName='" + realName + '\'' +
                ", remark='" + remark + '\'' +
                ", sysRoleList=" + sysRoleList +
                '}';
    }
}
