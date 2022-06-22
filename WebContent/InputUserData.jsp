<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveUserDataServlet" method="post">


	FirstName :  <input type="text" name="firstName"><br><BR>
	CreditCardNumber : <input type="text" name="cc"><br><br>
	<input type="submit" value="save"/>
</form>
</body>
</html>