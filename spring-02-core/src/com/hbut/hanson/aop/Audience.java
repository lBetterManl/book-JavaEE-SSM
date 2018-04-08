/**
 * Project Name:spring-02-core
 * File Name:Audience.java
 * Package Name:com.hbut.hanson.aop
 * Date:2018年4月7日下午3:04:51
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * ClassName:Audience <br/>
 * Date:     2018年4月7日 下午3:04:51 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 切面
 */

// 当前类是一个切面
@Aspect
@Component
public class Audience {
	
	// 注解在一个@Aspect切面内定义可重用的切点，方法实际内容并不重要，可以是空的仅供注解依附
	@Pointcut("execution(* com.hbut.hanson.aop.Performance.perform(..))")
	public void Performance(){
		
	}
	
	// 通知方法会将目标方法perform()封装起来
	@Before("execution(* com.hbut.hanson.aop.Performance.perform(..))")
	public void takeSeat(){
		System.out.println("观众落座");
	}
	
	@Before("execution(* com.hbut.hanson.aop.Performance.perform(..))")
	public void silenceMobile() {
		System.out.println("手机静音");
	}
	
	// 通知方法会在目标方法返回后调用
	@AfterReturning("execution(* com.hbut.hanson.aop.Performance.perform(..))")
	public void applaud() {
		System.out.println("鼓掌");
	}
	
	// 通知方法会在目标方法抛出异常后调用
	@AfterThrowing("execution(* com.hbut.hanson.aop.Performance.perform(..))")
	public void demandRefund(){
		System.out.println("不，请把钱退给我");
	}
	
}

