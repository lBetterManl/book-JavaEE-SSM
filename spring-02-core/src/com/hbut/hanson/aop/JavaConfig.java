/**
 * Project Name:spring-02-core
 * File Name:JavaConfig.java
 * Package Name:com.hbut.hanson.aop
 * Date:2018年4月7日下午4:47:45
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName:JavaConfig <br/>
 * Date:     2018年4月7日 下午4:47:45 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 配置
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class JavaConfig {

	@Bean
	public Performance player(){
		return new Player("男神", "篮球");
	}
}

