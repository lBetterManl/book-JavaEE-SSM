/**
 * Project Name:mybatis-mapper
 * File Name:Department.java
 * Package Name:com.hbut.hanson.domain
 * Date:2018年4月2日下午8:49:56
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.domain;
/**
 * ClassName:Department <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午8:49:56 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */

import java.util.List;

public class Department {

	private int depid;
	private String depname;
	private List<Employee> employees;
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Department [depid=" + depid + ", depname=" + depname + ", employees=" + employees + "]";
	}
	
}

