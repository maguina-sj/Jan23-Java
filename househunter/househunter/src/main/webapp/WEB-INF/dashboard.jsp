<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>House Hunter Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<h2>Welcome <c:out value="${user.username}" />!</h2>
	<a href="/logout/">Log Out</a>
	<table class="table">
		<tr>
			<th>Address</th>
			<th>Listed On</th>
			<th>Added By</th>
			<th>Price</th>			
		</tr>
		<c:forEach var="house" items="${houses}">
			<tr>
				<td><a href="/view/h/${house.id}"><c:out value="${house.address}" /></a></td>
				<td><c:out value="${house.listed}" /></td>
 				<td><c:out value="${house.users[0].username}" /></td>
				<td>$<c:out value="${house.price}" /></td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" onclick="window.location.href='/create/listing';" value="Add Listing" />
</body>
</html>