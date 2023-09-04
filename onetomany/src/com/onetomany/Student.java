package com.onetomany;

import java.util.Set;

public class Student {
	private long student_id;
	private String student_name ;
	
	private Set<Phone> phone;

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

	public Set<Phone> getPhone() {
		return phone;
	}

	public void setPhone(Set<Phone> set) {
		this.phone = set;
	}

}
