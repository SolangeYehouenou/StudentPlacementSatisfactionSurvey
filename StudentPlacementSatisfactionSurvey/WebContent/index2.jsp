<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>System Login</title>
 <link rel="stylesheet" type="text/css" href="style2.css">
</head>
<body>
  <!-- The lines below showcase our login system where the user can login to start the survey. There is an option to
  login using email and password and another to login using facebook profile. I use the Facebook Graph API to access the user profile. This will show
  the user's username, email, profile picture and Id.-->
<div align="center">
<h1>User Login Form</h1>
<form action="index2" method="post" class="container">
<table>
<tr><td align="center">User Name: </td><td><input type="text" name="username"></td></tr>
<tr></tr>
<tr><td align="center">Password: </td><td><input type="password" name="password"></td></tr>
<tr></tr>
<tr><td></td><td><h1><input type="submit" value="Login" class="button"></h1><br></td></tr>
<tr id="title"><td><h1> Or Login Using FaceBook: </h1></td></tr>


</table>
</form>
</div>
	
<div align="center" class="container">

<script>

 // This is called with the results from from FB.getLoginStatus().
 //On this page designed AS GUI, I use event driven programming where the use of buttons such as submit or logout leads to specific events within
//a central unit that accepts all data and then delegates it to the separate modules that handle the particular type. 

 function statusChangeCallback(response) {
 console.log('statusChangeCallback');
 console.log(response);
 console.log(response.authResponse.accessToken);
 //alert(response.authResponse.accessToken);
 if (response.status === 'connected') {
 window.location.href='Sign_in_Controller.jsp?access_token='+response.authResponse.accessToken; 
 } else {
 // The person is not logged into your app or we are unable to tell.
 document.getElementById('status').innerHTML = 'Please log ' +
 'into this app.';
 }
 }
 // This function is called when someone finishes with the Login
 // Button. See the onlogin handler attached to it in the sample
 // code below.
 function checkLoginState() {
 FB.getLoginStatus(function(response) {
 statusChangeCallback(response);
 });
 }
 window.fbAsyncInit = function() {
 FB.init({
 appId : '204724307877943',
 cookie : true, // enable cookies to allow the server to access 
 // the session
 
 xfbml : true, // parse social plugins on this page
 version : 'v9.0' // use graph api version 2.8
 });
 FB.getLoginStatus(function(response) {
 statusChangeCallback(response);
 });
 };
 // Load the SDK asynchronously
 (function(d, s, id) {
 var js, fjs = d.getElementsByTagName(s)[0];
 if (d.getElementById(id)) return;
 js = d.createElement(s); js.id = id;
 js.src = "https://connect.facebook.net/en_US/sdk.js";
 fjs.parentNode.insertBefore(js, fjs);
 }(document, 'script', 'facebook-jssdk'));
 // Here we run a very simple test of the Graph API after login is
 // successful. See statusChangeCallback() for when this call is made.
</script>
<fb:login-button scope="public_profile,email" onlogin="checkLoginState();">
</fb:login-button>
<div id="status">
</div>
</div>

</body>
</html>