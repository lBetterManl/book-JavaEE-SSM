/**
 * Project Name:spring-ssm-csrcbms
 * File Name:ServiceServiceImpl.java
 * Package Name:com.hbut.hanson.service.impl
 * Date:2018年4月12日下午5:25:58
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbut.hanson.entity.page.Page;
import com.hbut.hanson.mapper.ServiceMapper;
import com.hbut.hanson.service.ServiceService;

/**
 * ClassName:ServiceServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午5:25:58 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Service
public class ServiceServiceImpl implements ServiceService {

	@Autowired
	private ServiceMapper serviceMapper;
	
	@Override
	public List<Map<String, Object>> findByPage(Page page) {

		return serviceMapper.findByPage(page);
	}

	@Override
	public int findRows(Page page) {

		return serviceMapper.findRows(page);
	}

	@Override
	public void updateStatus(com.hbut.hanson.entity.Service service) {
		
		serviceMapper.updateStatus(service);
		
	}

	@Override
	public void pauseByAccount(int accountId) {
		
		serviceMapper.pauseByAccount(accountId);
		
	}

	@Override
	public void deleteByAccount(int accountId) {
		
		serviceMapper.deleteByAccount(accountId);
		
	}

	@Override
	public com.hbut.hanson.entity.Service findById(int id) {
		
		return serviceMapper.findById(id);
	}

	@Override
	public void save(com.hbut.hanson.entity.Service service) {
		
		serviceMapper.save(service);
		
	}

	@Override
	public void update(com.hbut.hanson.entity.Service service) {
		
		serviceMapper.update(service);
		
	}

	@Override
	public void insertUpdateBak(com.hbut.hanson.entity.Service service) {
		
		serviceMapper.insertUpdateBak(service);
		
	}

}

