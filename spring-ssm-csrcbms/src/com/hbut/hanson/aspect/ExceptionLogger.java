/**
 * Project Name:spring-ssm-csrcbms
 * File Name:ExceptionLogger.java
 * Package Name:com.hbut.hanson.aspect
 * Date:2018年4月11日下午8:47:53
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.aspect;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.hbut.hanson.entity.Admin;

/**
 * ClassName:ExceptionLogger <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 记录异常日志. <br/>
 * Date:     2018年4月11日 下午8:47:53 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 AOP处理异常
 */

@Component
@Aspect
public class ExceptionLogger {
	
	@Resource
	private HttpServletRequest request;

	@Around("within(com.hbut.hanson.controller..*)")
	public Object log(ProceedingJoinPoint point) throws Exception {
		Object obj = null;
		try {
			obj = point.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
			// 记录错误日志
			Logger logger = Logger.getLogger(this.getClass());
			
			Admin admin = (Admin) request.getSession().getAttribute("admin");
			if(admin != null) {
				String className = point.getTarget().getClass().getName();
				String method = point.getSignature().getName();
				String date = new SimpleDateFormat(
						"yyyy-MM-dd hh:mm:ss").format(new Date());
				
				StringBuffer sb = new StringBuffer();
				sb.append("用户[").append(admin.getName()).append("], ");
				sb.append("IP[").append(request.getRemoteHost()).append("], ");
				sb.append("在[").append(date).append("], 执行[");
				sb.append(className).append(".").append(method);
				sb.append("]时，发生如下异常：");
				logger.error(sb.toString());
			}
			
			StackTraceElement[] elems = e.getStackTrace();
			for(StackTraceElement elem : elems) {
				logger.error("\t" + elem.toString());
			}
			
			// 抛出异常
			throw new Exception(e);
		}
		return obj;
	}

}

