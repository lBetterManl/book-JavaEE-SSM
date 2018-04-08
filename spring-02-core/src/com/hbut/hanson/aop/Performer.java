/**
 * Project Name:spring-02-core
 * File Name:Performer.java
 * Package Name:com.hbut.hanson.aop
 * Date:2018年4月7日下午3:42:34
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.aop;
/**
 * ClassName:Performer <br/>
 * Date:     2018年4月7日 下午3:42:34 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 演员
 */
public class Performer implements Performance {

	@Override
	public void perform() {

		System.out.println("正在表演！");

	}

}

