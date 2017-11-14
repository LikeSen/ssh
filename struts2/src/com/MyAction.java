package com;

import com.opensymphony.xwork2.ActionSupport;


public class MyAction extends ActionSupport {
	private String account;
	private String password;
	@Override
	public String execute() throws Exception{
		System.out.println("访问到了action，正在处理请求");
		System.out.println("调用service");
		if("helloween".equals(account)&&"1234".equals(password)){
			return SUCCESS;
		}
		return LOGIN;
		
	
		
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
