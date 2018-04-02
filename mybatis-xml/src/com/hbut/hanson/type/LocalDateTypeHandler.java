/**
 * Project Name:mybatis-xml
 * File Name:LocalDateTypeHandler.java
 * Package Name:com.hbut.hanson.type
 * Date:2018年4月2日下午2:59:57
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.type;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

/**
 * ClassName:LocalDateTypeHandler <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午2:59:57 <br/>
 * @author   Hanson 
 * @since    JDK 1.8
 * @see 	 
 */
@MappedTypes(LocalDate.class)
public class LocalDateTypeHandler extends BaseTypeHandler<LocalDate> {
	
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, LocalDate parameter, JdbcType jdbcType)
			throws SQLException {
		if (parameter == null) {
			ps.setDate(i, null);
		} else{
			ps.setDate(i, Date.valueOf(parameter));	
		}
	}

	@Override
	public LocalDate getNullableResult(ResultSet rs, String columnName) throws SQLException {
		
		Date date = rs.getDate(columnName);
		return date==null?null:date.toLocalDate();
	}

	@Override
	public LocalDate getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		
		Date date = rs.getDate(columnIndex);
		return date==null?null:date.toLocalDate();
	}

	@Override
	public LocalDate getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		
		Date date = cs.getDate(columnIndex);
		return date==null?null:date.toLocalDate();
	}

}

