/**
 * Project Name:mybatis-mapper
 * File Name:Address.java
 * Package Name:com.hbut.hanson.domain
 * Date:2018年4月2日下午6:01:12
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.domain;
/**
 * ClassName:Address <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午6:01:12 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class Address {

	private int addrid;
	private String city;
	private String street;
	private String zip;
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [addrid=" + addrid + ", city=" + city + ", street=" + street + ", zip=" + zip + "]";
	}
	
}

