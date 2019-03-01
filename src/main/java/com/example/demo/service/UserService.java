package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.domain.User;

public interface UserService {

	List<User> getAll();

	User getUserById(Long id);

	int insert(User user);

	int update(User user);

	int delete(Long id);
}
