<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
<div align="center">
<hr>

<h1>Student List</h1>

<form action="add-student-form"method="get">

	<input type="submit" value="Add Student">

</form><br>
  
  <table border="1">
  	<tr>
  		<th>ID</th>
  		<th>Name</th>
  		<th>Mobile</th>
  		<th>Address</th>
  	</tr>
  	
  	<c:forEach var="student" items="${studentList}">
  	<tr>
  		<td>${student.id}</td>
  		<td>${student.name}</td>
  		<td>${student.mobile}</td>
  		<td>${student.address}</td>
  	</tr>
  	</c:forEach>
  </table>
  
  </div>
</body>
</html>