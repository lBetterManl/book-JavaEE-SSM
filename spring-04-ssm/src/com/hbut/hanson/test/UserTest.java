/**
 * Project Name:spring-04-ssm
 * File Name:UserTest.java
 * Package Name:com.hbut.hanson.test
 * Date:2018年4月11日下午1:41:08
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hbut.hanson.entity.User;
import com.hbut.hanson.service.UserService;


/**
 * ClassName:UserTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午1:41:08 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class UserTest {

	private static Logger logger = Logger.getLogger(UserTest.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test1(){
		System.out.println(userService);
		User user = userService.selectUserById(1);
		logger.info(user.getUserName());
	}
	
	@Test
	public void test2(){
		User user = userService.selectUserById(1);
		user.setPassword("gg");
		userService.updateUserSelective(user);
		logger.info(user.getPassword());
	}
}

