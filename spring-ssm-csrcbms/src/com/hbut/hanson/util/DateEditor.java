/**
 * Project Name:spring-ssm-csrcbms
 * File Name:DateEditor.java
 * Package Name:com.hbut.hanson.util
 * Date:2018年4月11日下午5:17:55
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.util;

import java.beans.PropertyEditorSupport;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 * ClassName:DateEditor <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月11日 下午5:17:55 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 时间格式转换
 */
public class DateEditor extends PropertyEditorSupport {
	
private String pattern = "yyyy-MM-dd";
	
	public DateEditor() {
		
	}
	
	public DateEditor(String pattern) {
		this.pattern = pattern;
	}

	@Override
	public void setAsText(String text) 
			throws IllegalArgumentException {
		if(text == null || text.length() == 0) {
			setValue(null);
		} else {
			SimpleDateFormat sf = new SimpleDateFormat(this.pattern);
			String dateStr = sf.format(Date.valueOf(text));
			setValue(Date.valueOf(dateStr));
		}
	}


}

