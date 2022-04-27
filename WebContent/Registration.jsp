<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<style type="text/css">
	.error{
		color: red;
	}
</style>
</head>
<body>

	<h2>Signup</h2>


	<%
		String firstNameError = (String) request.getAttribute("firstNameError");
		String emailError = (String) request.getAttribute("emailError");
		String passwordError = (String) request.getAttribute("passwordError");

		String firstNameValue = (String) request.getAttribute("firstNameValue");
		String emailValue = (String) request.getAttribute("emailValue");
	%>
	<form method="post" action="RegistrationServlet">

		FirstName : <input type="text" name="firstName"
			value="<%=firstNameValue == null ? "" : firstNameValue%>">
		
		<span class="error">  
		<%=firstNameError == null ? "" : firstNameError%>
		</span>
		<br> <br> Email : <input type="text" name="email"
			value="<%=emailValue == null ? "" : emailValue%>">
		<%=emailError == null ? "" : emailError%>
		<br> <br> Password : <input type="password" name="password" />
		<%=passwordError == null ? "" : passwordError%>
		<br> <br> <input type="submit" value="Signup">
	</form>

</body>
</html>