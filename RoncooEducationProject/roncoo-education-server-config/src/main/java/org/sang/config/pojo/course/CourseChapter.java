package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 章节信息(CourseChapter)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:07
 */
public class CourseChapter implements Serializable {
    private static final long serialVersionUID = 256010866709724955L;
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
    * 章节名称
    */
    private String chapterName;
    /**
    * 章节描述
    */
    private String chapterDesc;
    /**
    * 是否免费：1免费，0收费
    */
    private Integer isFree;
    /**
    * 原价
    */
    private Double chapterOriginal;
    /**
    * 优惠价
    */
    private Double chapterDiscount;


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

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getChapterDesc() {
        return chapterDesc;
    }

    public void setChapterDesc(String chapterDesc) {
        this.chapterDesc = chapterDesc;
    }

    public Integer getIsFree() {
        return isFree;
    }

    public void setIsFree(Integer isFree) {
        this.isFree = isFree;
    }

    public Double getChapterOriginal() {
        return chapterOriginal;
    }

    public void setChapterOriginal(Double chapterOriginal) {
        this.chapterOriginal = chapterOriginal;
    }

    public Double getChapterDiscount() {
        return chapterDiscount;
    }

    public void setChapterDiscount(Double chapterDiscount) {
        this.chapterDiscount = chapterDiscount;
    }

}