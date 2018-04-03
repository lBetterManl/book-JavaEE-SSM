/**
 * Project Name:mybatis-mapper-annotation
 * File Name:DepartmentTest.java
 * Package Name:com.hbut.hanson.test
 * Date:2018年4月3日上午9:45:17
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.test;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hbut.hanson.domain.Department;
import com.hbut.hanson.mapper.DepartmentMapper;

/**
 * ClassName:DepartmentTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月3日 上午9:45:17 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class DepartmentTest {

	public static void main(String[] args) {

		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSession sqlSession = null;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			
			DepartmentMapper departmentMapper = sqlSession.getMapper(DepartmentMapper.class);
			Department department = departmentMapper.selectDepartmentAndEmployeeById2(2);
			System.out.println(department);
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}

	}

}

