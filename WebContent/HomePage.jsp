<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<%
	String name = (String) session.getAttribute("uname");
%>
<h1 align="center">
	Hello
	<%=name%>, Welcome to Car Rentals
</h1>
<table align="center">
<tr><td><a href="First.jsp"><input type="button" value="Renting a Car? Click here!"></a></td></tr>
<tr><td><a href="View.jsp"><input type="button" value="View Bookings"></a></td></tr>
</table>
</body>
</html>