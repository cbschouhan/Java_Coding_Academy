package com.java;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
/*
 * When bean alias is not mentioned, the default is class name is camel case.
 * 
 * @ Component
 * 		@ Service: for declaring service bean.
 * 		@ Repository: For declaring dao beans
 * 		@ Controller: for controller in SpringMVC
 * 		@ RestController:for declaring REST service layer.
 * */

@ Component ("service")
@ Service ("service")
@ Lazy (true)
@ Scope ("singleton")
public class MyAppServices {
	private MyApplDAO dao;
	
	public MyAppServices() {
		// TODO Auto-generated constructor stub
		
		//dao = new MyApplDAO();
		System.out.println("Object of MyApplServices() is created");
				
	}
	
	public MyAppServices(MyApplDAO dao){
		this.dao=dao;
		System.out.println("Object of MyApplServices(dao) is created");
	}

}
