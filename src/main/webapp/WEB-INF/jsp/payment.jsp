<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploriaa::Payment</title>
<link href="/styles/bootstrap.min.css" rel="stylesheet" >
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<div style="margin-left:3%;" >
			<form  method="post">
				<div class="col-sm-12 col-md-12">
					<div><h2 style="color:white;">Payment</h2>
					</div><br>
							<div class="form-group">
						      <label for="Origin" style="color:white;">Email</label>
						      <input type="email" class="form-control" placeholder="Enter email:" name="email" width="200px" required>
						     </div>
						     <div class="form-group">
						      <label for="Origin" style="color:white;">Hotel Name</label>
						      <input type="text" class="form-control" placeholder="Enter Food Item/Hotelname/Vehicle:" name="hotelname" width="200px" required>
						     </div>
						     <div class="form-group">
						      <label for="Origin" style="color:white;">Rooms</label>
						      <input type="text" class="form-control" placeholder="Enter count of plates/rooms/vehicles" name="rooms" width="200px" required>
						     </div>
						     <div class="form-group">
						      <label for="Origin" style="color:white;">Amount</label>
						      <input type="text" class="form-control" placeholder="Enter amount:" name="price" width="200px" required>
						     </div>
						     <button type="submit" class="btn btn-primary">Pay</button>
				</div>	
				<br>
				<h2 style="color:white;">${success}</h2>
			</form>			
		</div>
</body>
</html>