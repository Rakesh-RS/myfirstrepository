package com.cusat.smartbin.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cusat.smartbin.model.User;
import com.cusat.smartbin.service.UserService;


@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("all")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	
	@GetMapping(path = "/{id}")
	public User getUseById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}

	@GetMapping
	public String test() {
		return "Server is UP !!!";
	}

	@PostMapping("add")
	public String insertUser(@RequestBody User user){
		return userService.insertUser(user);
	}
	
	@PutMapping("update")
	public String updateUserById(@RequestBody User user) {
		return userService.updateUserById(user);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteUserById(@PathVariable("id")int id) {
		return userService.deleteUserById(id);
	}
}
