<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>Ans</h2>

	<%
		//scriptlet 
		int ans = (Integer)request.getAttribute("answer");//Object -> Integer  
		int k = 90;
		int l = 900;
		out.println(k+"<br>");
		
		out.println("<BR>ADD = "+ans);
	%>


</body>
</html>