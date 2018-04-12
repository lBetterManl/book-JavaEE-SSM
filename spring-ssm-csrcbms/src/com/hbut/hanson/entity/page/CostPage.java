/**
 * Project Name:spring-ssm-csrcbms
 * File Name:CostPage.java
 * Package Name:com.hbut.hanson.entity.page
 * Date:2018年4月11日下午8:39:48
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.entity.page;
/**
 * ClassName:CostPage <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午8:39:48 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class CostPage extends Page {

	private String baseDurationSort;
	private String baseCostSort;
	public String getBaseDurationSort() {
		return baseDurationSort;
	}
	public void setBaseDurationSort(String baseDurationSort) {
		this.baseDurationSort = baseDurationSort;
	}
	public String getBaseCostSort() {
		return baseCostSort;
	}
	public void setBaseCostSort(String baseCostSort) {
		this.baseCostSort = baseCostSort;
	}
	
}

