package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

//POJO(Plain Old Java Object): which contains properties, constructor, getter/setter, methods, not inherit from any class or interface is not implemented in this class.

@Entity
public class UserDetails {

	@Id
	private int userId;
	
	private String userName;
	
	private String city;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", city=" + city + "]";
	}
	
	
}
