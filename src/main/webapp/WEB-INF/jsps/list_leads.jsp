<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list Leads</title>
</head>
<body>

<h2>List All Leads</h2>
<table>
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Mobile</th>
		<th>Source</th>
	</tr>
	<c:forEach var="leads" items="${leads}">
	<tr>
		<td>${leads.id}</td>
		<td>  <a href="findLeadById?id=${leads.id}">${leads.firstName}</a>  </td>
		<td>${leads.lastName}</td>
		<td>${leads.email}</td>
		<td>${leads.mobile}</td>
		<td>${leads.source}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>