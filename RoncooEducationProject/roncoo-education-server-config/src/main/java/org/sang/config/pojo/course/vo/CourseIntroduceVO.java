package org.sang.config.pojo.course.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * 课程介绍信息
 *
 * @author wujing
 */
public class CourseIntroduceVO implements Serializable {

	private static final long serialVersionUID = 1L;

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
