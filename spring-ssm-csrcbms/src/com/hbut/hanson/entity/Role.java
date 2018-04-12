package com.hbut.hanson.entity;

import java.util.List;

/** 
 * ClassName: Role <br/>
 * date: 2018年4月11日 下午4:40:47 <br/>
 *
 * @author Hanson
 * @version 
 * @since JDK 1.8
 * @see 角色
 */
public class Role {
    private Integer roleId;

    private String name;

    private List<Module> modules;
    
    private List<Integer> moduleIds;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public List<Integer> getModuleIds() {
		return moduleIds;
	}

	public void setModuleIds(List<Integer> moduleIds) {
		this.moduleIds = moduleIds;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name + "]";
	}
    
}