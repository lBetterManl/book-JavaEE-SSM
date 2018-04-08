/**
 * Project Name:spring-02-core
 * File Name:AspectXMLTest.java
 * Package Name:com.hbut.hanson.xmlaop
 * Date:2018年4月7日下午5:45:10
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.xmlaop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hbut.hanson.xmlaop.Performance;

/**
 * ClassName:AspectXMLTest <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月7日 下午5:45:10 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 
 */
public class AspectXMLTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
	    Performance player = (Performance)ctx.getBean("player");
	    player.perform();
	}
	

}

