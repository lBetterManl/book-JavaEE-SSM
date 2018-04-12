/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AdminService.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月11日下午5:09:52
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service;

import java.util.List;
import java.util.Map;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.page.AdminPage;
import com.hbut.hanson.vo.AdminVo;

/**
 * ClassName:AdminService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午5:09:52 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public interface AdminService {
	
	List<Admin> findByPage(AdminPage page);

	int findRows(AdminPage page);

	void updatePassword(Map<String, Object> param);

	Admin findById(int id);

	void saveAdmin(Admin admin);

	void saveAdminRoles(Map<String, Object> adminRoles);

	void updateAdmin(Admin admin);

	void deleteAdminRoles(int adminId);

	void deleteAdmin(int id);
	
	Admin findByCode(String adminCode);
	
	List<Module> findModulesByAdmin(int adminId);
	
	void updateByPassword(Admin admin );
	
	List<AdminVo> findByList(AdminVo admin);
}

