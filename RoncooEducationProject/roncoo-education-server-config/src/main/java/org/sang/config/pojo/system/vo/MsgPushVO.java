package org.sang.config.pojo.system.vo;


import java.io.Serializable;

/**
 * 站内信息表，发送用
 *
 * @author wuyun
 */
public class MsgPushVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 标题
	 */
	private String msgTitle;

	/**
	 * 是否置顶
	 */
	private Integer isTop;
}
