<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="struts"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
   <struts:form action="register">
    <!-- 文字标签 -->
    <struts:label value="注册页面"></struts:label>
    <!-- 输入文本信息 -->
    <struts:textfield name="name" label="用户名"/>
     <!-- 输入密码 -->
    <struts:password name="password" label="密码"/>
      <!-- 确认密码 -->
    <struts:password name="repassword" label="确认密码"/> 
      <!-- 邮箱 -->
    <struts:textfield name="email" label="邮箱"/> 
      <!-- 性别 -->
    <struts:radio list="#{'male':'男' ,'female':'女'}" name="sex" label="性别"/> 
      <!-- 年龄 -->
    <struts:textfield name="age" label="年龄"/>  
     <!-- 提交按钮 -->
    <struts:submit value="注册"></struts:submit>
   
   
   
   </struts:form>
  </body>
</html>
