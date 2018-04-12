package com.hbut.hanson.mapper;

import java.util.List;

import com.hbut.hanson.entity.Cost;
import com.hbut.hanson.entity.page.Page;

public interface CostMapper {
	
	List<Cost> findAll();
	
	void save(Cost cost);
	
	Cost findById(Integer costId);
	
	void update(Cost cost); 
	
	void delete(Integer costId);
	
	List<Cost> findByPage(Page page);
	
	int findRows(Page page);
	
	void startFee(Cost cost);
}