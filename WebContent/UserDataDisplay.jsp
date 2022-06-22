<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
FirstName =>  ${cookie.firstName.value }
<Br>
CC => ${sessionScope.cc}
 <br><br>
<%=session.getAttribute("cc") %>
<a href="LogoutServlet">Logout</a>
</body>
</html>