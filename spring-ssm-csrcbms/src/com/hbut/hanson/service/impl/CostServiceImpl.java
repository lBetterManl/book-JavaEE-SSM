/**
 * Project Name:spring-ssm-csrcbms
 * File Name:CostServiceImpl.java
 * Package Name:com.hbut.hanson.service.impl
 * Date:2018年4月12日下午4:50:15
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbut.hanson.entity.Cost;
import com.hbut.hanson.entity.page.CostPage;
import com.hbut.hanson.mapper.CostMapper;
import com.hbut.hanson.service.CostService;

/**
 * ClassName:CostServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午4:50:15 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Service
public class CostServiceImpl implements CostService {
	
	@Autowired
	private CostMapper costMapper;

	@Override
	public List<Cost> findAll() {

		return costMapper.findAll();
	}

	@Override
	public void save(Cost cost) {
		
		costMapper.save(cost);
		
	}

	@Override
	public Cost findById(Integer costId) {

		return costMapper.findById(costId);
	}

	@Override
	public void update(Cost cost) {
		
		costMapper.update(cost);
		
	}

	@Override
	public void delete(Integer costId) {
		
		costMapper.delete(costId);
		
	}

	@Override
	public List<Cost> findByPage(CostPage page) {
		page.setRows(this.findRows(page));
		return costMapper.findByPage(page);
	}

	@Override
	public int findRows(CostPage page) {
	
		return costMapper.findRows(page);
	}

	@Override
	public void startFee(Cost cost) {
		
		costMapper.startFee(cost);
		
	}

}

