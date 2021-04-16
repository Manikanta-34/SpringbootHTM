<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Venkat</title>
<style>
table, td, th {
	border: 2px solid black;
	width: 400px;
	text-align:left;
	margin-left: auto;
	margin-right: auto;
}

body {
	background: cyan;
	text-align: center
}
</style>
</head>

<body>
	<h1>List of Data</h1>
	<table>
		<tr>
			<th>Index</th>
			<th>Latitude</th>
			<th>Longitude</th>
			<th>CompanyName</th>
		</tr>
		<c:forEach items="${listofdata}" var="geo">

			<tr>
				<td>${geo.id}</td>
				<td>${geo.lat}</td>
				<td>${geo.lng}</td>
				<td>${geo.name}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
