package com.ismaeel.sm.api;

public class StudentDTO {
	
	private int id;
	private String name ="Mr x";
	private String address = "Enter your address";
	private long mobileNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
	
	
	

}
