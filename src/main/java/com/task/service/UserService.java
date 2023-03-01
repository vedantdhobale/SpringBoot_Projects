package com.task.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.task.dto.UserRegistrationDto;
import com.task.entities.User;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
