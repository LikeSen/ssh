package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Users;
import com.mysql.jdbc.PreparedStatement;


/**
 * 用户可能的操作
 * */
public class UsersDao {
 /**
  * 用户申请注册
  * 将用户注册的信息添加到数据库中
  * */
	public void addUser(Users user){
		//得到Connection
		Connection conn=DbConnection.getConnection();
		//mysql语言
		String sql="insert into users(u_name,u_password,u_email,u_sex,u_age) values(?,?,?,?,?)";
		//获取Statement
		try {
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement(sql);
			//设置SQL语句中相应的问号
			ps.setString(1,user.getName());
			ps.setString(2,user.getPassword());
			ps.setString(3,user.getEmail());
			ps.setString(4,user.getSex());
			ps.setInt(5,user.getAge());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 登陆的时候寻找相匹配的用户名和密码
	 * 即根据用户名和密码能够查找到有这条信息在数据库中
	 * */
	public Users hasUser(String name,String password){
		Users user=new Users();
		PreparedStatement ps=null;
		ResultSet rs=null;
		//得到Connection
		Connection conn=DbConnection.getConnection();
		//mysql语言
		String sql="select * from users where u_name=? and u_password=? ";
		try {
			 ps=(PreparedStatement) conn.prepareStatement(sql);
			//设置SQL语句中相应的问号
			 ps.setString(1,name);
			 ps.setString(2, password);
			 rs=ps.executeQuery();
			if(rs.next()){
				//获取满足条件的用户信息
				user.setName(rs.getString("u_name"));
				user.setPassword(rs.getString("u_password"));
				user.setEmail(rs.getString("u_email"));
				user.setSex(rs.getString("u_sex"));
				user.setAge(rs.getInt("u_age"));
				user.setId(rs.getInt("u_id"));
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			//断开连接数据库
			DbConnection.closeConnection(rs,ps,conn);
			
		}
		return user;
	}
	/**
	 * 判断注册时是否有相同的用户名
	 * */
	public boolean hasSameName(String name){
		Users user=new Users();
		PreparedStatement ps=null;
		ResultSet rs=null;
		//得到Connection
		Connection conn=DbConnection.getConnection();
		//mysql语言
		String sql="select * from users where u_name=? ";
		try{
		ps=(PreparedStatement) conn.prepareStatement(sql);
		ps.setString(1, name);
		rs=ps.executeQuery();
		if(rs.next()){
			return true;
		}else{
			return false;
		}
		}catch(SQLException e){
			e.printStackTrace();
			
		}finally{
			//断开连接数据库
			DbConnection.closeConnection(rs, ps, conn);
			
		}
		return false;
		
	}

}
