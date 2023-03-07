<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>House Hunter</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
</head>
<body>
<h1>Welcome House Hunter!</h1>
	<div class="container pt-5">
		<div class="row">
			<div class="col-6">
				<h2>Register</h2>
				<form:form action="/create/user" method="POST" modelAttribute="newuser">
					<div class="mb-3">
						<form:label path="username"> User Name:</form:label>
						<form:errors path="username" class="text-danger"> 
						</form:errors>
						<form:input path="username" type="text" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="email"> Email:</form:label>
						<form:errors path="email" class="text-danger">
						</form:errors>
						<form:input path="email" type="email" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="birthday"> Birthday:</form:label>
						<form:errors path="birthday" class="text-danger"> 
						</form:errors>
						<form:input path="birthday" type="date" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="password"> Password:</form:label>
						<form:errors path="password" class="text-danger">
						</form:errors>
						<form:input path="password" type="password" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="confirm"> Confirm Password:</form:label>
						<form:errors path="confirm" class="text-danger">
						</form:errors>
						<form:input path="confirm" type="password" class="form-control" />
					</div>
					<input type="submit" value="Register" class="btn btn-primary"/>
				</form:form>
			</div>
			<div class="col-6">
				<h2>Log in</h2>
				<form:form action="/login" method="POST" modelAttribute="loguser">
					<div class="mb-3">
						<form:label path="email"> Email:</form:label>
						<form:errors path="email" class="text-danger">
						</form:errors>
						<form:input path="email" type="email" class="form-control" />
					</div>
					<div class="mb-3">
						<form:label path="password"> Password:</form:label>
						<form:errors path="password" class="text-danger">
						</form:errors>
						<form:input path="password" type="password" class="form-control" />
					</div>
					<input type="submit" value="Log In" class="btn btn-primary"/>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>