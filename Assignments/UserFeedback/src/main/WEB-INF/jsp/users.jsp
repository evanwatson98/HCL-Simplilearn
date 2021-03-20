<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<style>
table, th, td {
  border: 1px solid black;
}
</style>
</head>
<body>
<h2>Users</h2>

<table style="float:left">
   <tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
   <c:forEach items="${users}" var="user" varStatus="count">
    <tr id="${count.index}">
    	<td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
        <td>${user.password}</td>
    </tr>
  </c:forEach>
</table>
<br>

<h1>Select A user by ID</h1>
<form action="/users" method="post">
		<label>
			<input type="text" name="userId" id="userId" placeholder="User ID #">
			<input type="submit" value="Submit">
		</label>
</form>

</body>
</html>

