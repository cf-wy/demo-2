package com.example.demo.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;


@RestController
public class HelloWorldController {
	@Value("${server.port}")
	private String port;
	@Autowired
	private UserService service;

	@RequestMapping("/hello")
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/getUser")
	public User getUser(Long id) {
		/*
		 * User user=new User(); user.setUserName("小明"); user.setPassWord("xxxx");
		 * return user;
		 */
		return service.getUserById(id);
	}

	@RequestMapping("/uid")
	String uid(HttpSession session) {
		UUID uid = (UUID) session.getAttribute("uid");
		if (uid == null) {
			uid = UUID.randomUUID();
		}
		System.out.println(uid);
		session.setAttribute("uid", uid);
		return session.getId();
	}

	@RequestMapping(value = "/session")
	public Object getSession(HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("SessionId", request.getSession().getId());
		map.put("ServerPort", "服务端口号为 " + port);
		return map;
	}
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		/*
		 * User user=new User(); user.setUserName("小明"); user.setPassWord("xxxx");
		 * return user;
		 */
		return service.getAll();
	}
}
