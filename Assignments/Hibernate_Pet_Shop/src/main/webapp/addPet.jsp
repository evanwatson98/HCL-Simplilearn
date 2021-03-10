<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Let us make sure your pet goes to a good home</h2>
	<h3>Add Pet</h3>
	
	<form name="addPet" action="addPet" onsubmit="return validateForm()" method="post">
		<label>
			<input type="text" name="petName" id="petName" placeholder="Name">
			<input type="text" name="petColor" id="petColor" placeholder="Color">
			<input type="number" step="0.01" name="petPrice" id="petPrice" placeholder="Price">

			<input type="submit" value="Submit">
		</label>
	</form>
	<script src="addPet.js"></script>
</body>
</html>