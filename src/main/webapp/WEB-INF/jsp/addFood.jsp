<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploriaa::Add Food Details</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="/styles/login.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<body id="LoginForm">
<div class="container">
<!-- <h1 class="form-heading">login Form</h1> -->
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Add New Food Item</h2>
   <p>Please enter food details</p>
   </div>
    <form id="Login" method="post" >
		<h3>${error}</h3>
		<h3>${erroradd}</h3>
        <div class="form-group"> 
            <input type="text" class="form-control" name="foodname" placeholder="Food name" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="plates" placeholder="No.of Plates" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="type" placeholder="Type(Indian, Italian, Chinese)" required>
        </div>  
         <div class="form-group">
            <input type="text" class="form-control" name="price" placeholder="Amount" required>
        </div>       <br>
        <div class="from-group">
        	<input type="file" class="form-control" name="photo" required>
        </div>
        <br>
        <button type="submit" class="btn btn-primary">Add new Food Item</button>
		<div class="forgot">
        <a href="adminDashboard"><center>Back</center></a>
    </form>
    </div>

</div></div></div>


</body>
</html>