package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程视频信息(CourseVideo)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class CourseVideo implements Serializable {
    private static final long serialVersionUID = 116545139634563682L;
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
    * 课程ID
    */
    private Long courseId;
    /**
    * 章节ID
    */
    private Long chapterId;
    /**
    * 课时ID
    */
    private Long periodId;
    /**
    * 视频名称
    */
    private String videoName;
    /**
    * 视频编号
    */
    private Long videoNo;
    /**
    * 视频状态(1待上传，2上传成功，3上传失败)
    */
    private Integer videoStatus;
    /**
    * 时长
    */
    private String videoLength;
    /**
    * 视频ID
    */
    private String videoVid;
    /**
    * 阿里云oas
    */
    private String videoOasId;


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

    public Long getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Long periodId) {
        this.periodId = periodId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Long getVideoNo() {
        return videoNo;
    }

    public void setVideoNo(Long videoNo) {
        this.videoNo = videoNo;
    }

    public Integer getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(Integer videoStatus) {
        this.videoStatus = videoStatus;
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

    public String getVideoOasId() {
        return videoOasId;
    }

    public void setVideoOasId(String videoOasId) {
        this.videoOasId = videoOasId;
    }

}