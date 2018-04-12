/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AdminPage.java
 * Package Name:com.hbut.hanson.entity.page
 * Date:2018年4月11日下午8:35:29
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.entity.page;
/**
 * ClassName:AdminPage <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午8:35:29 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class AdminPage extends Page {
	
	private String roleName;
	private Integer moduleId;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

}

