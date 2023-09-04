package com.onetoone;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;



public class Student {

	 private long student_id ;
	 private String student_name ;
	 private String student_email ;
	 private long student_mobilenum ;
	 private String student_address ;
	 
	 private Address address;
	 
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public long getStudent_mobilenum() {
		return student_mobilenum;
	}
	public void setStudent_mobilenum(long student_mobilenum) {
		this.student_mobilenum = student_mobilenum;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	 
	 
	 
	 
		
		

	}


