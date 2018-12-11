package com.jp.hr.entities;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	
	public Employee(int empId, String firstName, String lastName) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Employee() {
		super();
	}

	public int getEmpId() { // Property name: empId
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() { // Property name: firstName
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() { // Property name: lastName
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
