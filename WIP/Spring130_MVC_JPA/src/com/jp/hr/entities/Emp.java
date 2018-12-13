package com.jp.hr.entities;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name="EMPRec")
@Table(name="EMP")
public class Emp implements Serializable{

	private int empNo;
	private String empNm;
	private Float empSal;
	private Integer deptNo;
	private Dept dept;
	
	@Id
	@Column(name="EMPNO")
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
	@Column(name="ENAME")
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	
	
	@Column(name="empSal")
	public Float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}
	
	
/*	@Column(name="deptNo")
	public Integer getdeptNo() {
		return deptNo;
	}
	public void setdeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}*/
	
	
	@OneToOne
	@JoinColumn(name="deptno")
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [empNo=" + empNo + ", empNm=" + empNm + ", empSal=" + empSal + ", depyNo=" + deptNo + "]";
	}
	
	
}
