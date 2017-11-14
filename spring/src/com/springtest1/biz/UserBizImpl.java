package com.springtest1.biz;


import com.springtest1.dao.UserDao;

public class UserBizImpl implements UserBiz {
	UserDao userDao;
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	@Override
	public boolean login(String username, String password) {
		
		return userDao.login(username, password);
	}
	@Override
	public void addUser(String username, String password) {
		userDao.addUser(username, password);
		Exception exception=new NullPointerException();
		System.out.println("抛出异常"+exception);
	}
	@Override
	public void delUser(int id) {
		userDao.delUser(id);
		
	}

}
