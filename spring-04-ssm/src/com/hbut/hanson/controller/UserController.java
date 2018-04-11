/**
 * Project Name:spring-04-ssm
 * File Name:UserController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月11日下午1:40:15
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbut.hanson.entity.User;
import com.hbut.hanson.service.UserService;

/**
 * ClassName:UserController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午1:40:15 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/showUser/{userId}", method=RequestMethod.GET)
	public String toIndex(@PathVariable int userId, Model model){
		User user = userService.selectUserById(userId);
		model.addAttribute("user", user);
		return "ShowUser";
	}
	
	@RequestMapping(value="/updateUser", method=RequestMethod.POST)
	public String updateUser(User user){
		userService.updateUserSelective(user);
		return "ShowUser";
	}
	
	@RequestMapping(value="/getUser/{userId}", method=RequestMethod.GET)
	@ResponseBody
	public User getUser(@PathVariable int userId){
		User user = userService.selectUserById(userId);
		return user;
	}

}

