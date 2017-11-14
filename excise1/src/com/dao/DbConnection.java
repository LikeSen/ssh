package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;


/**
 * 用来定义数据库的连接
 * 开启和关闭
 * */
public class DbConnection {
	public static Connection getConnection(){
		
		return getConnection("databaseweb","root","root");
	}
	private static Connection getConnection(String dbName, String userName,
			String password) {
		Connection connection=null;
		//url的组成： 
		//采用数据库方式(jdbc):所用的数据库（mysql）://本机地址：端口号/数据库的名字
		String url="jdbc:mysql://localhost:3306/"+dbName;
		
		try {
			//1  加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			//2 建立连接
			connection=DriverManager.getConnection(url, userName, password);
			/*
			//或者这种方式1 加载驱动程序
			Driver driver=new com.mysql.jdbc.Driver();
			//2 注册驱动程序
			DriverManager.registerDriver(driver);
			//3 建立连接
			connection=DriverManager.getConnection(url,userName,password);
			*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
	//关闭数据库连接
	public static void closeConnection(ResultSet rs, PreparedStatement ps, Connection conn){
		//关闭结果集
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//关闭statement
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//关闭connection
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
