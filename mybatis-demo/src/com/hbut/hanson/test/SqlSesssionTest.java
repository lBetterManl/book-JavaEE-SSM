/**
 * Project Name:mybatis-demo
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
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

