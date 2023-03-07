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
<title>Edit Listing</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">

</head>
<body>
	<h1>Edit Listing</h1>
	<a href="/dashboard/">Dashboard</a>
	<div class="container pt-5">
		<div class="row">
			<div class="col-6">
				<form:form action="/edit/h/${house.id}" method="POST"
					modelAttribute="house">
					  <input type="hidden" name="_method" value="put">
					
					<div class="mb-3">
						<form:label path="address"> Address:</form:label>
						<form:errors path="address" class="text-danger">
						</form:errors>
						<form:input path="address" type="text" class="form-control" />
						<form:input path="addedBy" type="hidden" value="${user.id}" />
					</div>
					<div class="mb-3">
						<form:label path="price"> Price:</form:label>
						<form:errors path="price" class="text-danger">
						</form:errors>
						<form:input path="price" type="number" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="listed"> Listing Date:</form:label>
						<form:errors path="listed" class="text-danger">
						</form:errors>
						<form:input path="listed" type="date" class="form-control" />
					</div>
					<input type="submit" value="Submit" />
				</form:form>
				<a href="/edit/delete/${house.id}">Delete</a>
			</div>
		</div>
	</div>

</body>
</html>