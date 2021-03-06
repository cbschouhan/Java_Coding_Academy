package com.jp.hr.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jp.hr.entities.Employee;
import com.jp.hr.exceptions.HrException;
import com.jp.hr.interfaces.DaoEmployee;
import com.jp.hr.utilities.ConnectionFactory;

/*
 * The ClassNotFoundException, SQLException must not come out of DAO class
 * The database specific entities must not come out of the class(Like Exceptions & Resultset)
 * Each and every resource (Connection, statement, Resultset) must be closed proper before coming out.
 * Always prefer statement over PrepatedStatement for non-interactive queries.
 * Fetch the data pagewise.
 * Prefer mentioning column names instead of column position in getXXX() method
 */
@ Repository("dao")
public class DaoEmployeeImpl implements DaoEmployee{
	private ConnectionFactory factory;
	
	public DaoEmployeeImpl() throws HrException {
		/*try {
			factory = new ConnectionFactory();
		} catch (Exception e) {
			throw new HrException("Problem in producing connection.", e);
		}*/
	}
	@Autowired
	public void setConnectionFactory (ConnectionFactory factory){
		this.factory= factory;
		System.out.println("ConnectionFactory Injected in DAO");
	}
	
	

	@Override
	public ArrayList<Employee> getEmpList() throws HrException {
		ArrayList<Employee> empList = new ArrayList<>();
		Connection connect = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			connect = factory.getConnection();
			stmt = connect.createStatement();
			rs = stmt.executeQuery("Select EMPLOYEE_ID,FIRST_NAME,LAST_NAME from employees");
			while(rs.next()) {
				int empId = rs.getInt("EMPLOYEE_ID");
				String firstNm = rs.getString("FIRST_NAME");
				String lastNm = rs.getString("LAST_NAME");
				empList.add(new Employee(empId, firstNm, lastNm));
			}
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				// factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	return empList;
	}

	@Override
	public Employee getEmpDetails(int empId) throws HrException {
		String qry = "Select EMP_ID,FIRST_NAME,LAST_NAME from employee2 where EMP_ID = ?";
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			connect = factory.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, empId);
			rs = stmt.executeQuery();
			if(rs.next()) {
				String firstNm = rs.getString("FIRST_NAME");
				String lastNm = rs.getString("LAST_NAME");
				return new Employee(empId, firstNm, lastNm);
			} else {
				// Id is wrong.
				return null;
			}
		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				// factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
		
	}

	@Override
	public boolean insertNewRecord(Employee emp) throws HrException {
		String qry = "INSERT INTO employee2 (EMP_ID,FIRST_NAME,LAST_NAME) VALUES (?,?,?)";
		Connection connect = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			connect = factory.getConnection();
			stmt = connect.prepareStatement(qry);
			stmt.setInt(1, emp.getEmpId());
			stmt.setString(2, emp.getFirstName());
			stmt.setString(3, emp.getLastName());

			int recInserted = stmt.executeUpdate();
			return recInserted == 1 ? true : false;

		} catch (SQLException e) {
			throw new HrException("Problem in fetching.", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				// factory.closeConnection();
			} catch (SQLException e) {
				throw new HrException("Problem in closing resources.", e);
			}
		}
	}

	@Override
	protected void finalize() throws Throwable {
		factory.closeConnection();
		super.finalize();
	}

}
