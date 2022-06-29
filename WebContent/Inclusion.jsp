<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inclusion</title>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>

	<br><br><br><BR><BR><BR><BR><BR>

	<%@include file="Footer.jsp" %>
	<%=k %>
</body>
</html>