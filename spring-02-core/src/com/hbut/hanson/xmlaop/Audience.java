/**
 * Project Name:spring-02-core
 * File Name:Audience.java
 * Package Name:com.hbut.hanson.xmlaop
 * Date:2018年4月7日下午5:26:50
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.xmlaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ClassName:Audience <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月7日 下午5:26:50 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Aspect
@Component
public class Audience {
	
	public void takeSeat(){
		System.out.println("观众落座");
	}
	
	public void silenceMobile() {
		System.out.println("手机静音");
	}
	
	public void applaud() {
		System.out.println("鼓掌");
	}
	
	public void demandRefund(){
		System.out.println("不，请把钱退给我");
	}
	
	// 声明环绕通知
	public void watchPerform(ProceedingJoinPoint pjp){
		try {
			System.out.println("观众落座");
			System.out.println("手机静音");
			pjp.proceed();
			System.out.println("鼓掌");
		} catch (Throwable e) {
			System.out.println("不，把钱退给我！");
		}
	}
}

