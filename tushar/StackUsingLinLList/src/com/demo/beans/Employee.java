package com.demo.beans;

public class Employee {
	

	

	private int empid;
	private String gender;
	private String fullname;
	
	public Employee() {
		super();
	}
	
	public Employee(int empid, String gender, String fullname) {
		super();
		this.empid = empid;
		this.gender = gender;
		this.fullname = fullname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", gender=" + gender + ", fullname=" + fullname + "]";
	}
	
	
	
}
