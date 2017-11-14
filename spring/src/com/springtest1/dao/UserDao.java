package com.springtest1.dao;

public interface  UserDao {
	public boolean login(String username,String password);
	public void addUser(String username,String password);
	public void delUser(int id);
}
