/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AdminController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午6:35:59
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.Role;
import com.hbut.hanson.entity.page.AdminPage;
import com.hbut.hanson.entity.page.RolePage;
import com.hbut.hanson.service.AdminService;
import com.hbut.hanson.service.RoleService;

/**
 * ClassName:AdminController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午6:35:59 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/admin")
@SessionAttributes("adminPage")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private RoleService roleService;
	
	@RequestMapping("/findAdmin")
	public String find(AdminPage page, Model model) {
		List<Admin> admins = adminService.findByPage(page);
		model.addAttribute("adminPage", page);
		model.addAttribute("admins", admins);

		List<Module> modules = roleService.findAllModules();
		model.addAttribute("modules", modules);
		return "admin/adminList";
	}
	
	@RequestMapping("/resetPassword")
	@ResponseBody
	public Map<String, Object> resetPassword(@RequestParam("ids") String ids) {
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("ids", buildIdList(ids));
		param.put("password", "123456");
		adminService.updatePassword(param);

		Map<String, Object> info = new HashMap<String, Object>();
		info.put("success", true);
		info.put("message", "重置密码成功！");
		return info;
	}

	private List<Integer> buildIdList(String ids) {
		if (ids == null || ids.length() == 0)
			return null;
		List<Integer> list = new ArrayList<Integer>();
		String[] idsArray = ids.split(",");
		for (String id : idsArray) {
			list.add(Integer.valueOf(id));
		}
		return list;
	}

	@RequestMapping("/toAddAdmin")
	public String toAdd(Model model) {
		RolePage page = new RolePage();
		page.setPageSize(100000);
		List<Role> roles = roleService.findByPage(page);
		model.addAttribute("roles", roles);
		return "admin/addAdmin";
	}

	@RequestMapping("/addAdmin")
	public String add(Admin admin, Model model) {
		admin.setEnrollDate(new Timestamp(System.currentTimeMillis()));
		adminService.saveAdmin(admin);

		List<Integer> roleIds = admin.getRoleIds();
		for (Integer roleId : roleIds) {
			Map<String, Object> adminRoles = new HashMap<String, Object>();
			adminRoles.put("adminId", admin.getAdminId());
			adminRoles.put("roleId", roleId);
			adminService.saveAdminRoles(adminRoles);
		}
		return "redirect:findAdmin";
	}

	@RequestMapping("/toUpdateAdmin")
	public String toUpdate(@RequestParam("id") int id, Model model) {
		RolePage page = new RolePage();
		page.setPageSize(100000);
		List<Role> roles = roleService.findByPage(page);
		model.addAttribute("roles", roles);

		Admin admin = adminService.findById(id);
		model.addAttribute("admin", admin);
		return "admin/updateAdmin";
	}

	@RequestMapping("/updateAdmin")
	public String update(Admin admin, Model model) {
		adminService.updateAdmin(admin);

		adminService.deleteAdminRoles(admin.getAdminId());

		List<Integer> roleIds = admin.getRoleIds();
		for (Integer roleId : roleIds) {
			Map<String, Object> adminRoles = new HashMap<String, Object>();
			adminRoles.put("adminId", admin.getAdminId());
			adminRoles.put("roleId", roleId);
			adminService.saveAdminRoles(adminRoles);
		}

		return "redirect:findAdmin";
	}

	@RequestMapping("/deleteAdmin")
	public String delete(@RequestParam("adminId") int id) {
		adminService.deleteAdminRoles(id);
		adminService.deleteAdmin(id);
		return "redirect:findAdmin";
	}

}

