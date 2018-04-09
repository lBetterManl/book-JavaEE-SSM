/**
 * Project Name:spring-03-mvc
 * File Name:UserController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月9日上午9:48:31
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:UserController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月9日 上午9:48:31 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
	/* SpringMVC在调用目标处理方法之前，会先逐个调用标注了@ModelAttribute的方法 */
	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){
		this.request = request;
		this.response = response;
		this.session = request.getSession();
	}
	
	@RequestMapping("/showUser")
	public String showUser(){
		return "ShowUser";
	}
	
	@RequestMapping("/showUser2")
	public ModelAndView showUser2(){
		return new ModelAndView("ShowUser2", "message", "来自showUser2的消息");
	}
	
	@RequestMapping(value="/deleteUser/{userId}", method=RequestMethod.GET)
	public String deleteUser(@PathVariable String userId, ModelMap model){
		model.addAttribute("message", "删除userId为"+userId+"的User");
		return "ShowUser2";
	}
	
	@RequestMapping(value="/updateUser/{userBirth:\\d{4}-\\d{2}-\\d{2}}")
	public String updateUser(@PathVariable String userBirth, ModelMap model){
		model.addAttribute("message", "更新Birth为"+userBirth+"的User");
		return "ShowUser2";
	}
	
	@RequestMapping("/addUser")
	public String addUser(){
		return "AddUser";
	}
	
	@RequestMapping(value="/saveUser", method=RequestMethod.POST)
	public String saveUser(Model model, @ModelAttribute("name")String nickname, Integer age){
		model.addAttribute("message", "添加User[name:"+nickname+", age:"+age+"]");
		return "ShowUser2";
	}

}

