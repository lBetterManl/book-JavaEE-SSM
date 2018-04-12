package com.hbut.hanson.mapper;

import java.util.List;
import java.util.Map;

import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.Role;
import com.hbut.hanson.entity.page.Page;

public interface RoleMapper {
	List<Role> findByPage(Page page);

	int findRows(Page page);
	
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