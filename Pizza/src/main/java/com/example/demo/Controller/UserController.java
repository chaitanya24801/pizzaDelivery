package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.User;
import com.example.demo.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService ser;
	
	@PostMapping("/addUser")
	public User addNewUser( @RequestBody User User) {
		return ser.addNewUser(User);
		
	}
	@GetMapping("/signin")
	public User Signin (@RequestBody User user) {
		return ser.Signin(user);
		
	}
	@GetMapping("/signout")
	public User Signout (@RequestBody User user) {
		return ser.Signout(user);
	}
	@PostMapping("/forgotPassword/{id}/{newPassword}")
	public User forgotPassword(@PathVariable("id") int id ,@PathVariable("newPassword") String newPassword) {
		return ser.forgotPassword(id, newPassword);
	
		
	}
	
	
}
