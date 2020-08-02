package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程推荐(CourseRecommend)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class CourseRecommend implements Serializable {
    private static final long serialVersionUID = 766316010716733524L;
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
    * 状态(1:有效;0:无效)
    */
    private Integer statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 分类ID
    */
    private Long categoryId;
    /**
    * 课程id
    */
    private Long courseId;


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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

}