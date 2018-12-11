package com.java;

public class MyAppServices {
	private MyApplDAO dao;
	
	public MyAppServices() {
		// TODO Auto-generated constructor stub
		
		dao = new MyApplDAO();
		System.out.println("Object of MyApplServices() is created");
				
	}
	
	public MyAppServices(MyApplDAO dao){
		this.dao=dao;
		System.out.println("Object of MyApplServices(dao) is created");
	}

}
