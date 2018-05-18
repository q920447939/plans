package com.withmes.plan.config.base.enums;


/**
 * ClassName: ResultEnum 
 * @author guocp
 * @date 2017年5月2日
 *
 * =================================================================================================
 *     Task ID			  Date			     Author		      Description
 * ----------------+----------------+-------------------+-------------------------------------------
 *
 */

public interface ResultEnum<T>{

	T getCode();  
	
    String getDesc();  
}
