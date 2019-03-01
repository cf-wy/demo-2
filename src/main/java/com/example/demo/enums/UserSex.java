package com.example.demo.enums;

import com.fasterxml.jackson.annotation.JsonFormat;
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum UserSex {
	MAN(1, "男"), WOMAN(2, "女");
	private Integer key;
	private String value;

	UserSex(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	public static UserSex getSexByKey(Integer key) {
		for (UserSex sex : UserSex.values()) {
			if (sex.getKey() == key) {
				return sex;
			}
		}
		return null;

	}

	public Integer getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
