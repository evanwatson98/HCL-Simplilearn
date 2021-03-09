<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="searchPet.css">

</head>
<body>

<div style="width: 100%; color: black; background-color: white; font-size: 50px;">
		Pet Store
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

</body>
</html>