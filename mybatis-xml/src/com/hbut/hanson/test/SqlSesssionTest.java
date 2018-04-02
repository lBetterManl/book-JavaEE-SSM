/**
 * Project Name:mybatis-xml
 * File Name:SqlSesssionTest.java
 * Package Name:com.hbut.hanson.test
 * Date:2018年4月2日上午9:52:18
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hbut.hanson.domain.Student;

/**
 * ClassName:SqlSesssionTest <br/>
 * Date:     2018年4月2日 上午9:52:18 <br/>
 * @author  Hanson
 * @see 	 获取sqlSession并执行程序
 */
public class SqlSesssionTest {

	public static void main(String[] args) {

		// 获取路径下配置文件名称
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSession sqlSession = null;
		try {
			// 配置文件加载
			inputStream = Resources.getResourceAsStream(resource);
			// 根据配置文件生成SqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// sqlSession获取
			sqlSession = sqlSessionFactory.openSession();
			// 执行查询请求
			Student student = sqlSession.selectOne("com.hbut.hanson.map.StudentMapper.selectStudentByStuId", 1);
			student.setStuname("嘿哈");//数据库没更新
			// 执行更新请求
			Student student2 = new Student();
			System.out.println("------->"+student2);
			sqlSession.update("com.hbut.hanson.map.StudentMapper.updateStudent", student);
			// 输出查询结果
			sqlSession.commit();//增删改，需要提交事务
			System.out.println(student);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sqlSession.close();
		}

	}

}

