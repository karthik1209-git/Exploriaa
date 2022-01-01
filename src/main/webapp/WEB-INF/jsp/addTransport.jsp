<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploriaa::Add Transport Details</title>
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
   <h2>Add New Vehical</h2>
   <p>Please enter vehical details</p>
   </div>
    <form id="Login" method="post" >
		<h3>${error}</h3>
		<h3>${erroradd}</h3>
        <div class="form-group"> 
            <input type="text" class="form-control" name="vname" placeholder="Vehical name" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="seats" placeholder="No.of Seats" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="type" placeholder="Type(Sedan, Hatchback, SUV)" required>
        </div>  
         <div class="form-group">
            <input type="text" class="form-control" name="price" placeholder="Amount" required>
        </div>       <br>
        <div class="from-group">
        	<input type="file" class="form-control" name="photo" required>
        </div>
        <br>
        <button type="submit" class="btn btn-primary">Add new Vehical</button>
		<div class="forgot">
        <a href="adminDashboard"><center>Back</center></a>
    </form>
    </div>

</div></div></div>


</body>
</html>