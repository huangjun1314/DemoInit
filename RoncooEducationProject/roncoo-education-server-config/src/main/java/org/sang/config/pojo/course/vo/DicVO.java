package org.sang.config.pojo.course.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * 数据字典
 *
 * @author wujing
 */
public class DicVO implements Serializable {

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
	 * 状态(1:正常，0:禁用)
	 */
	private Integer statusId;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 字段名
	 */
	private String fieldName;
	/**
	 * 备注
	 */
	private String remark;

}
