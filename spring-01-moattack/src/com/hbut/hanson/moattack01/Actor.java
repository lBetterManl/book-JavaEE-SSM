/**
 * Project Name:spring-01-moattack
 * File Name:Actor.java
 * Package Name:com.hbut.hanson.moattack01
 * Date:2018年4月3日下午5:52:19
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.moattack01;
/**
 * ClassName:Actor <br/>
 * Date:     2018年4月3日 下午5:52:19 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 演员
 */
public class Actor {
	
	private String name;
	
	public void responseAsk(String s){
		System.out.println("我是"+s);
	}

	public Actor(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

