package com.cusat.smartbin.dao;


import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cusat.smartbin.model.User;



public interface UserDao {
	
	
	@Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "name"),
        @Result(property = "city", column = "city"),
        @Result(property = "address", column = "address"),
        @Result(property = "zipCode", column = "zip_code"),
        @Result(property = "mobileNumber", column = "mobile_number"),
        @Result(property = "emailId", column = "email_id"),
        @Result(property = "vechileNumber", column = "vechile_number"),
        @Result(property = "workingArea", column = "working_area"),
        @Result(property = "typeOfUser", column = "type_of_user")
      })
	@Select("select * from user_master where id =#{id} ")
	public User getUserByID(@Param("id")int id);
	
	
	@Insert("INSERT INTO user_master(name,city, address, zip_code,mobile_number, email_id,vechile_number,working_area,type_of_user) " + 
			"VALUES (#{name},#{city},#{address},#{zipCode},#{mobileNumber},#{emailId},#{vechileNumber},#{workingArea},#{typeOfUser})")
	public int insertUser(User user);
	
	@Update("update user_master set  name=#{name},address=#{address},zip_code=#{zipCode},email_id=#{emailId},mobile_number=#{mobileNumber},vechile_number=#{vechileNumber},working_area=#{workingArea},type_of_user=#{typeOfUser} where id=#{id}")
	public int updateUserById(User user);
	
	@Delete("delete from user_master where id=#{id}")
	public int deleteUserById(int id);


	@Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "name"),
        @Result(property = "city", column = "city"),
        @Result(property = "address", column = "address"),
        @Result(property = "zipCode", column = "zip_code"),
        @Result(property = "mobileNumber", column = "mobile_number"),
        @Result(property = "emailId", column = "email_id"),
        @Result(property = "vechileNumber", column = "vechile_number"),
        @Result(property = "workingArea", column = "working_area"),
        @Result(property = "typeOfUser", column = "type_of_user")
      })
	@Select("select * from user_master")
	public List<User> getAllUser();

}
