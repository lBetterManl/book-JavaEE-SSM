/**
 * Project Name:spring-ssm-csrcbms
 * File Name:ServiceService.java
 * Package Name:com.hbut.hanson.service
 * Date:2018年4月12日下午5:25:32
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.service;

import java.util.List;
import java.util.Map;

import com.hbut.hanson.entity.Service;
import com.hbut.hanson.entity.page.Page;

/**
 * ClassName:ServiceService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午5:25:32 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public interface ServiceService {
	
	List<Map<String, Object>> findByPage(Page page);

	int findRows(Page page);
	
	void updateStatus(Service service);
	
	void pauseByAccount(int accountId);
	
	void deleteByAccount(int accountId);
	
	Service findById(int id);
	
	void save(Service service);
	
	void update(Service service);

	void insertUpdateBak(Service service);

}

