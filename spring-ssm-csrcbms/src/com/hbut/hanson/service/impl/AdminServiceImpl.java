/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AdminServiceImpl.java
 * Package Name:com.hbut.hanson.service.impl
 * Date:2018年4月11日下午5:12:13
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.page.AdminPage;
import com.hbut.hanson.mapper.AdminMapper;
import com.hbut.hanson.service.AdminService;
import com.hbut.hanson.vo.AdminVo;

/**
 * ClassName:AdminServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午5:12:13 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	@Override
	public List<Admin> findByPage(AdminPage page) {
		page.setRows(this.findRows(page));
		return adminMapper.findByPage(page);
	}

	@Override
	public int findRows(AdminPage page) {

		return adminMapper.findRows(page);
	}

	@Override
	public void updatePassword(Map<String, Object> param) {
		
		adminMapper.updatePassword(param);
		
	}

	@Override
	public Admin findById(int id) {

		return adminMapper.findById(id);
	}

	@Override
	public void saveAdmin(Admin admin) {
		
		adminMapper.saveAdmin(admin);
		
	}

	@Override
	public void saveAdminRoles(Map<String, Object> adminRoles) {
		
		adminMapper.saveAdminRoles(adminRoles);
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		
		adminMapper.updateAdmin(admin);
		
	}

	@Override
	public void deleteAdminRoles(int adminId) {
		
		adminMapper.deleteAdminRoles(adminId);
		
	}

	@Override
	public void deleteAdmin(int id) {
		
		adminMapper.deleteAdmin(id);
		
	}

	@Override
	public Admin findByCode(String adminCode) {
		
		return adminMapper.findByCode(adminCode);
	}

	@Override
	public List<Module> findModulesByAdmin(int adminId) {

		return adminMapper.findModulesByAdmin(adminId);
	}

	@Override
	public void updateByPassword(Admin admin) {
		
		adminMapper.updateByPassword(admin);
		
	}

	@Override
	public List<AdminVo> findByList(AdminVo admin) {
		
		return adminMapper.findByList(admin);
	}

	

}

