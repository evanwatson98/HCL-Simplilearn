/**
 * 
 */

function validateForm(){
	
 	var name = document.forms["addPet"]["petName"].value;
 	var color = document.forms["addPet"]["petColor"].value;
 	var price = document.forms["addPet"]["petPrice"].value;

  	if (name == ""){
    	alert("Name must be filled out");
    	return false;
  	}else if(color == ""){
	    alert("Color must be filled out");
    return false;

	}else if(price==""){
		alert("Price must be filled out");
    return false;

	}
}