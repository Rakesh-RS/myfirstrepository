package com.cusat.smartbin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.cusat.smartbin.model.ContactUs;


public interface ContactUsDao {
	
	
	@Insert("INSERT INTO contact_us(subject,mobile_number, email,message) " + 
			"VALUES (#{subject},#{mobileNumber},#{email},#{message})")
	public int insertContactUs(ContactUs contactUs) ;
	
	
	
	@Results({
        @Result(property = "cid", column = "cid"),
        @Result(property = "subject", column = "subject"),
        @Result(property = "mobileNumber", column = "mobile_number"),
        @Result(property = "email", column = "email"),
        @Result(property = "message", column = "message"),
      })
	@Select("select * from contact_us")
	public List<ContactUs> getAllContactUs();

}
