/**
 * Project Name:spring-ssm-csrcbms
 * File Name:RoleService.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月12日下午5:19:38
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service;

import java.util.List;
import java.util.Map;

import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.Role;
import com.hbut.hanson.entity.page.RolePage;

/**
 * ClassName:RoleService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午5:19:38 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public interface RoleService {
	
	List<Role> findByPage(RolePage page);

	int findRows(RolePage page);
	
	List<Module> findAllModules();
	
	Role findById(int id);
	
	int saveRole(Role role);
	
	void saveRoleModules(Map<String,Object> roleModules);
	
	void updateRole(Role role);
	
	void deleteRoleModules(int roleId);
	
	void deleteRole(int roleId);
	
	Role findByName(String name);
	
	List<Module> selectModules(int roleId);

}

