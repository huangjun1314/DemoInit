/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package org.sang.config.pojo.course.vo;


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 收入统计
 *
 * @author forest
 */
public class CountIncomeVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 总收入
	 */
	private BigDecimal totalProfit = BigDecimal.valueOf(0);

	/**
	 * 平台收入
	 */
	private BigDecimal platformProfit = BigDecimal.valueOf(0);

	/**
	 * 讲师收入
	 */
	private BigDecimal lecturerProfit = BigDecimal.valueOf(0);

}
