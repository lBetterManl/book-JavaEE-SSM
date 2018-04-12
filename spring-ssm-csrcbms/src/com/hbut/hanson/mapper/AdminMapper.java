package com.hbut.hanson.mapper;

import java.util.List;
import java.util.Map;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.entity.Module;
import com.hbut.hanson.entity.page.Page;
import com.hbut.hanson.vo.AdminVo;

public interface AdminMapper {
	
	List<Admin> findByPage(Page page);

	int findRows(Page page);

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