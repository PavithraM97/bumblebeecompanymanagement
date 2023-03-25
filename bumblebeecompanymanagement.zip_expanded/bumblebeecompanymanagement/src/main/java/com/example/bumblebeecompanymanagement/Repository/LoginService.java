package com.example.bumblebeecompanymanagement.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bumblebeecompanymanagement.Domain.Login;
import com.example.bumblebeecompanymanagement.Service.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;
	  
	  public Login login(String username, String password) {
	  Login user = repo.findByUsernameAndPassword(username, password);
	   return user;
	  }
}
