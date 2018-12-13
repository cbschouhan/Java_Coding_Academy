package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Employee;
import com.jp.hr.entities.Product;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoProduct;


/*
 * The ClassNotFoundException , SQLException must not out of DAO 
 * the database specific entities must not come out og the class (Like Exception)
 * each and every resource (connection, statement, resultset) must be closed before coming out.
 * Always prefer Statement over PRepared Statement for non interactive queries
 * fetch the data page wise... 20 records per page
 *  * Prefer mentioning column names instead of column position in getxxx method. 
 */
@Repository("daodsprd")
public class DaoProductImplDS implements DaoProduct {
	@Autowired
	//@Qualifier("ds")
	private  DataSource dataSource;
	
	

	@Override
	public ArrayList<Product> getProductList() throws HrException{
		ArrayList<Product> prdList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect = dataSource.getConnection();
			
			stmt = connect.createStatement();
			rs = stmt.executeQuery("Select * from Product");
			while(rs.next()){
				int productId=rs.getInt("Product_id");
				String productCategory = rs.getString("Product_Category");
				double productPrice = rs.getDouble("Product_Price");
				String productName = rs.getString("Product_Name");
				prdList.add(new Product(productId, productCategory, productName,productPrice));

			}
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.",e);			
		} finally{
			try {
				if(rs!=null)
				{
				rs.close();
				}
				if (stmt!=null)
				{
					stmt.close();	
				}
				if (connect!=null)
				{
					connect.close();	
				}
				//factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in Cloising Resources.",e);
			}
		}
				
		return prdList;
		
	}
	
		
	}
	
	

	

