package org.sang.config.pojo.course.qo;


import java.io.Serializable;
import java.util.Date;

/**
 * 课程介绍信息
 *
 * @author wujing
 */
public class CourseIntroduceQO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 当前页
     */
    private int pageCurrent;
    /**
     * 每页记录数
     */
    private int pageSize;
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
    private String introduce;
}
