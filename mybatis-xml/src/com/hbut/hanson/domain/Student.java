/**
 * Project Name:mybatis-xml
 * File Name:Student.java
 * Package Name:com.hbut.hanson.domain
 * Date:2018年4月2日下午2:28:03
 * Copyright (c) 2018, yhc8023tm@foxmail.com All Rights Reserved.
 *
*/

package com.hbut.hanson.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * ClassName:Student <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午2:28:03 <br/>
 * @author   Hanson
 * @since    JDK 1.8
 * @see 	 
 */
public class Student {
	private int stuid;
	private String stuname;
	private LocalDate createDate;
	private LocalTime createTime;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public LocalTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(LocalTime createTime) {
		this.createTime = createTime;
	}
	public Student() {
		super();
	}
	public Student(int stuid, String stuname, LocalDate createDate, LocalTime createTime) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.createDate = createDate;
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", stuname=" + stuname + ", createDate=" + createDate + ", createTime="
				+ createTime + "]";
	}
	
}

