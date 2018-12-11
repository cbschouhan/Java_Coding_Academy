package com.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@ Component("commonData") 
public class CommonAttributes {

	private String companyName;
	private String address;
	private int niftyRank;
	
	public CommonAttributes() {
		super();
	}

	@Override
	public String toString() {
		return "CommonAttributes [companyName=" + companyName + ", address=" + address + ", niftyRank=" + niftyRank
				+ "]";
	}
	
	public String getCompanyName() {
		return companyName;
	}
	@ Value("JPMC")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getAddress() {
		return address;
	}
	@ Value ("Mumbai")
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getNiftyRank() {
		return niftyRank;
	}
	@ Value ("1")
	public void setNiftyRank(int niftyRank) {
		this.niftyRank = niftyRank;
	}

	public CommonAttributes(String companyName, String address, int niftyRank) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.niftyRank = niftyRank;
	}
	
	
}
