/**
 * Project Name:spring-ssm-csrcbms
 * File Name:CostService.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月12日下午4:49:51
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service;

import java.util.List;

import com.hbut.hanson.entity.Cost;
import com.hbut.hanson.entity.page.CostPage;

/**
 * ClassName:CostService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午4:49:51 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public interface CostService {
	
List<Cost> findAll();
	
	void save(Cost cost);
	
	Cost findById(Integer costId);
	
	void update(Cost cost); 
	
	void delete(Integer costId);
	
	List<Cost> findByPage(CostPage page);
	
	int findRows(CostPage page);
	
	void startFee(Cost cost);

}

