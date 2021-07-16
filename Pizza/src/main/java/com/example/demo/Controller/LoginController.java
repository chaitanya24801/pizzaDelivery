package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.LoginService;

@Controller

public class LoginController {
	@Autowired
	private LoginService serv;
	
	
	
	

}
