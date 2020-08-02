package org.sang.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * 用户基础信息
 */
public class User implements UserDetails {

    /**
     * 主键id
     */
    private String id;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;
    /**
     * 状态（1：正常，0：禁用）
     */
    private Integer statusId;
    /**
     * 用户编号
     */
    private String userNo;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 密码盐
     */
    private String moblieSalt;
    /**
     * 登录密码
     */
    private String mobilePsw;
    /**
     * 用户来源（client_id）
     */
    private String userSource;
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

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
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

    public String getMoblieSalt() {
        return moblieSalt;
    }

    public void setMoblieSalt(String moblieSalt) {
        this.moblieSalt = moblieSalt;
    }

    public String getMobilePsw() {
        return mobilePsw;
    }

    public void setMobilePsw(String mobilePsw) {
        this.mobilePsw = mobilePsw;
    }

    public String getUserSource() {
        return userSource;
    }

    public void setUserSource(String userSource) {
        this.userSource = userSource;
    }

    public List<SysRole> getSysRoleList() {
        return sysRoleList;
    }

    public void setSysRoleList(List<SysRole> sysRoleList) {
        this.sysRoleList = sysRoleList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", statusId=" + statusId +
                ", userNo=" + userNo +
                ", mobile='" + mobile + '\'' +
                ", moblieSalt='" + moblieSalt + '\'' +
                ", mobilePsw='" + mobilePsw + '\'' +
                ", userSource='" + userSource + '\'' +
                ", sysRoleList=" + sysRoleList +
                '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (SysRole sysRole:sysRoleList){
            authorities.add(new SimpleGrantedAuthority(sysRole.getRoleName()));
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return mobilePsw;
    }

    @Override
    public String getUsername() {
        return ""+userNo+"";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
