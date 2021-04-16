<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
	<body>
		<form action="/">
			<h1>${error}</h1>
			<h1>Your Login details are:: ${username} and ${password}</h1>
			<table border="1">
				<th>UserName</th>
				<th>Password</th>
				<tr>
					<td>${username}</td>
					<td>${password}</td>
				</tr>


			</table>
			<br> <a href="/">Go back to Home</a>
			<!-- <input type="submit"
			value="go back to home" /> -->
		</form>
</center>
</body>
</html>