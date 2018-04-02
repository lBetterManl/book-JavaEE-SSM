/**
 * Project Name:mybatis-mapper
 * File Name:StudentTest.java
 * Package Name:com.hbut.hanson.test
 * Date:2018年4月2日下午5:18:21
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hbut.hanson.domain.Student;
import com.hbut.hanson.mapper.StudentMapper;

/**
 * ClassName:StudentTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午5:18:21 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class StudentTest {

	public static void main(String[] args) {

		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSession sqlSession = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			List<Student> list = studentMapper.selectStudent();
			for (Student student : list) {
				System.out.println(student);
			}
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}

	}

}

