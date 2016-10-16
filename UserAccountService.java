package com.techsource.mycheck.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.techsource.mycheck.repository.UserRepository;

@Service
public class UserAccountService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private UserRepository userRepository;

}
