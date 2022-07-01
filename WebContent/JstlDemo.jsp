<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<c:set var="x" value="900"></c:set>
	<c:out value="${x}"></c:out>
	<br>

	<c:if test="${x % 2 == 0}">
		Even
	</c:if>

	<c:if test="${x % 2 != 0}">
		Odd
	</c:if>
	<br>

	<c:set var="names" value="ram,shyam,sita,ravan">
	</c:set>

	<c:forTokens items="${names}" delims="," var="n">
		<c:out value="${n}"></c:out>
	</c:forTokens>


	<c:set var="choice" value="1">
	</c:set>
	<br>
	<c:choose>
		<c:when test="${choice == 1 }">
			case 1:
		</c:when>

		<c:when test="${choice == 2 }">
			case 2:
		</c:when>
		<c:otherwise>
			Default:
		</c:otherwise>
	</c:choose>
	<br>
	
	<br>
	<c:forEach var="i" begin="1" end="10" step="1">
			${i}<br>
	</c:forEach>

</body>
</html>












