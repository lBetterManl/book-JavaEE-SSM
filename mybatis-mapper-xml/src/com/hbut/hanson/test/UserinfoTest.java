/**
 * Project Name:mybatis-mapper
 * File Name:UserinfoTest.java
 * Package Name:com.hbut.hanson.test
 * Date:2018年4月2日下午7:32:19
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

import com.hbut.hanson.domain.Userinfo;
import com.hbut.hanson.mapper.UserinfoMapper;

/**
 * ClassName:UserinfoTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午7:32:19 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class UserinfoTest {

	public static void main(String[] args) {

		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSession sqlSession = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession();
			
			UserinfoMapper userinfoMapper = sqlSession.getMapper(UserinfoMapper.class);
			Userinfo userinfo = userinfoMapper.selectUserinfoAndAddress2(1);
			System.out.println(userinfo);
		} catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally {
			sqlSession.commit();
			sqlSession.close();
		}

	}
	
}

