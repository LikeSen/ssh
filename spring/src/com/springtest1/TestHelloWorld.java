package com.springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hw=(HelloWorld) context.getBean("hw");
		hw.show();
	}

}
