/**
 * Project Name:spring-ssm-csrcbms
 * File Name:Page.java
 * Package Name:com.hbut.hanson.entity.page
 * Date:2018年4月11日下午8:30:09
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.entity.page;
/**
 * ClassName:Page <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午8:30:09 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 分页对象
 */
public abstract class Page {
	
	private int currentPage = 1; 
	private int pageSize = 5; 
	private int begin;
	private int end; 
	private int rows;
	private int totalPage;

	public int getBegin() {
		begin = (currentPage - 1) * pageSize;
		return begin;
	}

	public int getEnd() {
		end = currentPage * pageSize + 1;
		return end;
	}

	public int getTotalPage() {
		if (rows % pageSize == 0) {
			totalPage = rows / pageSize;
		} else {
			totalPage = rows / pageSize + 1;
		}
		
		return totalPage;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
		
		if (currentPage > getTotalPage()) {
			currentPage = getTotalPage();
		}
	}

}

