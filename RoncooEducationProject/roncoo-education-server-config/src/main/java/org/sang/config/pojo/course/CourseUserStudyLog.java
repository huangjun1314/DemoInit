package org.sang.config.pojo.course;

import java.io.Serializable;
import java.util.Date;

/**
 * 课程用户学习日志(CourseUserStudyLog)实体类
 *
 * @author makejava
 * @since 2020-05-08 10:27:08
 */
public class CourseUserStudyLog implements Serializable {
    private static final long serialVersionUID = -81853053745877213L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 创建时间
    */
    private Date gmtCreate;
    /**
    * 课程编号
    */
    private Long courseId;
    /**
    * 课程名称
    */
    private String courseName;
    /**
    * 章节编号
    */
    private Long chapterId;
    /**
    * 章节名称
    */
    private String chapterName;
    /**
    * 课时编号
    */
    private Long periodId;
    /**
    * 课时名称
    */
    private String periodName;
    /**
    * 用户编号
    */
    private Long userNo;


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

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Long getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Long periodId) {
        this.periodId = periodId;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public Long getUserNo() {
        return userNo;
    }

    public void setUserNo(Long userNo) {
        this.userNo = userNo;
    }

}