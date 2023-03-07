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
<title>House Hunter</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
	<h1>
		<c:out value="${oneHouse.address}" />
	</h1>
	<a href="/dashboard/">dashboard</a>

	<h4>
		Address: <c:out value="${oneHouse.address}"></c:out>
	</h4>
	<h4>
		Listing Date: <c:out value="${oneHouse.listed}"></c:out>
	</h4>
	<h4>
		Price: $<c:out value="${oneHouse.price}"></c:out>
	</h4>

	<c:set var = "poster" value = "${oneHouse.addedBy}"/>
	<c:set var = "user" value = "${user.id}"/>
		<c:if test="${poster == user}">
		<a href="/edit/h/${oneHouse.id}">Edit</a>
		<a href="/delete/h/${oneHouse.id}">Delete</a>
		</c:if>
<body>

</body>
</html>