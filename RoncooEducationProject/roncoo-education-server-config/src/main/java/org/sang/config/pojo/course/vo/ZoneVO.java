package org.sang.config.pojo.course.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * 专区
 *
 * @author wujing
 */
public class ZoneVO implements Serializable {

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
	 * 状态(1:正常;0:禁用)
	 */
	private Integer statusId;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 名称
	 */
	private String zoneName;
	/**
	 * 描述
	 */
	private String zoneDesc;
	/**
	 * 位置(1电脑端，2微信端)
	 */
	private Integer zoneLocation;

}
