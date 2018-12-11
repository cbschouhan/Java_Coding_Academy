package com.java;

public class TestDependencyInjection {

	public static void main(String[] args) {
		ObjectFactory factory = new ObjectFactory();
		// TODO Auto-generated method stub
		//MyApplDAO dao = factory.getDao();
		//MyAppServices services = factory.getService();
		
		MyApplDAO dao = (MyApplDAO) factory.getBean("dao");
		MyAppServices services = (MyAppServices) factory.getBean("services");
	}

}
