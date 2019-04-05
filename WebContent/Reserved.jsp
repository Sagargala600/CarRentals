<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
	String uname = (String) session.getAttribute("uname");
	String fname = (String) session.getAttribute("fname");
	String lname = (String) session.getAttribute("lname");
	String phone = (String) session.getAttribute("phone");
	String email = (String) session.getAttribute("email");
	String carbrand = (String) session.getAttribute("cars");
	String carmodel = (String) session.getAttribute("category");
	String totalcost = (String) session.getAttribute("total");
%>
<h1 align="center">Hello <%=uname%>, Below are your details for the car reserved:</h1>
<h2 align="center">Name used for booking car: <%=fname %> <%=lname %></h2>
<h2 align="center">Contact Number given: <%=phone %></h2>
<h2 align="center">Email Address provided: <%=email %></h2>
<h2 align="center">Car brand and model selected: <%=carbrand %> <%=carmodel %></h2>
<h2 align="center">Total cost for the booking is: $<%=totalcost %></h2>
<body bgcolor="lightgreen">
<form method="post" action="logout"><input align="Center" type="submit" value="Logout"></form>
</body>
</html>