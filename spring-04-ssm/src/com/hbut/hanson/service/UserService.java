/**
 * Project Name:spring-04-ssm
 * File Name:UserService.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月11日下午1:30:52
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service;

import com.hbut.hanson.entity.User;

/**
 * ClassName:UserService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午1:30:52 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public interface UserService {
	
	int deleteUserById(Integer id);

    int insertUser(User user);

    int insertUserSelective(User user);

    User selectUserById(Integer id);

    int updateUserSelective(User user);

    int updateUser(User user);

}

