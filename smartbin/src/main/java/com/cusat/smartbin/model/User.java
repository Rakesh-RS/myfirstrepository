package com.cusat.smartbin.model;


public class User {
	
	private int id;
	private String name;
	private String city;
	private String address;
	private int zipCode;
	private String mobileNumber;
	private String emailId;
	private String vechileNumber;
	private String workingArea;
	private String typeOfUser;
	public String getTypeOfUser() {
		return typeOfUser;
	}
	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	public int getId() {
		return id;
	}
	
	public String getVechileNumber() {
		return vechileNumber;
	}
	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}
	public String getWorkingArea() {
		return workingArea;
	}
	public void setWorkingArea(String workingArea) {
		this.workingArea = workingArea;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", address=" + address + ", zipCode=" + zipCode
				+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", vechileNumber=" + vechileNumber
				+ ", workingArea=" + workingArea + ", typeOfUser=" + typeOfUser + "]";
	}

}
