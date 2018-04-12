/**
 * Project Name:spring-ssm-csrcbms
 * File Name:RoleServiceImpl.java
 * Package Name:com.hbut.hanson.service.impl
 * Date:2018年4月12日下午5:20:05
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.Role;
import com.hbut.hanson.entity.page.RolePage;
import com.hbut.hanson.mapper.RoleMapper;
import com.hbut.hanson.service.RoleService;

/**
 * ClassName:RoleServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午5:20:05 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<Role> findByPage(RolePage page) {
		page.setRows(this.findRows(page));
		return roleMapper.findByPage(page);
	}

	@Override
	public int findRows(RolePage page) {

		return roleMapper.findRows(page);
	}

	@Override
	public List<Module> findAllModules() {

		return roleMapper.findAllModules();
	}

	@Override
	public Role findById(int id) {

		return roleMapper.findById(id);
	}

	@Override
	public int saveRole(Role role) {

		return roleMapper.saveRole(role);
	}

	@Override
	public void saveRoleModules(Map<String, Object> roleModules) {
		
		roleMapper.saveRoleModules(roleModules);
		
	}

	@Override
	public void updateRole(Role role) {
		
		roleMapper.updateRole(role);
		
	}

	@Override
	public void deleteRoleModules(int roleId) {
		
		roleMapper.deleteRoleModules(roleId);
		
	}

	@Override
	public void deleteRole(int roleId) {
		
		roleMapper.deleteRole(roleId);
		
	}

	@Override
	public Role findByName(String name) {

		return roleMapper.findByName(name);
	}

	@Override
	public List<Module> selectModules(int roleId) {
	
		return roleMapper.selectModules(roleId);
	}

}

