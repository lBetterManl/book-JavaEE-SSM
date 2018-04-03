/**
 * Project Name:mybatis-mapper-annotation
 * File Name:DepartmentMapper.java
 * Package Name:com.hbut.hanson.mapper
 * Date:2018年4月3日上午9:28:55
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.mapper;
/**
 * ClassName:DepartmentMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月3日 上午9:28:55 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.hbut.hanson.domain.Department;
import com.hbut.hanson.domain.Employee;

public interface DepartmentMapper {

	@Select("SELECT emp.empid, emp.empname FROM employee emp WHERE emp.depid=#{depid}")
	@Results({ @Result(id = true, column = "empid", property = "empid"),
			@Result(column = "empname", property = "empname") })
	public List<Employee> selectEmployeesById(Integer depid);

	@Select("SELECT dep.depid, dep.depname FROM department dep WHERE dep.depid=#{depid}")
	@Results({ @Result(id = true, column = "depid", property = "depid"),
			@Result(column = "depname", property = "depname"),
			@Result(property = "employees", column = "depid", many = @Many(select = "com.hbut.hanson.mapper.DepartmentMapper.selectEmployeesById")) })
	public Department selectDepartmentAndEmployeeById(Integer depid);

	// ResultMap使用XML映射
	@Select("SELECT dep.depid, dep.depname, emp.empid, emp.empname FROM department dep LEFT OUTER JOIN employee emp ON dep.depid=emp.depid WHERE dep.depid=#{depid}")
	@ResultMap("com.hbut.hanson.mapper.DepartmentMapper.departmentResultMap")
	public Department selectDepartmentAndEmployeeById2(Integer depid);
}
