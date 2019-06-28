package com.ibm.bean;

import java.sql.Date;

public class Student {

	int studentCode;
	String studentName;
	int deptCode;
	Date date;
	String address;

	public int getStudentCode() {
		return studentCode;
	}

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", studentName=" + studentName + ", deptCode=" + deptCode
				+ ", date=" + date + ", address=" + address + "]";
	}

	public Student(int studentCode, String studentName, int deptCode, Date date, String address) {
		super();
		this.studentCode = studentCode;
		this.studentName = studentName;
		this.deptCode = deptCode;
		this.date = date;
		this.address = address;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void setStudentCode(int studentCode) {
		this.studentCode = studentCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(int deptCode) {
		this.deptCode = deptCode;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
