package com.cusat.smartbin.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cusat.smartbin.model.ContactUs;
import com.cusat.smartbin.service.ContactUsService;

@RestController
@RequestMapping("api/contact")
public class ContactUsController {
	
	@Autowired
	private ContactUsService contactUsService;
	
	@PostMapping("add")
	public String insertContactUs(@RequestBody ContactUs contactUs)
	{
		System.out.println("contactUs");
		return 	contactUsService.insertContactUs(contactUs);
	}
	
	
	@GetMapping("all")
	public List<ContactUs> getAllContactUs()
	{
		return 	contactUsService.getAllContactUs();
	}
	
	
	

}
