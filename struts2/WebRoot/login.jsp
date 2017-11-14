<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="struts"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	
  </head>
  
  <body>
  
  		<struts:fielderror />
  
  		<struts:form action="loginPerson">
  			<struts:label value="登录系统"></struts:label>
  			<struts:textfield name="account" label="帐号"></struts:textfield>
  			<struts:password name="password" label="密码"></struts:password>
  			<struts:submit value="登录"></struts:submit>
  		</struts:form>
  
  	helloween, 1234
  
  </body>
</html>
