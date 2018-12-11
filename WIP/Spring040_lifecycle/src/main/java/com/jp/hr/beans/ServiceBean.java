package com.jp.hr.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
/*
 * The implementation of InitializingBean interface
 * 	The name of implementing method can not be customizable.
 * 	The exception being thrown can not be changed.\
 * 	The initializing code can not be grouped as per category in different methods.
 * 	The interface tightly bound the code to Spring framework API.
 * 
 * The ApplicationContextAware is an interface to inject SpringContext reference within bean.
 * 		Such reference can be used to achieve dependency relationship
 * 
 * Life cycle: order of execution
 * 		1. Object created and constructor invoked.(JVM does it)
 * 		2. All setter methods are called (Value and reference initialization).
 * 		3. All aware methods.
 * 		4. The init() methods (@PostConstruct afterPropertiesSet()).
 * */
public class ServiceBean implements InitializingBean,ApplicationContextAware{
	private int x;
	private ApplicationContext ctx;
	
	public ServiceBean(int x){
		this.x=x;
		System.out.println("In constructor.");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.ctx=arg0;
		System.out.println("Setting application context");
		
	}
	public void setValueX(int x){
		this.x=x;
		System.out.println("In Setter.");
	}
	
	@ PostConstruct
	public void validateConfig(){
		System.out.println("In validateConfig");
		if (x>100){
			System.out.println("Wrong Input");
		}
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("In after propertySet");
		
	}

	@Override
	public String toString() {
		return "ServiceBean [x=" + x + "]";
	}

	public void myServices(){
		ctx.getBean("");
	}
	
}
