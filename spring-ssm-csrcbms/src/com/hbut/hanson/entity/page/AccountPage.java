/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AccountPage.java
 * Package Name:com.hbut.hanson.entity.page
 * Date:2018年4月11日下午8:38:03
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.entity.page;
/**
 * ClassName:AccountPage <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午8:38:03 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class AccountPage extends Page {

	private String idcardNo;
	private String realName;
	private String loginUserName;
	private String status;
	public String getIdcardNo() {
		return idcardNo;
	}
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getLoginUserName() {
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

