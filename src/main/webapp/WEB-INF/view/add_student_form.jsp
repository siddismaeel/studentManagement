<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">

	<h3>Add Student</h3><hr><br>
	
	<form:form modelAttribute="student" action="add-student"  method="get">
	<table>
	
	<tr>
		<form:hidden path="id"/>
		<td><label>Name: </label></td>
		<td> <form:input path="name"/></td>
	</tr>
	<tr>
		<td><label>Address: </label></td>
		<td><form:input path="address"/></td>
	
	</tr>
	<tr>
		<td><label>Mobile Number:</label></td>
		<td> <form:input path="mobile"/>
	</tr>
	<tr>
		<td><input type="submit" value="Submit"></td>
	</tr>
	</table>
	
	</form:form>
	
	


</div>
</body>
</html>