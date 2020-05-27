package com.cusat.smartbin.model;

public class ContactUs {
	private int cid;
	private String subject;
	private String mobileNumber;
	private String email;
	private String message;
	public ContactUs(int cid, String name, String mobileNumber, String email, String message) {
		super();
		this.cid = cid;
		this.subject = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.message = message;
	}
	
	
	
	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
