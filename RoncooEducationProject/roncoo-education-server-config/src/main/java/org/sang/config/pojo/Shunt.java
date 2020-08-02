package org.sang.config.pojo;

/**
 * 讲师分润表（自定义，数据库中不存在）
 */
public class Shunt {

    //序号，一般没有值
    private Long id;
    //讲师名称
    private String lecturerName;
    //讲师手机
    private String lecturerMobile;
    //银行卡号
    private String bankCardNo;
    //银行名称
    private String bankName;
    //开户名
    private String bankUserName;
    //讲师收入
    private String lecturerProfit;
    //平台收入
    private String platformProfit;
    //审核状态
    private String auditStatus;
    //时间
    private String gmtCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getLecturerMobile() {
        return lecturerMobile;
    }

    public void setLecturerMobile(String lecturerMobile) {
        this.lecturerMobile = lecturerMobile;
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

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName;
    }

    public String getLecturerProfit() {
        return lecturerProfit;
    }

    public void setLecturerProfit(String lecturerProfit) {
        this.lecturerProfit = lecturerProfit;
    }

    public String getPlatformProfit() {
        return platformProfit;
    }

    public void setPlatformProfit(String platformProfit) {
        this.platformProfit = platformProfit;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
