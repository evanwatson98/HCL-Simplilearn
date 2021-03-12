<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
  <link rel="shortcut icon" type="image/svg+xml" href="images/pets-24px.svg" />

<link rel="stylesheet" href="addUser.css">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="index.jsp">Pet Shop</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

</nav>

<div class="text-center">A Pet Friendly Web Site</div>
<div style="color: white; width: 100%; height: 100%; display: flex; justify-content: center; margin-bottom: 5rem; margin-top: 5rem;">
		<div style="width: 500px; height: 500px; background-color: #1aad33; border-radius: 30px; position: relative;">
					<div class="text-center" style="border: solid 10px white; border-radius: 50%; background-color: pink; width: 150px; height: 150px; position: absolute; left: 175px; top: -75px; color: white;">
						<p style="margin-top: 10px; font-size: 35px; font-family: cursive"> Pet Shop</p>
					</div>
		
		<div style="margin-top: 80px;">
			<div class="d-flex justify-content-between">
				<div class = "account login" id="login" style="text-decoration: underline; font-size: 25px; margin-left: 70px;" onclick="loginScreen()">Login</div>
				<div class="account signUp" style=" font-size: 25px; margin-right: 70px;" onclick="signUp()">Sign Up</div>
			
			</div>
		
			<form name="addPet" action="addPet" onsubmit="return validateForm()" method="post" style="margin-top: 40px;">
				<label class="d-flex justify-content-center" style="width: 100%;">
				
					<div>
						<label for="email">Email</label>
						<div class="" style="width: 100%;">
							<input type="email" id="email" name="email">
						</div>
						<br>
						
						<label for="pwd">Password</label>
						
						<div class="" style="width: 100%;">
							<input type="password" id="pwd" name="pwd">
						</div>					
						<br>
						<br>
						<div class="d-flex justify-content-end" style="width: 100%;">
							<input type="submit" value="Submit" class="btn btn-primary btn-lg" style="background-color: pink; border-color: pink;">
						</div>
					</div>		
					
				</label>
			</form>
		</div>
		
		</div>
</div>	
	
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

	<script src="addUser.js"></script>

</body>
</html>