package com.springtest1.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long beginTime=System.currentTimeMillis();
		invocation.proceed();
		long endTime=System.currentTimeMillis();
	
		//获取被调用的方法名
		String targetMethodName=invocation.getMethod().getName();
		//日志格式字符串
		System.out.println("环绕通知"+targetMethodName+"方法开始执行时间"+beginTime+"调用后时间"+endTime);
		return null;
	}

}
