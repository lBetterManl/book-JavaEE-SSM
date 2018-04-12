/**
 * Project Name:spring-ssm-csrcbms
 * File Name:RoleController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午6:55:40
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

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

import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.Role;
import com.hbut.hanson.entity.page.RolePage;
import com.hbut.hanson.service.RoleService;

/**
 * ClassName:RoleController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年4月12日 下午6:55:40 <br/>
 * 
 * @author Hanson Yan
 * @since JDK 1.8
 * @see
 */
@Controller
@RequestMapping("/role")
@SessionAttributes("rolePage")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("/findRole")
	public String find(RolePage page, Model model) {
		List<Role> roles = roleService.findByPage(page);
		model.addAttribute("rolePage", page);
		model.addAttribute("roles", roles);

		return "role/roleList";
	}

	@RequestMapping("/toAddRole")
	public String toAdd(Model model) {
		List<Module> modules = roleService.findAllModules();
		model.addAttribute("modules", modules);
		return "role/addRole";
	}

	@RequestMapping("/addRole")
	public String add(Role role, Model model) {
		roleService.saveRole(role);

		List<Integer> moduleIds = role.getModuleIds();
		for (Integer moduleId : moduleIds) {
			Map<String, Object> roleModules = new HashMap<String, Object>();
			roleModules.put("roleId", role.getRoleId());
			roleModules.put("moduleId", moduleId);
			roleService.saveRoleModules(roleModules);
		}
		return "redirect:findRole";
	}

	@RequestMapping("/toUpdateRole")
	public String toUpdate(@RequestParam("id") int id, Model model) {
		List<Module> modules = roleService.findAllModules();
		model.addAttribute("modules", modules);
		Role role = roleService.findById(id);
		model.addAttribute("role", role);
		return "role/updateRole";
	}

	@RequestMapping("/updateRole")
	public String update(Role role, Model model) {
		roleService.updateRole(role);

		roleService.deleteRoleModules(role.getRoleId());

		List<Integer> moduleIds = role.getModuleIds();
		for (Integer moduleId : moduleIds) {
			Map<String, Object> roleModules = new HashMap<String, Object>();
			roleModules.put("roleId", role.getRoleId());
			roleModules.put("moduleId", moduleId);
			roleService.saveRoleModules(roleModules);
		}

		return "redirect:findRole";
	}

	@RequestMapping("/deleteRole")
	public String delete(@RequestParam("id") int id) {
		roleService.deleteRoleModules(id);
		roleService.deleteRole(id);
		return "redirect:findRole";
	}

	@RequestMapping("/checkRoleName")
	@ResponseBody
	public boolean checkName(String name) {
		Role role = roleService.findByName(name);
		if (role == null)
			return true;
		else
			return false;
	}

}
