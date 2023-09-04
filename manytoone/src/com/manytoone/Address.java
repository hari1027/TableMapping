package com.manytoone;

import java.util.Set;

public class Address {
	private long Address_id ;
	private String Street_name ;
	private String city;
	private String State;
	private int pincode;
	
	private Set<Student> student;
	
	
	

	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> set) {
		this.student = set;
	}
	public long getAddress_id() {
		return Address_id;
	}
	public void setAddress_id(long address_id) {
		Address_id = address_id;
	}
	public String getStreet_name() {
		return Street_name;
	}
	public void setStreet_name(String street_name) {
		Street_name = street_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	

}
