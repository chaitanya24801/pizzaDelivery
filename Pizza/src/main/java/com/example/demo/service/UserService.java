package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.User;
import com.example.demo.Repositry.UserRepositry;
@Service
public class UserService {
	@Autowired
	private UserRepositry rep;
	
	public User addNewUser (User user) {
		return rep.save(user);
	}
	public User Signin (User user) {
		User k=rep.findById(user.getUserid()).orElse(null) ;
		if (k.getPassword().equals(user.getPassword())){
			return k;
			
		}
		return null;
	
	}
	public User Signout (User user) {
		return user;
	}
	public User forgotPassword(int id , String newPassword) {
		User k=rep.findById(id).orElse(null) ;
		k.setPassword(newPassword);
		return rep.save(k);
	}
	
	
	
	

}
