/**
 * Project Name:mybatis-mapper
 * File Name:Userinfo.java
 * Package Name:com.hbut.hanson.domain
 * Date:2018年4月2日下午5:59:51
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.domain;
/**
 * ClassName:Userinfo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午5:59:51 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class Userinfo {
	
	private int userid;
	private String username;
	private String password;
	
	/**
	 * Userinfo 一对一 Address
	 */
	private Address address;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Userinfo [userid=" + userid + ", username=" + username + ", password=" + password + ", address="
				+ address + "]";
	}
	
}

