<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	
	<h2>Signup</h2>

	<form method="post" action="RegistrationServlet">

		FirstName : <input type="text" name="firstName"><br> <br>
		Email : <input type="text" name="email"><br> <br>
		Password : <input type="password" name="password" /><br> <br>
		<input type="submit" value="Signup">
	</form>


</body>
</html>