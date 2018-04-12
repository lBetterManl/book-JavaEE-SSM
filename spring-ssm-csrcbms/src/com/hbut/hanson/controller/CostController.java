/**
 * Project Name:spring-ssm-csrcbms
 * File Name:CostController.java
 * Package Name:com.hbut.hanson.controller
 * Date:2018年4月12日下午6:43:58
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
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hbut.hanson.entity.Cost;
import com.hbut.hanson.entity.page.CostPage;
import com.hbut.hanson.service.CostService;

/**
 * ClassName:CostController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月12日 下午6:43:58 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@Controller
@RequestMapping("/cost")
@SessionAttributes("costPage")
public class CostController {
	
	@Autowired
	private CostService costService;

	@RequestMapping("/findCost")
	public String find(CostPage page, Model model) {
		if(page.getBaseCostSort()==""){
			page.setBaseCostSort("desc");
		}
		if (page.getBaseDurationSort()=="") {
			page.setBaseDurationSort("desc");
		}

		List<Cost> list = costService.findByPage(page);
		model.addAttribute("costPage", page);
		model.addAttribute("costs", list);
		
		return "cost/costList";
	}
	
	@RequestMapping("/toAddCost")
	public String toAdd() {
		return "cost/addCost";
	}
	
	@RequestMapping("/addCost")
	public String add(Cost cost) {
		cost.setStatus("1");
		cost.setCreatTime(
			new Timestamp(System.currentTimeMillis()));
		costService.save(cost);
		return "redirect:findCost";
	}
	
	@RequestMapping("/toUpdateCost")
	public String toUpdate(
		@RequestParam("id") int id, Model model) {
		Cost cost = costService.findById(id);
		model.addAttribute("cost", cost);
		return "cost/updateCost";
	}

	@RequestMapping("/updateCost")
	public String update(Cost cost) {
		costService.update(cost);
		return "redirect:findCost";
	}
	
	@RequestMapping("/deleteCost")
	public String delete(@RequestParam("id") int id) {
		costService.delete(id);
		return "redirect:findCost";
	}
	@RequestMapping("/startFee")
	public String startFee(int id) {
		Cost cost = new Cost();
		cost.setCostId(id);
		cost.setStatus("1");
		costService.startFee(cost);
		return "redirect:findCost";
	}
}

