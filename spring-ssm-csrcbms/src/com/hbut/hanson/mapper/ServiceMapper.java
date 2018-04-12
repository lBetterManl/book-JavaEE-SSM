package com.hbut.hanson.mapper;

import java.util.List;
import java.util.Map;

import com.hbut.hanson.entity.Service;
import com.hbut.hanson.entity.page.Page;

public interface ServiceMapper {
	
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