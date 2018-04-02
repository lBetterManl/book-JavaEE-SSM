/**
 * Project Name:mybatis-xml
 * File Name:LocalTimeTypeHandler.java
 * Package Name:com.hbut.hanson.type
 * Date:2018年4月2日下午2:46:03
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import java.time.LocalTime;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

/**
 * ClassName:LocalTimeTypeHandler <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午2:46:03 <br/>
 * @author   Hanson 
 * @since    JDK 1.8
 * @see 	 类型处理器方式一：实现org.apache.ibatis.type.TypeHandler接口
 */
@MappedTypes(LocalTime.class)
public class LocalTimeTypeHandler implements TypeHandler<LocalTime> {
	
	@Override
	public void setParameter(PreparedStatement ps, int i, LocalTime parameter, JdbcType jdbcType) throws SQLException {
		
		if (parameter == null) {
			ps.setTime(i, null);
		} else{
			ps.setTime(i, Time.valueOf(parameter));
		}
	}

	@Override
	public LocalTime getResult(ResultSet rs, String columnName) throws SQLException {
		
		Time time = rs.getTime(columnName);
		return time == null?null:time.toLocalTime();
	}

	@Override
	public LocalTime getResult(ResultSet rs, int columnIndex) throws SQLException {
		
		Time time = rs.getTime(columnIndex);
		return time == null?null:time.toLocalTime();
	}

	@Override
	public LocalTime getResult(CallableStatement cs, int columnIndex) throws SQLException {
		
		Time time = cs.getTime(columnIndex);
		return time == null?null:time.toLocalTime();
	}

}

