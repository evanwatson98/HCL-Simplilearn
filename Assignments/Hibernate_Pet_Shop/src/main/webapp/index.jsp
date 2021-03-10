<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="searchPet.css">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>

<div style="width: 100%; color: black; background-color: white; font-size: 50px;">
		Pet Store
		<a href="addPet.jsp">Add pet</a>
		<img src="images/fence.png" style="width: 100%;">
	</div>		
		<div class="dFlex" style="margin-top: 3%;">
			<h1>Discover the BEST pet for YOU</h1>
		</div>
		<div class="dFlex">
			<div>
			
				<form action="SearchPet" method="get">
					<label>
						<input type="text" name="petid" id="petid" placeholder="Pet ID #">
						<input type="submit" value="Submit">
					</label>
				</form>
			
			</div>
		</div>
		
		<div class="discoverContainer">
			 <img src="images/doggo.jpg" class="projectLink">
			 <img src="images/cat.jpg" class="projectLink">
			 <img src="images/bird.jpg" class="projectLink">
			 <img src="images/fish.jpg" class="projectLink">
			 <img src="images/turtle.jpg" class="projectLink">
			 
		</div>
		
		<img src="images/bottomFrame.png" style="width: 100%; margin-top: 2%;">
		
		<!-- Bootstrap -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>