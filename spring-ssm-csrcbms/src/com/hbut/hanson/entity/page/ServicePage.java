/**
 * Project Name:spring-ssm-csrcbms
 * File Name:ServicePage.java
 * Package Name:com.hbut.hanson.entity.page
 * Date:2018年4月11日下午8:41:53
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.entity.page;
/**
 * ClassName:ServicePage <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午8:41:53 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class ServicePage extends Page {

	private String serverUserName;
	private String hostIp;
	private String idcardNo;
	private String status;
	public String getServerUserName() {
		return serverUserName;
	}
	public void setServerUserName(String serverUserName) {
		this.serverUserName = serverUserName;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getIdcardNo() {
		return idcardNo;
	}
	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}

