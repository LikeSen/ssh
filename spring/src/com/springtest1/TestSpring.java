package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest1.biz.UserBiz;

public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBiz userBiz=(UserBiz) context.getBean("userBiz");
		
		boolean flag=userBiz.login("admin", "123");
		if(flag){
			System.out.println("登陆成功");
		}
		else{
			System.out.println("登陆失败");
		}

	}

}
