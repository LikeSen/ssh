package com.itcast.convertor;



import java.util.Date;


public class UserAction {
	
	private User user; 
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}

	public String register() {
		System.out.println(user.getName());
		System.out.println(user.getPwd());
		System.out.println(user.getAge());
		System.out.println(user.getBirth());
		return "success";
	}
}
