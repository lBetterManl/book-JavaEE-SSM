/**
 * Project Name:spring-ssm-csrcbms
 * File Name:LoginController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月11日下午5:22:31
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbut.hanson.entity.Admin;
import com.hbut.hanson.entity.Module;
import com.hbut.hanson.service.AdminService;
import com.hbut.hanson.util.ImageUtil;

/**
 * ClassName:LoginController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年4月11日 下午5:22:31 <br/>
 * 
 * @author Hanson Yan
 * @since JDK 1.8
 * @see 登录
 */

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

	private final static int SUCCESS = 0;

	private final static int ADMIN_CODE_ERROR = 1;

	private final static int PASSWORD_ERROR = 2;

	private final static int IMAGE_CODE_ERROR = 3;


	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/toLogin")
	public String toLogin(HttpServletRequest request) {
		request.getSession().invalidate();
		return "main/login";
	}

	@RequestMapping("/toIndex")
	public String toLogin() {
		return "main/index";
	}

	@RequestMapping("/nopower")
	public String nopower() {
		return "main/nopower";
	}

	@RequestMapping("/error")
	public String error() {
		return "main/error";
	}

	@RequestMapping("/login")
	@ResponseBody
	public Map<String, Object> login(String adminCode, String password, String code, HttpSession session) {
		Map<String, Object> result = new HashMap<String, Object>();
		String imageCode = (String)session.getAttribute("imageCode");
		if (code==null || !code.equalsIgnoreCase(imageCode)) {
			result.put("flag", IMAGE_CODE_ERROR);
			return result;
		}
		
		Admin admin = adminService.findByCode(adminCode);
		if (admin==null) {
			result.put("flag", ADMIN_CODE_ERROR);
			return result;
		}else if (!admin.getPassword().equals(password)) {
			result.put("flag", PASSWORD_ERROR);
			return result;
		}else {
			session.setAttribute("admin", admin);
			List<Module> modules = adminService.findModulesByAdmin(admin.getAdminId());
			session.setAttribute("allModules", modules);
			result.put("flag", SUCCESS);
			return result;
		}
	}
	
	/**
	 * 产生登录页面验证码
	 */
	@RequestMapping("/createImage")
	public void createImage(
			HttpServletResponse response, HttpSession session)
			throws Exception {
		Map<String, BufferedImage> imageMap = ImageUtil.createImage();
		String code = imageMap.keySet().iterator().next();
		session.setAttribute("imageCode", code);
		
		BufferedImage image = imageMap.get(code);
		
		response.setContentType("image/jpeg");
		OutputStream ops = response.getOutputStream();
		ImageIO.write(image, "jpeg", ops);
		ops.close();
	}

}
