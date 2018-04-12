/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AccountService.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月11日下午7:10:13
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service;

import java.util.List;

import com.hbut.hanson.entity.Account;
import com.hbut.hanson.entity.page.AccountPage;

/**
 * ClassName:AccountService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午7:10:13 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public interface AccountService {

	List<Account> findByPage(AccountPage page);

	List<Account> findAll();
	
	int findRows(AccountPage page);
	
	void updateStatus(Account account);
	
	Account findById(int id);

	void update(Account account);

	void save(Account account);
	
	Account findByIdcardNo(String idcardNo);
}

