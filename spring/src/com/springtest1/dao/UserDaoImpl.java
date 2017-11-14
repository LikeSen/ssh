package com.springtest1.dao;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean login(String username, String password) {
		if((username.equals("admin"))&&(password.equals("123"))){
			return true;
			
		}
		return false;
	}

	@Override
	public void addUser(String username, String password) {
		System.out.println(username+"添加成功");
	}

	@Override
	public void delUser(int id) {
		System.out.println("编号为"+id+"的用户被删除");
		
	}

}
