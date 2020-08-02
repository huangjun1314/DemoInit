package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 课时信息-审核(CourseChapterPeriodAudit)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public class CourseChapterPeriodAudit implements Serializable {
    private static final long serialVersionUID = 728133482093465273L;
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
    * 审核状态(0:待审核;1:审核通过;2:审核不通过)
    */
    private Integer auditStatus;
    /**
    * 审核意见
    */
    private String auditOpinion;
    /**
    * 课程ID
    */
    private Long courseId;
    /**
    * 章节ID
    */
    private Long chapterId;
    /**
    * 课时描述
    */
    private String periodDesc;
    /**
    * 是否免费：1免费，0收费
    */
    private Integer isFree;
    /**
    * 原价
    */
    private Double periodOriginal;
    /**
    * 优惠价
    */
    private Double periodDiscount;
    /**
    * 购买人数
    */
    private Integer countBuy;
    /**
    * 学习人数
    */
    private Integer countStudy;
    /**
    * 是否存在文档(1存在，0否)
    */
    private Integer isDoc;
    /**
    * 文档名称
    */
    private String docName;
    /**
    * 文档地址
    */
    private String docUrl;
    /**
    * 课时名称
    */
    private String periodName;
    /**
    * 是否存在视频(1存在，0否)
    */
    private String isVideo;
    /**
    * 视频编号
    */
    private Long videoNo;
    /**
    * 视频名称
    */
    private String videoName;
    /**
    * 时长
    */
    private String videoLength;
    /**
    * 视频VID
    */
    private String videoVid;


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

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getPeriodDesc() {
        return periodDesc;
    }

    public void setPeriodDesc(String periodDesc) {
        this.periodDesc = periodDesc;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Double getPeriodOriginal() {
        return periodOriginal;
    }

    public void setPeriodOriginal(Double periodOriginal) {
        this.periodOriginal = periodOriginal;
    }

    public Double getPeriodDiscount() {
        return periodDiscount;
    }

    public void setPeriodDiscount(Double periodDiscount) {
        this.periodDiscount = periodDiscount;
    }

    public Integer getCountBuy() {
        return countBuy;
    }

    public void setCountBuy(Integer countBuy) {
        this.countBuy = countBuy;
    }

    public Integer getCountStudy() {
        return countStudy;
    }

    public void setCountStudy(Integer countStudy) {
        this.countStudy = countStudy;
    }

    public Integer getIsDoc() {
        return isDoc;
    }

    public void setIsDoc(Integer isDoc) {
        this.isDoc = isDoc;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public String getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(String isVideo) {
        this.isVideo = isVideo;
    }

    public Long getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(Long videoNo) {
        this.videoNo = videoNo;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoLength() {
        return videoLength;
    }

    public void setVideoLength(String videoLength) {
        this.videoLength = videoLength;
    }

    public String getVideoVid() {
        return videoVid;
    }

    public void setVideoVid(String videoVid) {
        this.videoVid = videoVid;
    }

}