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
<title>Add Listing</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<h1>New Listing</h1>
	<a href="/dashboard/">Dashboard</a>
	<div class="container pt-5">
		<div class="row">
			<div class="col-6">
				<form:form action="/create/listing" method="POST"
					modelAttribute="newHouse">
					<div class="mb-3">
						<form:label path="address"> Address:</form:label>
						<form:input path="addedBy" type="hidden" value="${user.id}" />
						<form:errors path="address" class="text-danger">
						</form:errors>
						<form:input path="address" type="text" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="price"> Price:</form:label>
						<form:errors path="price" class="text-danger">
						</form:errors>
						<form:input path="price" type="number" class="form-control" />
					</div>
					<input type="submit" value="Submit" />
				</form:form>
			</div>
		</div>
	</div>

</body>
</html>