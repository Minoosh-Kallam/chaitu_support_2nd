package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired JwtUtil jwtUtil ;
	
	public String generateToken(String username, String password) {
		return jwtUtil.generateToken(username);
	}
}
