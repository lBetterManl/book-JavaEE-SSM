/**
 * Project Name:spring-ssm-csrcbms
 * File Name:UserController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午7:07:08
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * ClassName:UserController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午7:07:08 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("userPage")
public class UserController {

	@RequestMapping("/toModifyPwd")
	public String toModifyPwd() {
		return "admin/modifyPwd";
	}

	// 个人资料
	@RequestMapping("/toadminInfo")
	public String toadminInfo() {
		return "admin/adminInfo";
	}
}

