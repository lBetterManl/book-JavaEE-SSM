/**
 * Project Name:spring-ssm-csrcbms
 * File Name:LoginInterceptor.java
 * Package Name:com.hbut.hanson.interceptor
 * Date:2018年4月11日下午6:04:08
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hbut.hanson.entity.Admin;

/**
 * ClassName:LoginInterceptor <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午6:04:08 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor  {

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
		
		Admin admin = (Admin) request.getSession().getAttribute("admin");
		if(admin == null) {
			response.sendRedirect(
				request.getContextPath() + "/login/toLogin");
			return false;
		} else {
			return true;
		}
	}

}

