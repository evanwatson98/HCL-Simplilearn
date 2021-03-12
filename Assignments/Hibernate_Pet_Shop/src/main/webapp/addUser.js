var login = true;
var signup = false;
 
  
var signed = document.querySelector('.signUp');
var logged = document.querySelector('#login');
  
function loginScreen() {
 	if(!login){
 		login = true;
 		signup = false;
 		logged.style.textDecoration = "underline";
 		signed.style.textDecoration = "";
 	}
}
 
 
 function signUp(){
 	if(!signup){
 		signup = true;
 		login = false;
 		signed.style.textDecoration = "underline";
 		logged.style.textDecoration = "";
 	}
 }
 