/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AccountController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午5:48:08
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hbut.hanson.entity.Account;
import com.hbut.hanson.entity.page.AccountPage;
import com.hbut.hanson.service.AccountService;
import com.hbut.hanson.service.ServiceService;

/**
 * ClassName:AccountController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午5:48:08 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/account")
@SessionAttributes("accountPage")
public class AccountController extends BaseController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private ServiceService serviceService;
	
	@RequestMapping("/findAccount")
	public String find(AccountPage page, Model model){
		List<Account> list = accountService.findByPage(page);
		model.addAttribute("accountPage", page);
		model.addAttribute("accountList", list);
		return "account/accountList";
	}
	
	@RequestMapping("/startAccount")
	public String updateStart(@RequestParam("accountId")int id){
		Account account = new Account();
		account.setAccountId(id);
		account.setStatus(0);
		accountService.updateStatus(account);
		return "redirect:findAccount";
	}
	
	@RequestMapping("/pauseAccount")
	public String updatePause(@RequestParam("accountId")int id){
		Account account = new Account();
		account.setAccountId(id);
		account.setStatus(1);
		accountService.updateStatus(account);
		//暂停其下属的业务账号
		serviceService.pauseByAccount(id);
		return "redirect:findAccount";
	}
	
	@RequestMapping("/deleteAccount")
	public String updateDelete(@RequestParam("accountId")int id){
		Account account = new Account();
		account.setAccountId(id);
		account.setStatus(2);
		accountService.updateStatus(account);
		//暂停其下属的业务账号
		serviceService.deleteByAccount(id);
		return "redirect:findAccount";
	}
	
	@RequestMapping("/toUpdateAccount")
	public String toUpdate(@RequestParam("accountId") int id, Model model){
		Account account = accountService.findById(id);
		model.addAttribute("account", account);
		return "account/updateAccount";
	}
	
	@RequestMapping("/updateAccount")
	public String update(Account account) {
		accountService.update(account);
		return "redirect:findAccount";
	}
	
	@RequestMapping("/toAddAccount")
	public String toAdd() {
		return "account/addAccount";
	}
	
	@RequestMapping("/addAccount")
	public String add(Account account) {
		account.setStatus(0);
		account.setCreateDate(new Timestamp(System.currentTimeMillis()));
		accountService.save(account);
		return "redirect:findAccount";
	}
	
	@RequestMapping("/searchAccount")
	@ResponseBody
	public Account searchAccount(String idcardNo) {
		return accountService.findByIdcardNo(idcardNo);
	}
}

