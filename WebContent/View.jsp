<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
 
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
	Hello <%=name%>, Below are your bookings
</h1>
<table align="center" border="2">
<tr>
<td>FirstName</td>
<td>LastName</td>
<td>Phone</td>
<td>Email</td>
<td>Car Brand</td>
<td>Car Model</td>
<td>Total</td>
</tr>
<%
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost/user";
String username="root";
String password="Eantiomers60";
String uname = (String) session.getAttribute("uname");
String query="select * from cardetails where userName ='" + uname+"'";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{
	%>

	<tr>
	<td><%=rs.getString(1) %></td>
	<td><%=rs.getString(2) %></td>
	<td><%=rs.getString(3) %></td>
	<td><%=rs.getString(4) %></td>
	<td><%=rs.getString(5) %></td>
	<td><%=rs.getString(6) %></td>
	<td><%=rs.getString(7) %></td>	
	</tr>
<%
}
%>
</table>
<%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }
%>
<table align="center">
<a href="logout.jsp"><input type="button" value="logout"></a></table>
</body>
</html>