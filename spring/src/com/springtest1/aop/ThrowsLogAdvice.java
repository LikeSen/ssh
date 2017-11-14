package com.springtest1.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class ThrowsLogAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args,
			Object target ,Throwable exceptionClass){
		//获取被调用的类名
		String targetClassName=target.getClass().getName();
		//获取被调用的方法名
		String targetMethodName=method.getName();
		//日志格式字符串
		System.out.println("异常通知"+targetClassName+"类的"+targetMethodName+"方法开始执行");
		
	}
}
