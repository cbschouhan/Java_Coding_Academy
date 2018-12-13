package com.jp.hr.interfaces;

import java.util.ArrayList;


import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;

public interface DaoProduct {
	public ArrayList<Product> getProductList() throws HrException;
//	Employee getPrdDetails(int prdId) throws HrException;
//	boolean insertNewProduct(Product prd) throws HrException;

}
