<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pet Shop</title>
  <link rel="shortcut icon" type="image/svg+xml" href="images/pets-24px.svg" />

<link rel="stylesheet" href="searchPet.css">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Pet Shop</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavDropdown">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Find Pet <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="addPet.jsp">Add Pet</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Pricing</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          About
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="#">Blog</a>
          <a class="dropdown-item" href="#">Creators</a>
          <a class="dropdown-item" href="#">Contact</a>
        </div>
      </li>
    </ul>
  </div>
</nav>

	<img onclick="location.href='Login.jsp';" src="images/account_circle-24px.svg" class="accountBtn" style="width: 3rem; height: auto; position: absolute; top:2px; right: 5rem;">    
	      	
	      	    
	<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">		
	  <div class="carousel-inner">
	    <div class="carousel-item active" style="background-image: url(images/pinkPet.jpg)">
	      <div class="carouselCont" style="color: white; position: absolute; top: 0; left: 0; padding-left: 4rem; padding-top: 2rem;">
	      	<h1>Find a Pet</h1>
	      	<p style="font-size: 1rem; width: 30%;">Find an adoring pet by searching for a pet that best fits you!</p>
	      </div>
	    </div>
	    <div class="carousel-item" style="background-image: url(images/petLook.jpg)">
		    <div class="carouselCont" style="color: white; position: absolute; top: 0; left: 0; padding-left: 4rem; padding-top: 2rem;">
		      	<h1>Adoption</h1>
		      	<p style="font-size: 1rem; width: 25%;">Add a pet to our web site to put them up for adoption. We will make sure they go to a safe and caring home.</p>
		      </div>
	    </div>
	  
	  </div>
	  <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="sr-only">Previous</span>
	  </a>
	  <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="sr-only">Next</span>
	  </a>
	  		  
	</div>
	
	
	
		
	<div class="dFlex text-center" style="margin-top: 3%;">
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
	
	<!--  
	<div class="discoverContainer d-flex justify-content-center">
		 <img src="images/doggo.jpg" class="projectLink">
		 <img src="images/cat.jpg" class="projectLink">
		 <img src="images/bird.jpg" class="projectLink">
		 <img src="images/fish.jpg" class="projectLink">
		 <img src="images/turtle.jpg" class="projectLink">
		 
	</div>
	-->
	
	<div class="discoverContainer d-flex justify-content-center">
		
		<div class="single-content" style="background-image: url(images/doggo.jpg)">
			<h1 class="title">Doggo</h1>
			<div class="img-text">
				<h2>Find a Dog</h2>
			</div>
		</div>
		
		<div class="single-content" style="background-image: url(images/cat.jpg)">
			<h1 class="title">Cat</h1>
			<div class="img-text">
				<h2>Find a Cat</h2>
			</div>
		</div>
		
		<div class="single-content" style="background-image: url(images/bird.jpg)">
			<h1 class="title">Bird</h1>
			<div class="img-text">
				<h2>Find a Bird</h2>
			</div>
		</div>
		
		<div class="single-content" style="background-image: url(images/fish.jpg)">
			<h1 class="title">Fish</h1>
			<div class="img-text">
				<h2>Find a Fish</h2>
			</div>
		</div>
		
		<div class="single-content" style="background-image: url(images/turtle.jpg)">
			<h1 class="title">Turtle</h1>
			<div class="img-text">
				<h2>Find a Turtle</h2>
			</div>
		</div>
	</div>
	
	<img src="images/bottomFrame.png" style="width: 100%; margin-top: 2%;">

		
		
		
		
		<!-- Footer -->
<footer class="text-center text-lg-start" style="background-color: #13912e; color: white;">
  <!-- Grid container -->
  <div class="container p-4">
  <div class="text-center">
	  	<h5 class="text-uppercase">Contact</h5>
  </div>
  
  <div class="d-flex justify-content-center" style="margin-top: 2rem;">
  	<div style="margin-right: 3rem;">

        <ul class="list-unstyled mb-0">
          <li>
            Email
          </li>
          <li>
            Phone
          </li>
        </ul>
      </div>
      
      <div>

        <ul class="list-unstyled">
          <li>
          	evan_watson@hcl.com
          </li>
          <li>
            (###)###-####
          </li>
        </ul>
      </div>
  </div>
  </div>

  <!-- Grid container -->

  <!-- Copyright -->
  <div class="text-center p-3" style="background-color: rgba(19, 145, 46, 0.2);">
    © 2020 Copyright:
    <a class="text-light" href="#">PetShop.com</a>
  </div>
  <!-- Copyright -->
</footer>
<!-- Footer -->


		
		<!-- Bootstrap -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>