package com.action;

import com.bean.Users;
import com.dao.DbConnection;
import com.dao.UsersDao;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	//添加默认长度  
	private static final long serialVersionUID = 1L;
	//登陆时的用户名和密码
	private String name;
	private String password;
	//getxx和setxx
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute(){
		UsersDao ud=new UsersDao();
		
		Users user=new Users();
		
		user=ud.hasUser(name, password);
		if(user==null){
			System.out.println("用户名或密码错误");
			return INPUT;
		}else{
			
			return SUCCESS;
		}
		
		
	}

}
