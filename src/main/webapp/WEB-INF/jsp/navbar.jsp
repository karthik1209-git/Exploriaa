<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exploriaa::</title>
<link href ="/styles/navbar.css" rel="stylesheet">
<link href ="/styles/bootstrapmin.css" rel="stylesheet">
<!-- <link href ="/styles/home.css" rel="stylesheet"> -->
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src ="/scripts/navbar.js"></script>
</head>
<body>
<div >	
		<nav >
		  <div class="toggle"><i class="fas fa-bars menu"></i></div>
		  <ul >
		 	<li><a href="home">Exploriaa</a></li>
		    <li>
		    
		    <div class="dropdown">
			  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    Housing
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton"><center>
			    <a class="dropdown-item" href="searchHotel" >Search House</a><br>
			    <a class="dropdown-item" href="cancelReservation">Cancel Reservation</a><br>
			    <a class="dropdown-item" href="editReservation">Edit Reservation</a><br>
			    <a class="dropdown-item" href="payment">Payment</a><br>
			    </center>
			  </div>
			</div>

			</li>
			
		    <!-- <li><a href="addNewHotel">Add New Hotel</a></li> -->
		    
		    
		    <li>
		    
		    <div class="dropdown">
			  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    Food
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton"><center>
			    <a class="dropdown-item" href="searchHotel" >Search House</a><br>
			    <a class="dropdown-item" href="cancelReservation">Cancel Reservation</a><br>
			    <a class="dropdown-item" href="editReservation">Edit Reservation</a><br>
			    <a class="dropdown-item" href="payment">Payment</a><br>
			    </center>
			  </div>
			</div>
			
			</li> 
			
		    <li>
		    
		    <div class="dropdown">
			  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    Travel
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton"><center>
			    <a class="dropdown-item" href="searchHotel" >Search House</a><br>
			    <a class="dropdown-item" href="cancelReservation">Cancel Reservation</a><br>
			    <a class="dropdown-item" href="editReservation">Edit Reservation</a><br>
			    <a class="dropdown-item" href="payment">Payment</a><br>
			    </center>
			  </div>
			</div>
		    
		    </li> 
		    <li>
			<div class="dropdown">
			  <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
			    My Orders
			  </button>
			  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton"><center>
			    <a class="dropdown-item" href="searchHotel" >Search House</a><br>
			    <a class="dropdown-item" href="cancelReservation">Cancel Reservation</a><br>
			    <a class="dropdown-item" href="editReservation">Edit Reservation</a><br>
			    <a class="dropdown-item" href="payment">Payment</a><br>
			    </center>
			  </div>
			</div>
			</li> 
		    
		    <%-- <li><a href="profile.jsp">
		    <% if(session.getAttribute("username")!=null) {%>
				Hi <%=session.getAttribute("username")%> !!
			<%} %>
		    </a></li> --%>
		    <li><a href="logout">Logout</a></li>
		  </ul>
		  
		</nav> 
		
		<!-- <a onclick="document.forms['logoutForm'].submit()">Logout</a>
            </h3></u>

    <form id="logoutForm" method="POST" action="/login">
    </form> 
     <li><a href="addNewHotel">new hotel</a></li> 
      <li><a href="searchHotel">searchHotel</a></li> --> 
    
</div>
</body>
</html>