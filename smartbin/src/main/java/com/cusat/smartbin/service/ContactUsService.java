package com.cusat.smartbin.service;

import java.util.List;

import com.cusat.smartbin.model.ContactUs;


public interface ContactUsService{
	public String insertContactUs(ContactUs contactUs);
	
	public List<ContactUs> getAllContactUs(); 

}
