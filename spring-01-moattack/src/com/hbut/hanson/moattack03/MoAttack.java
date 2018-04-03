/**
 * Project Name:spring-01-moattack
 * File Name:MoAttack.java
 * Package Name:com.hbut.hanson.moattack03
 * Date:2018年4月3日下午6:19:05
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.moattack03;
/**
 * ClassName:MoAttack <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月3日 下午6:19:05 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 《墨攻》
 */
public class MoAttack implements ActorArrangable {
	
	private GeLi geLi;
	
	public void cityGateAsk(){
		geLi.responseAsk("墨者革离");
	}

	// 注入方法1：属性方法注入GeLi扮演着
	public void setGeLi(GeLi geLi) {
		this.geLi = geLi;
	}

	// 注入方法2：实现接口注入GeLi扮演着
	@Override
	public void injectGeLi(GeLi geli) {
		this.geLi = geLi;		
	}

	
}

