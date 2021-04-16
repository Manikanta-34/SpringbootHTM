<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<ol>
		<c:forEach var="emp" items="${listofdata}">

			<li>${emp}</li>

		</c:forEach>
	</ol> --%>
	<table border="2" align="center">
		
			<th>username</th>
			<th>password</th>
			<tr>
			<c:forEach items="${listofdata}" var="element">

				<td>${element.username}</td>
				<td>${element.password}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>