package com.jp.hr.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jp.hr.interfaces.DaoProduct;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;


/*
 * One layer refers to another layer through interfaces only.
 * Implementation of business rule should be done here in absence of BL layer.
 * This layer will also ensure only custom exceptions to come out. 
 */
@Service("serviceprd")
public class ServiceProductImpl implements ServiceProduct {

	private DaoProduct daoPrd;
	
	//Resolving Dependency.
	public ServiceProductImpl(){
		
	}
	
	@Autowired
	// Injection By Name
	public ServiceProductImpl(@Qualifier("daodsprd") DaoProduct daoPrd) throws HrException {
		this.daoPrd = daoPrd;
	}
	
	@Override
	public ArrayList<Product> getProductList() throws HrException {
		// TODO Auto-generated method stub
		return daoPrd.getProductList();
	}

}
