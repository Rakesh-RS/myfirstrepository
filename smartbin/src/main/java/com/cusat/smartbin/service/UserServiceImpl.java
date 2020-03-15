package com.cusat.smartbin.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cusat.smartbin.dao.UserDao;
import com.cusat.smartbin.model.User;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(int id) {
		return userDao.getUserByID(id);
	}

	@Override
	public String insertUser(User user) {
		System.out.println("add user :: "+user);
		if(userDao.insertUser(user)>0) {
			return "User Added successfully";
		}
		return "Failed to Add User";
	}

	@Override
	public String updateUserById(User user) {
		System.out.println("update user :: "+user);
		if(userDao.updateUserById(user)>0) {
			return "User Update Sucessfully";
		}
		return "Failed to Update User";
	}

	@Override
	public String deleteUserById(int id) {
		if(userDao.deleteUserById(id)>0) {
			return "User Deleted Sucessfully"; 
		}
		return "User Delete Failed";
	}

	@Override
	public List<User> getAllUser() {
		
		List<User> userList = null;
		try {
			 userList = userDao.getAllUser();
			userList.stream().forEach(user -> user.setName(user.getName()));
		}catch (Exception e) {
			System.out.println(e);
		}
		return userList;
	}
	
	

}
