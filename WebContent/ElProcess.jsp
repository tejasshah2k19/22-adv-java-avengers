<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EL Process</title>
</head>
<body>
	NAme := ${param.name}
	<br> Age := ${param.age }
	<br>Vote := ${param.age >= 18 ?"E":"NE" }
	<br>
		NAme := ${param.name.toUpperCase()}
		
	
	
	
</body>
</html>