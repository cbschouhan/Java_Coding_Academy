package com.jp.hr.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="dept")
@Table(name="DEPARTMENTS")
public class Dept implements Serializable{
	private int deptNo;
	private String deptNm;
	
	// Association
	Set<Emp> empList;
	
	@Id
	@Column(name="Department_id")
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	
	
	@Column(name="Department_name")
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	
	@OneToMany(mappedBy="dept", fetch=FetchType.EAGER)
	public Set<Emp> getEmpList() {
		return empList;
	}
	public void setEmpList(Set<Emp> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Dept [deptNo=" + deptNo + ", deptNm=" + deptNm + "]";
	}
	
	
}
