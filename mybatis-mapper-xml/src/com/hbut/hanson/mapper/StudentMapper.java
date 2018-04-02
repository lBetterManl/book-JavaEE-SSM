/**
 * Project Name:mybatis-mapper
 * File Name:StudentMapper.java
 * Package Name:com.hbut.hanson.mapper
 * Date:2018年4月2日下午5:28:12
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.mapper;

import java.util.List;

import com.hbut.hanson.domain.Student;

/**
 * ClassName:StudentMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午5:28:12 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 StudentMapper.java必须和StudentMapper.xml包名必须完全一致
 * 			方法名，参数类型，返回值必须相对应
 */
public interface StudentMapper {
	
	public List<Student> selectStudent();
	
	public Student selectStudentByStuId(Integer id);
	
	public int updateStudent(Student student);
	
	public int insertStudent(Student student);
	
	public int deleteStudent(Integer id);
	
}

