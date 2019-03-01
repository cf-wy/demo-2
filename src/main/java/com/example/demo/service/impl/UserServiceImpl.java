package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserMapper;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper mapper;

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return mapper.getAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return mapper.getUserById(id);
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return mapper.insert(user);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return mapper.update(user);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return mapper.delete(id);
	}


}
