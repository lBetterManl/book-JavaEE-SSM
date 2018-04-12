/**
 * Project Name:spring-ssm-csrcbms
 * File Name:UserInfoController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午7:08:29
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.service.AdminService;

/**
 * ClassName:UserInfoController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年4月12日 下午7:08:29 <br/>
 * 
 * @author Hanson Yan
 * @since JDK 1.8
 * @see
 */
@Controller
@RequestMapping("/userInfo")
@SessionAttributes("userInfoPage")
public class UserInfoController {

	@Autowired
	private AdminService adminService;

	// 个人资料
	@RequestMapping("/touserInfo")
	public String toadminInfo() {
		return "admin/adminInfo";
	}

	@RequestMapping("/update")
	public String update(Admin admin, Model model, HttpSession session) {
		adminService.updateAdmin(admin);
		session.setAttribute("admin", adminService.findById(admin.getAdminId()));
		model.addAttribute("flag", true);
		return "admin/adminInfo";
	}
}
