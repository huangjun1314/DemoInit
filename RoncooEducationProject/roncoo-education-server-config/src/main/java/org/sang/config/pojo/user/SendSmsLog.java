package org.sang.config.pojo.user;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户发送短信日志(SendSmsLog)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:38:19
 */
public class SendSmsLog implements Serializable {
    private static final long serialVersionUID = -49120336118538940L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 短信模板
    */
    private String template;
    /**
    * 手机号码
    */
    private String mobile;
    /**
    * 验证码
    */
    private String smsCode;
    /**
    * 是否发送成功(1发送成功，0:发送失败)
    */
    private Integer isSuccess;


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

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public Integer getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Integer isSuccess) {
        this.isSuccess = isSuccess;
    }

}