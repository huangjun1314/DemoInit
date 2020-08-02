package org.sang.config.pojo.course.vo;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class OrderEchartsVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 总收入
	 */
	private List<BigDecimal> countPaidPrice;
	private List<Integer> countPaidPriceq;

	/**
	 * 总订单数
	 */
	private List<Integer> countOrders;

}
