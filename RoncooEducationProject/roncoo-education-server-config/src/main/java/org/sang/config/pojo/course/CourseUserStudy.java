package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程用户关联表(CourseUserStudy)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class CourseUserStudy implements Serializable {
    private static final long serialVersionUID = 839070377595108890L;
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
    * 用户编号
    */
    private Long userNo;
    /**
    * 总课时数
    */
    private Integer periodTotal;
    /**
    * 已学习课时数
    */
    private Integer periodStudy;


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

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

    public Integer getPeriodTotal() {
        return periodTotal;
    }

    public void setPeriodTotal(Integer periodTotal) {
        this.periodTotal = periodTotal;
    }

    public Integer getPeriodStudy() {
        return periodStudy;
    }

    public void setPeriodStudy(Integer periodStudy) {
        this.periodStudy = periodStudy;
    }

}