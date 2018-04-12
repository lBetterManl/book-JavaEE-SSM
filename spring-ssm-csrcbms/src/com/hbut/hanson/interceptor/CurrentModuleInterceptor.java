/**
 * Project Name:spring-ssm-csrcbms
 * File Name:CurrentModuleInterceptor.java
 * Package Name:com.hbut.hanson.interceptor
 * Date:2018年4月11日下午6:00:33
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:CurrentModuleInterceptor <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午6:00:33 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 判断当前访问的功能模块拦截器
 */
public class CurrentModuleInterceptor implements HandlerInterceptor  {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {

		String url = request.getRequestURL().toString();
		int currentModule = 0;
		if (url.contains("role")) {
			currentModule = 1;
		} else if (url.contains("admin")) {
			currentModule = 2;
		} else if (url.contains("cost")) {
			currentModule = 3;
		} else if (url.contains("account")) {
			currentModule = 4;
		} else if (url.contains("service")) {
			currentModule = 5;
		} else if (url.contains("userInfo")) {
			currentModule = 8;
		} else if (url.contains("modifyPwd")) {
			currentModule = 9;
		}
		request.getSession().setAttribute("currentModule", currentModule);
		return true;
	}

}

