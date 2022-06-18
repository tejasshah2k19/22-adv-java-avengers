<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!public void add() {

	}

	public void jspInit() {

	}

	public void jspDestroy() {

	}%>

	<form action="CalculateAgeServlet">
		BirthYear<input type="text" name="byear" /> ${error} <br> <br>
		<input type="submit" value="CalculateAge">
	</form>
</body>
</html>