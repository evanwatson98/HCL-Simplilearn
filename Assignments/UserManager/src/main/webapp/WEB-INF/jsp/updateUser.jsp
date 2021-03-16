<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update a User</h1>

<form action="/editUser" method="post">
		<label>
			<input type="text" name="userId" id="userId" value = "${user.id}">
			<input type="text" name="name" id="name" value = "${user.name}">
			<input type="text" name="email" id="email"value = "${user.email}">
			<input type="text" name="password" id="password" value = "${user.password}">			
			<input type="submit" value="Submit">
		</label>
</form>
</body>
</html>