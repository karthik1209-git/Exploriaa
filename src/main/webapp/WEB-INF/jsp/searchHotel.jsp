<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploriaa::Search Hotel</title>
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
					<div><h2 style="color:white;">Search Hotels</h2>
					</div><br>
							<div class="form-group">
						      <label for="Origin" style="color:white;">Rating</label>
						      <input type="text" class="form-control" placeholder="Enter rating:" name="rating" width="200px" >
						     </div>
						     <!-- <div class="form-group">
						      <label for="Destination">Destination</label>
						      <input type="text" class="form-control" placeholder="Enter destination:" name="destination">
						     </div> -->
						     <button type="submit" class="btn btn-primary">Search</button>
				</div>	
			</form>			
		</div>
		
		<div style="margin-left: 3%;">
			
			<h3 style="color: red;"> ${error}</h3>
			<%-- <h3 style="color: green;"> ${hotelnames}</h3> --%>
			<div class="container">
				<div style="width: 400px;">
						<ul>
						<c:forEach var="listValue" items="${hotelnames}">
							<li>${listValue}
							<img src="data:image/jpg;photo,${hotel.photo}" width="240" height="300"/>
							</li>
						</c:forEach>
						</ul>
				</div>
			</div>
				<div class="col-sm-12 col-md-12">
					<div><h2 style="color:white;">Book Hotels</h2>
					</div><br>
							<div class="form-group">
						      <label for="Origin" style="color:white;">Hotel Name</label>
						      <input type="text" class="form-control" placeholder="Enter hotelname:" name="hotelname" width="180px" >
						     </div>
						     <button type="submit" class="btn btn-primary" onclick="location.href='/payment'">Book</button>
				</div>	
			
		</div>
</body>
</html>