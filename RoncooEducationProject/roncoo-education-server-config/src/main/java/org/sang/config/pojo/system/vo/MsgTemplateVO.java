package org.sang.config.pojo.system.vo;


import java.io.Serializable;
import java.util.Date;

/**
 * 消息模板
 *
 * @author wuyun
 */
public class MsgTemplateVO implements Serializable {

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
	 * 状态(1有效, 0无效)
	 */
	private Integer statusId;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 备注
	 */
	private String remark;

}
