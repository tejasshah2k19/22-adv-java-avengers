<%@page import="com.util.UserStorage"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>List Users</h2>
	<%
		for (int i = 0; i < UserStorage.users.size(); i++) {
			out.println(UserStorage.users.get(i).getFirstName() + "<br>");
		}
	%>


</body>
</html>