<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<center>
	<body>
		<table border="2">
			<form action="login">
				<div align="center">
					<h1>Login Form</h1>
					<h3>${error}</h3>
					<br> <label>UserName:</label> <input type="text"
						name="username" required /><br> <label>Password:</label> <input
						type="text" name="password" required /><br> <input
						type="submit" />
				</div>
			</form>
		</table>
</center>
</body>
</html>