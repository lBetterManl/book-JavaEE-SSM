/**
 * Project Name:spring-ssm-csrcbms
 * File Name:ModifyPwdController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午6:49:30
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.service.AdminService;

/**
 * ClassName:ModifyPwdController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年4月12日 下午6:49:30 <br/>
 * 
 * @author Hanson Yan
 * @since JDK 1.8
 * @see
 */
@Controller
@RequestMapping("/modifyPwd")
public class ModifyPwdController {

	@Autowired
	private AdminService adminService;

	// 修改密码
	@RequestMapping("/toModifyPwd")
	public String toModifyPwd() {
		return "admin/modifyPwd";
	}

	@RequestMapping("/ModifyPwd")
	public String modifyPwd(String adminCode, String oldPassword, String newPassword, HttpSession session) {
		Admin admin = adminService.findByCode(adminCode);
		if (admin.getPassword().equals(oldPassword)) {
			admin.setPassword(newPassword);
			adminService.updateByPassword(admin);
			session.removeAttribute("admin");
			return "redirect:/login/toLogin";
		} else {
			return "main/error";
		}
	}

}
