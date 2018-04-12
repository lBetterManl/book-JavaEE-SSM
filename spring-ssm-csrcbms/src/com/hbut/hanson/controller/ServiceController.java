/**
 * Project Name:spring-ssm-csrcbms
 * File Name:ServiceController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午6:59:19
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hbut.hanson.entity.Account;
import com.hbut.hanson.entity.Cost;
import com.hbut.hanson.entity.Service;
import com.hbut.hanson.entity.page.ServicePage;
import com.hbut.hanson.service.AccountService;
import com.hbut.hanson.service.CostService;
import com.hbut.hanson.service.ServiceService;

/**
 * ClassName:ServiceController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午6:59:19 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/service")
@SessionAttributes("servicePage")
public class ServiceController {
	
	@Autowired
	private ServiceService serviceService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private CostService costService;
	
	@RequestMapping("/findService")
	public String find(ServicePage page, Model model) {
		page.setRows(serviceService.findRows(page));
		model.addAttribute("servicePagea", page);
		
		List<Map<String, Object>> list = 
				serviceService.findByPage(page);
		model.addAttribute("services", list);
		
		return "service/serviceList";
	}
	
	@RequestMapping("/startService")
	@ResponseBody
	public Map<String, Object> updateStart(@RequestParam("serviceId") int id) {
		 Map<String, Object> info = 
				new HashMap<String,Object>();
		
		//判断对应的账务账号是否处于开通态
		Service service = serviceService.findById(id);
		Account account = accountService.findById(service.getAccountId());
		if(!(account.getStatus()=='0')) {
			info.put("success", false);
			info.put("message", "帐务账号没有开通，不允许开通当前业务账号!");
			return info;
		}
		
		Service s = new Service();
		s.setServiceId(id);
		s.setStatus('0');
		try {
			serviceService.updateStatus(s);
			info.put("success", true);
			info.put("message", "开通成功!");
		} catch (Exception e) {
			e.printStackTrace();
			info.put("success", false);
			info.put("message", "开通失败，系统发生异常!");
		}
		
		return info;
	}
	
	@RequestMapping("/pauseService")
	@ResponseBody
	public Map<String, Object> updatePause(@RequestParam("serviceId") int id) {
		Map<String, Object> info = 
				new HashMap<String, Object>();
		
		Service s = new Service();
		s.setServiceId(id);
		s.setStatus('1');
		try {
			serviceService.updateStatus(s);
			info.put("success", true);
			info.put("message", "暂停成功!");
		} catch (Exception e) {
			e.printStackTrace();
			info.put("success", false);
			info.put("message", "暂停失败，系统发生异常!");
		}
		
		return info;
	}
	
	@RequestMapping("/deleteService")
	@ResponseBody
	public Map<String, Object> updateDelete(@RequestParam("serviceId") int id) {
		Map<String, Object> info = 
				new HashMap<String, Object>();
		
		Service s = new Service();
		s.setServiceId(id);
		s.setStatus('2');
		try {
			serviceService.updateStatus(s);
			info.put("success", true);
			info.put("message", "删除成功!");
		} catch (Exception e) {
			e.printStackTrace();
			info.put("success", false);
			info.put("message", "删除失败，系统发生异常!");
		}
		
		return info;
	}
	
	@RequestMapping("/toAddService")
	public String toAdd(Model model) {
		List<Cost> list = costService.findAll();
		List<Account> accounts = accountService.findAll();
		model.addAttribute("costs", list);
		model.addAttribute("accounts", accounts);
		return "service/addService";
	}
	
	@RequestMapping("/findAccount")
	@ResponseBody
	public Account findAccount(@RequestParam("idcardNo") String idcardNo) {
		return accountService.findByIdcardNo(idcardNo);
	}
	
	@RequestMapping("/addService")
	public String add(Service service) {
		service.setStatus('0');
		service.setCreateDate(
		new Timestamp(System.currentTimeMillis()));
		serviceService.save(service);
		return "redirect:findService";
	}
	
	@RequestMapping("/toUpdateService")
	public String toUpdate(@RequestParam("id") int id, Model model) {
		Service service = serviceService.findById(id);
		model.addAttribute("service", service);
		List<Cost> list = costService.findAll();
		model.addAttribute("costs", list);
		return "service/updateService";
	}
	
	@RequestMapping("/updateService")
	public String update(Service service) {
		serviceService.update(service);
		serviceService.insertUpdateBak(service);
		return "redirect:findService";
	}

}

