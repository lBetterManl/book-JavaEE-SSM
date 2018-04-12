package com.hbut.hanson.entity;

import java.sql.Timestamp;
import java.util.List;


/**
 * ClassName: Admin <br/>
 * date: 2018年4月11日 下午4:25:58 <br/>
 *
 * @author Hanson
 * @since JDK 1.8
 * @see 管理员
 */
public class Admin {
    private Integer adminId;//管理员Id

    private String adminCode;//管理员账号

    private String password;//密码

    private String name;//名称

    private String telephone;//电话

    private String email;//邮箱

    private Timestamp enrollDate;//注册时间
    
    private List<Role> roles;//角色列表
    
    private List<Integer> roleIds;//角色Id列表

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Timestamp enrollDate) {
		this.enrollDate = enrollDate;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Integer> getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminCode=" + adminCode + ", password=" + password + ", name=" + name
				+ ", telephone=" + telephone + ", email=" + email + ", enrollDate=" + enrollDate + "]";
	}
       
}