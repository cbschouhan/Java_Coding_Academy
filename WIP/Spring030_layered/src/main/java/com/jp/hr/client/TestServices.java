package com.jp.hr.client;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.services.ServiceEmployee;
import com.jp.hr.services.ServiceEmployeeImpl;

public class TestServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
			//ServiceEmployee empService = new ServiceEmployeeImpl();
			ServiceEmployee empService = (ServiceEmployee)ctx.getBean("service");
			
			ArrayList<Employee> empList = empService.getEmpList();
			
			for (Employee emp : empList){
				System.out.println(emp);
			}
		} catch (HrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
