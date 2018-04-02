/**
 * Project Name:mybatis-mapper
 * File Name:UserinfoMapper.java
 * Package Name:com.hbut.hanson.mapper
 * Date:2018年4月2日下午7:22:49
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.mapper;
/**
 * ClassName:UserinfoMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午7:22:49 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 SQL语句必须使用数据库字段
 */

import java.util.List;

import com.hbut.hanson.domain.Userinfo;

public interface UserinfoMapper {
	
	// 直接查询		数据库字段不能封装在对象中
	public List<Userinfo> selectUserinfo();
	
	// SQL语句as成对象属性		结果能封装在对象中
	public Userinfo selectUserinfoById(Integer id);
	
	// 使用userinfoResultMap关系映射表		结果能封装在对象中
	public Userinfo selectUserinfoById2(Integer id);
	
	// 使用userinfoAndAddressResultMap关系映射表		关联查询
	public Userinfo selectUserinfoAndAddress(Integer id);
	
	// 使用userinfoAndAddressResultMap2关系映射表（associate方式）		关联查询
	public Userinfo selectUserinfoAndAddress2(Integer id);

}

