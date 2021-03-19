<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Create a feedback</h1>
<form action="/feedback" method="post">
		<label>
			<input type="text" name="username" id="username" placeholder="User">
			<input type="text" name="rating" id="rating" placeholder="Rating">
			<input type="text" name="comment" id="comment" placeholder="Comments">
			
			<input type="submit" value="Submit">
		</label>
</form>

<script>
</script>
</body>
</html>