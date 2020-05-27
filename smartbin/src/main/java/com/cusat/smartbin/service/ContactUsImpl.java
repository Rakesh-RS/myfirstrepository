package com.cusat.smartbin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cusat.smartbin.dao.ContactUsDao;
import com.cusat.smartbin.model.ContactUs;


@Service
public class ContactUsImpl implements ContactUsService{

	@Autowired
	private ContactUsDao contactUsDao;
	
	@Override
	public String insertContactUs(ContactUs contactUs) {
		System.out.println("add user :: "+contactUs);
		if(contactUsDao.insertContactUs(contactUs)>0) {
			return "ContactUs Added successfully";
		}
		return "Failed to Add ContactUs";
	}

	@Override
	public List<ContactUs> getAllContactUs() {
		List<ContactUs>contactUsList = null;
		try {
			contactUsList = contactUsDao.getAllContactUs();
			contactUsList.stream().forEach(contactUs -> contactUs.setEmail(contactUs.getEmail()));
			//System.err.println("hi from all");
		}catch (Exception e) {
			System.out.println(e);
		}
		return contactUsList;
	}

}
