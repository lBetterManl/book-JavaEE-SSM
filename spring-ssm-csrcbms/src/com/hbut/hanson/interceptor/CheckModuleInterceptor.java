/**
 * Project Name:spring-ssm-csrcbms
 * File Name:CheckModuleInterceptor.java
 * Package Name:com.hbut.hanson.interceptor
 * Date:2018年4月11日下午5:56:34
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.hbut.hanson.entity.Module;

/**
 * ClassName:CheckModuleInterceptor <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年4月11日 下午5:56:34 <br/>
 * 
 * @author Hanson Yan
 * @since JDK 1.8
 * @see 功能模块拦截器
 */
public class CheckModuleInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		List<Module> modules = (List<Module>) request.getSession().getAttribute("allModules");
		int currentModule = (Integer) request.getSession().getAttribute("currentModule");
		for (Module module : modules) {
			if (module.getModuleId() == currentModule) {
				return true;
			}
		}
		response.sendRedirect(request.getContextPath() + "/login/nopower");
		return false;
	}

}
