<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Use Bean</title>
</head>
<body>
	<jsp:useBean id="user" class="com.bean.UserBean"></jsp:useBean>
	<jsp:setProperty property="firstName" name="user" value="ram"/>
	
	<jsp:getProperty property="firstName" name="user"/>
	
	
</body>
</html>