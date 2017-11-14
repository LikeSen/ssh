package com.bean;
/**
 * 业务逻辑层
 * 用来定义数据库对应的数据
 * */
public class Users {
	//与数据库相互对应
	private int id;//序号
	private String name;//用户名
	private String password;//用户密码
	private String email;//用户常用email
	private int age;//年龄
	private String sex;//性别
	//getxx/setxx方法
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
}
