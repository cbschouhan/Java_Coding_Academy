package com.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 1. Creation of an application context.
 * 2. The ClassPathXmlApplicationContext refers to a config file which is relative to a path
 * 3. Beans are beaing created eagerly.
 * 		To create object Lazily, use 'lazy-init' attribute in configuration
 * 4. Beans are being created as Singleton.
 * 		To create stateful objects use scope as 'prototype'
 * 5. Prototypes are always on demand. Nothing like eager creation. 
 * 6. By default it calls default constructor, if does not exists then throws exception. 
 * 7. The constructor-arg tag decides the constructor to be invoked while creating a bean
 * 8. The <value> is for defining initila value while <ref> is for injection.
 * 9. Order of the bean creation is not customizable. Spring decides it.
 */

public class TestSpringFactory {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/context.xml");
		System.out.println("Context created");
		MyApplDAO dao = (MyApplDAO)ctx.getBean("dao");
		System.out.println(dao.hashCode());
			

		MyAppServices service = (MyAppServices)ctx.getBean("service");
		System.out.println(service.hashCode());
		
		CommonAttributes common = (CommonAttributes)ctx.getBean("commonData");
		System.out.println("common:" +common);
	
	}
}
