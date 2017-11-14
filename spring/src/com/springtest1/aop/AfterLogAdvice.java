package com.springtest1.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterLogAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args,
			Object target) throws Throwable {
		//获取被调用的类名
		String targetClassName=target.getClass().getName();
		//获取被调用的方法名
		String targetMethodName=method.getName();
		//日志格式字符串
		System.out.println("后置通知"+targetClassName+"类的"+targetMethodName+"方法开始执行");
		
	}
}
