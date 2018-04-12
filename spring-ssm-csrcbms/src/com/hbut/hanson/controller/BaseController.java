/**
 * Project Name:spring-ssm-csrcbms
 * File Name:BaseController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月11日下午5:17:14
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.hbut.hanson.util.DateEditor;

/**
 * ClassName:BaseController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午5:17:14 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class BaseController {

	@InitBinder
	protected void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(
				java.sql.Date.class, new DateEditor());
	}
}

