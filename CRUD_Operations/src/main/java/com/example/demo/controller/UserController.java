package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService ;
	
	
	@GetMapping("/login/{username}/{password}")
	public String getToken(@PathVariable String username , @PathVariable String password) {
		
		return "token : "+userService.generateToken(username , password);
	}
	
	
}

