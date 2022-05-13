<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>election</title>
</head>
<body>
<form action="ElectionServlet" method="post">
	CitizeName: <input type="text" name="cname"><br><br> 
	Gender :  Male<input type="radio" name="gender" value="male">
				Female<input type="radio" name="gender" value="female"/><br><br> 
	DateOfBirth : <input type="date" name="dob" >
	<br><br>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>