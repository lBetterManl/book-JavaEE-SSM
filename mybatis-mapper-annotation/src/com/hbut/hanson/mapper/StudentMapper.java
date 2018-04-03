/**
 * Project Name:mybatis-mapper-annotation
 * File Name:StudentMapper.java
 * Package Name:com.hbut.hanson.mapper
 * Date:2018年4月2日下午10:22:17
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.mapper;
/**
 * ClassName:StudentMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午10:22:17 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.hbut.hanson.domain.Student;

public interface StudentMapper {

	@Select("SELECT * FROM student WHERE stuid=#{stuid}")
	public List<Student> selectStudentByStuId(Integer stuid);

	@Insert("INSERT INTO student(stuname) VALUES(#{stuname})")
	@Options(useGeneratedKeys = true, keyProperty = "stuid")
	public int insertStudent(Student student);

	@Insert("INSERT INTO student(stuname) VALUES(#{stuname})")
	@SelectKey(statement = "SELECT STU_ID_SEQ.NEXTVAL FROM DUAL", keyProperty = "stuid", resultType = int.class, before = true)
	public int insertStudent2(Student student);

	@Insert("INSERT INTO student(stuname) VALUES(#{stuname})")
	@SelectKey(statement = "SELECT STU_ID_SEQ.CURRTVAL FROM DUAL", keyProperty = "stuid", resultType = int.class, before = false)
	public int insertStudent3(Student student);

	@Update("UPDATE student SET stuname = #{stuname} WHERE stuid = #{stuid}")
	public int updateStudent(Student student);

	@Delete("DELETE FROM student WHERE stuid=#{stuid}")
	public int deleteStudent(Integer stuid);

	@Select("SELECT * FROM student")
	@Results({
		@Result(id=true, column="stuid", property="stuid"),
		@Result(column="stuname", property="stuname")
	})
	public List<Student> selectStudent();

	// 使用xml中的映射studentResultMap
	@Select("SELECT * FROM student")
	@ResultMap("com.hbut.hanson.mapper.StudentMapper.studentResultMap")
	public List<Student> selectStudent2();
}
