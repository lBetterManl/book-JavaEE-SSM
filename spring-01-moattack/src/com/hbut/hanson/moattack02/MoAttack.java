/**
 * Project Name:spring-01-moattack
 * File Name:MoAttack.java
 * Package Name:com.hbut.hanson.moattack02
 * Date:2018年4月3日下午6:07:40
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.moattack02;
/**
 * ClassName:MoAttack <br/>
 * Date:     2018年4月3日 下午6:07:40 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 《墨攻》
 */
public class MoAttack {
	
	private GeLi geLi;

	public void setGeLi(GeLi geLi) {
		this.geLi = geLi;
	}
	
	public void cityGateAsk(){
		geLi.responseAsk("墨者革离");
	}
}

