package com.java;

public class ObjectFactory {
	private MyApplDAO dao;
	private MyAppServices service;
	
	public ObjectFactory(){
		dao = new MyApplDAO();
		service = new MyAppServices(dao);
	}
	
	// Factory method
	public MyApplDAO getDao(){
		return new MyApplDAO();
	}
	public MyAppServices getService(){
		return service;
	}
	
	public Object getBean (String beanName){
		switch(beanName){
		case "dao":{
			return dao;
		}
		
		case "service":{
			return service;
		}
		
		default:{
			return null;
		}
		}
	}
}
