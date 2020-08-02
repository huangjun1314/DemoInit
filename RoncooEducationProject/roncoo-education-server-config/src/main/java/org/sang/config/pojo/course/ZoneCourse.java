package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 专区课程关联表(ZoneCourse)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class ZoneCourse implements Serializable {
    private static final long serialVersionUID = -33182836436021196L;
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
    * 状态(1:正常;0:禁用)
    */
    private Integer statusId;
    /**
    * 排序
    */
    private Integer sort;
    /**
    * 专区编号
    */
    private Long zoneId;
    /**
    * 位置(0电脑端，1微信端)
    */
    private Integer zoneLocation;
    /**
    * 课程ID
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

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getZoneLocation() {
        return zoneLocation;
    }

    public void setZoneLocation(Integer zoneLocation) {
        this.zoneLocation = zoneLocation;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

}