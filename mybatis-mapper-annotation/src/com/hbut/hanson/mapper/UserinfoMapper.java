/**
 * Project Name:mybatis-mapper-annotation
 * File Name:UserinfoMapper.java
 * Package Name:com.hbut.hanson.mapper
 * Date:2018年4月3日上午8:42:00
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.mapper;
/**
 * ClassName:UserinfoMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月3日 上午8:42:00 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.hbut.hanson.domain.Address;
import com.hbut.hanson.domain.Userinfo;

public interface UserinfoMapper {

	@Select("SELECT * FROM address WHERE addrid=#{addrid}")
	public Address selectAddressById(int addrid);

	@Select("SELECT * FROM userinfo WHERE user_id=#{userid}")
	@Results({ @Result(id = true, column = "user_id", property = "userid"),
			@Result(column = "user_name", property = "username"), @Result(column = "password", property = "password"),
			@Result(column = "addrid", property = "address", one = @One(select = "com.hbut.hanson.mapper.UserinfoMapper.selectAddressById")) })
	public List<Userinfo> selectUserinfoById(Integer userid);

	// ResultMap使用XML映射
	@Select("SELECT user_id, user_name, password, a.addrid, city, street, zip FROM userinfo u LEFT OUTER JOIN address a ON u.addrid=a.addrid WHERE user_id=#{userid}")
	@ResultMap("com.hbut.hanson.mapper.UserinfoMapper.userinfoAndAddressResultMap")
	public List<Userinfo> selectUserinfoById2(Integer userid);
}
