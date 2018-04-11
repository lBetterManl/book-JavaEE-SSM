/**
 * Project Name:spring-04-ssm
 * File Name:UserServiceImpl.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月11日下午1:32:04
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbut.hanson.entity.User;
import com.hbut.hanson.mapper.UserMapper;
import com.hbut.hanson.service.UserService;

/**
 * ClassName:UserServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午1:32:04 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public int deleteUserById(Integer id) {
		
		return userMapper.deleteUserById(id);
	}

	@Override
	public int insertUser(User user) {
		
		return userMapper.insertUser(user);
	}

	@Override
	public int insertUserSelective(User user) {
		
		return userMapper.insertUserSelective(user);
	}

	@Override
	public User selectUserById(Integer id) {
		
		return userMapper.selectUserById(id);
	}

	@Override
	public int updateUserSelective(User user) {
		
		return userMapper.updateUserSelective(user);
	}

	@Override
	public int updateUser(User user) {
		
		return userMapper.updateUser(user);
	}

}

