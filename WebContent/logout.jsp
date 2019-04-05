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
%>
<body bgcolor="lightblue">
<h1 align="center">Thank you for you business, <%=uname %></h1>
<h2 align="center"> you have been successfully logged out</h2>
</body>
</html>