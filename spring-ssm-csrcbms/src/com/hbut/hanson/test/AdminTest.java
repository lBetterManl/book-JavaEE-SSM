/**
 * Project Name:spring-ssm-csrcbms
 * File Name:AdminTest.java
 * Package Name:com.hbut.hanson.test
 * Date:2018年4月11日下午5:13:13
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * ClassName:AdminTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午5:13:13 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class AdminTest {
	
	private static Logger logger = Logger.getLogger(AdminTest.class);

}

