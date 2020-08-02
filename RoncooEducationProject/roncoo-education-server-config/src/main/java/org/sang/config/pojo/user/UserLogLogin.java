package org.sang.config.pojo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户错误登录日志(UserLogLogin)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:38:19
 */
public class UserLogLogin implements Serializable {
    private static final long serialVersionUID = 528163924731394417L;
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
    * 客户端ID
    */
    private String clientId;
    /**
    * 登录状态(1成功，0失败)
    */
    private Integer loginStatus;
    /**
    * 登录IP
    */
    private String loginIp;


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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

}