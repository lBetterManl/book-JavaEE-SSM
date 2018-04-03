/**
 * Project Name:spring-01-moattack
 * File Name:Director.java
 * Package Name:com.hbut.hanson.moattack03
 * Date:2018年4月3日下午6:23:33
 * Copyright (c) 2018, hanson.yan@qq.com All Rights Reserved.
 *
*/

package com.hbut.hanson.moattack03;
/**
 * ClassName:Director <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年4月3日 下午6:23:33 <br/>
 * @author   Hanson Yan
 * @since    JDK 1.8
 * @see 	 导演
 */
public class Director {

	public void direct(){
		GeLi geLi = new LiuDeHua();
		MoAttack moAttack = new MoAttack();
		moAttack.injectGeLi(geLi);
		moAttack.cityGateAsk();
	}
}

