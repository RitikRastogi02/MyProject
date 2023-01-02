package com.nagarro.prog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.prog.entity.User;
import com.nagarro.prog.repository.LoginRepository;

@Service
public class LoginService
{
	 @Autowired
	    private LoginRepository loginRepository;

	    public User login(String username, String password) {
	        User user = loginRepository.findByUsernameAndPassword(username, password);
	        return user;
	    }
}
