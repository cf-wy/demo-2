package com.example.demo.dao;

import java.util.List;

import com.example.demo.domain.User;

public interface UserMapper {
	List<User> getAll();

	User getUserById(Long id);

	int insert(User user);

	int update(User user);

	int delete(Long id);
}
