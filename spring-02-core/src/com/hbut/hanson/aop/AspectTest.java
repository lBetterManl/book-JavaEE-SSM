/**
 * Project Name:spring-02-core
 * File Name:AspectTest.java
 * Package Name:com.hbut.hanson.aop
 * Date:2018年4月7日下午4:51:05
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.aop;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName:AspectTest <br/>
 * Date:     2018年4月7日 下午4:51:05 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 输出：手机静音、观众落座、XXX正在挑战XX项目、鼓掌。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class AspectTest {

	@Resource
	Performance player;
	
	@Test
	public void test(){
		player.perform();
	}

}

