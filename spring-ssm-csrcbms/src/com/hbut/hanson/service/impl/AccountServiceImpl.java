/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AccountServiceImpl.java
 * Package Name:com.hbut.hanson.service.impl
 * Date:2018年4月11日下午7:10:57
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbut.hanson.entity.Account;
import com.hbut.hanson.entity.page.AccountPage;
import com.hbut.hanson.mapper.AccountMapper;
import com.hbut.hanson.service.AccountService;

/**
 * ClassName:AccountServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午7:10:57 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public List<Account> findByPage(AccountPage page) {
		page.setRows(this.findRows(page));//设置查询结果数量+当前页+总共页数
		return accountMapper.findByPage(page);
	}

	@Override
	public List<Account> findAll() {

		return accountMapper.findAll();
	}

	@Override
	public int findRows(AccountPage page) {

		return accountMapper.findRows(page);
	}

	@Override
	public void updateStatus(Account account) {
		
		accountMapper.updateStatus(account);
		
	}

	@Override
	public Account findById(int id) {

		return accountMapper.findById(id);
	}

	@Override
	public void update(Account account) {
		
		accountMapper.update(account);
		
	}

	@Override
	public void save(Account account) {
		
		accountMapper.save(account);
		
	}

	@Override
	public Account findByIdcardNo(String idcardNo) {

		return accountMapper.findByIdcardNo(idcardNo);
	}
	
	

}

