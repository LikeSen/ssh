package com;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String account;
	private String password;
	
	public String execute() {
		if("helloween".equalsIgnoreCase(account)&&"1234".equals(password)){
			return SUCCESS;
		}
		return LOGIN;
		
	}
	public String login() throws Exception{
		return execute();
	}
	public String logout() {
		return "logout";
	}
	
}
