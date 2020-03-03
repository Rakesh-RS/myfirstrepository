package com.cusat.smartbin.service;

import java.util.List;

import com.cusat.smartbin.model.User;

public interface UserService {
	public User getUserById(int id);
	
	public String insertUser(User user);
	
	public String updateUserById(User user);
	
	public String deleteUserById(int id);

	public List<User> getAllUser(); 
}
