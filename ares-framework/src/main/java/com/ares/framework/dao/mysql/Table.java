/**
 * Project Name:ares-framework
 * File Name:TBEntity.java
 * Package Name:com.ares.framework.dao.mysql
 * Date:2016年5月31日上午11:36:07
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.ares.framework.dao.mysql;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ClassName:TBEntity <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年5月31日 上午11:36:07 <br/>
 * @author   zhongwq
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {
	String value() default "";
	String prefix() default "";
	String suffix() default "";
}
