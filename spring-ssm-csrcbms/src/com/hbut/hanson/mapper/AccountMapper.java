package com.hbut.hanson.mapper;

import java.util.List;

import com.hbut.hanson.entity.Account;
import com.hbut.hanson.entity.page.Page;

public interface AccountMapper {
    
	List<Account> findByPage(Page page);

	List<Account> findAll();
	
	int findRows(Page page);
	
	void updateStatus(Account account);
	
	Account findById(int id);

	void update(Account account);

	void save(Account account);
	
	Account findByIdcardNo(String idcardNo);
}