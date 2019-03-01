package com.example.demo.domain;

import java.io.Serializable;


import com.example.demo.enums.UserSex;
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String userName;
	private String passWord;
	private UserSex userSex;
	private String nickName;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User( String userName, String passWord, UserSex userSex) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.userSex = userSex;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public UserSex getUserSex() {
		return userSex;
	}

	public void setUserSex(UserSex userSex) {
		this.userSex = userSex;
	}

}