/**
 * Project Name:spring-02-core
 * File Name:Player.java
 * Package Name:com.hbut.hanson.aop
 * Date:2018年4月7日下午4:45:29
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.xmlaop;

/**
 * ClassName:Player <br/>
 * Date:     2018年4月7日 下午4:45:29 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */

public class Player implements Performance {
	
	private String name;
	private String subject;

	@Override
	public void perform() {
		
		System.out.println(name+" 正在挑战 "+subject);
		
	}

}

