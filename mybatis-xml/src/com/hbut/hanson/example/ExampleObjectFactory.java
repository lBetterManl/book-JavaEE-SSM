/**
 * Project Name:mybatis-xml
 * File Name:ExampleObjectFactory.java
 * Package Name:com.hbut.hanson.example
 * Date:2018年4月2日下午3:45:19
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

import com.hbut.hanson.domain.Student;

/**
 * ClassName:ExampleObjectFactory <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月2日 下午3:45:19 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 创建对象实体 在MyBatis配置
 * 
 *  <objectFactory type="com.hbut.hanson.example.ExampleObjectFactory">
		<property name="age" value="13"/>
	</objectFactory>
 */
public class ExampleObjectFactory extends DefaultObjectFactory {
	
	public Object create(Class type){
		if (type.equals(Student.class)) {
			Student obj = (Student)super.create(type);
			obj.setStuname("好人");
			return obj;
		}
		return super.create(type);
	}
	
	public void setProperties(Properties properties){
		Iterator iterator = properties.keySet().iterator();
		while (iterator.hasNext()) {
			String keyValue = String.valueOf(iterator.next());
			System.out.println(properties.getProperty(keyValue));			
		}
		super.setProperties(properties);
	}
	
	@Override
	public <T> boolean isCollection(Class<T> type) {
		return Collection.class.isAssignableFrom(type);
	}
	
}

