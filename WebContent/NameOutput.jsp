<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name Output</title>
</head>
<body>
	<%
		String name = (String) request.getAttribute("myName");
	%>
	<%=name%>
	<br> EL - expression language -- print
	<bR> ${myName}
	<br> ${3+4 }
	<br> ${3 > 5 }
	<br> ${10 / 2  }
	<br> ${10 div 2  }
	<br> ${10 gt 5 }




</body>
</html>