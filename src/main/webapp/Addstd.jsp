<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddStudent</title>
</head>
<body>
	<center>
		<form action="addstd">
			<input type="text" placeholder="EnterId" name="sid"><br><br>
			<input type="text" placeholder="EnterName" name="sname"><br><br>
			<input type="text" placeholder="EnterDept" name="stream"><br><br>
			<input type="text" placeholder="EnterPer" name="sper"><br><br>
			<input type="submit" value="Add">
		</form>
		<%
		  String s=(String) request.getAttribute("result");
		   if(s!=null)
		   {
		%>
		<marquee direction="right"><h1 style="color: green;"><%= s %></h1></marquee>
		<%} %>
	</center>
</body>
</html>