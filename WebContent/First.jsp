<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script src="Select.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body bgcolor="lightgreen">
	<form name="form" id="form1" method="post" action="ReserveCar">
		<table align="center">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" required></td>
			</tr>
			<tr>
				<td>Last Name</td>
				<td><input type="text" name="lname" required></td>
			</tr>
			<tr>
				<td>Phone Number</td>
				<td><input type="tel" name="phone" required></td>
			</tr>
			<tr>
				<td>Email (optional)</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Available Cars</td>
				<td><select name="cars" id="cars" onchange="changecar();">
						<option value="">Brands</option>
						<option value="A">BMW</option>
						<option value="B">AUDI</option>
						<option value="C">JAGUAR</option>
				</select> <select name="category" id="category">
						<option value="">Models</option>
				</select></td>
			</tr>
			<tr>
				<td>Select No.of Days you want the car</td>
				<td><select name="days" id="days" onchange="calculatetotal();">
						<option value="">Select how many days</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
				</select></td>
			</tr>
			<tr>
				<td>Total Based on your selection in $'s</td>
				<td><input type="text" name ="total" id="total"></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="Reserve Car"></td>
			</tr>
		</table>
	</form>
</body>
</html>