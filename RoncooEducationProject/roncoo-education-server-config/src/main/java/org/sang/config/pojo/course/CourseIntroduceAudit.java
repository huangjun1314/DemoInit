package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程介绍信息-审核(CourseIntroduceAudit)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class CourseIntroduceAudit implements Serializable {
    private static final long serialVersionUID = 722930203848001051L;
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
    * 课程简介
    */
    private Object introduce;


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

    public Object getIntroduce() {
        return introduce;
    }

    public void setIntroduce(Object introduce) {
        this.introduce = introduce;
    }

}