package com.action;

import java.util.Map;

import com.bean.Users;
import com.dao.UsersDao;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String name;//用户名
	private String password;//用户密码
	private String repassword;//确认用户密码
	private String email;//用户常用email
	private int age;//年龄
	private String sex;//性别
	
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
	
	public String getRepassword() {
		return repassword;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String execute(){
		Users user=new Users();
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setAge(age);
		user.setSex(sex);
		
		UsersDao ud=new UsersDao();
		if(ud.hasSameName(name)){
			//显示错误
			this.addFieldError(name, "用户名已存在");
			return INPUT;
			
		}else{
			ud.addUser(user);
			
		}
		return SUCCESS;
	}
	//验证两次输入的密码是否一致
	public void validate(){
		ActionContext ac=ActionContext.getContext();
		Map<String, Object> session=ac.getSession();
		if(!repassword.equals(password)){
			
			this.addFieldError(repassword, "密码不一致");
		}
	}
}
