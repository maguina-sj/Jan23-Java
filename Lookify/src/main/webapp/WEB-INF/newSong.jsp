<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/song/new" method="POST" modelAttribute="newSong">
<div class = "form-group">
		<form:label path="title">Title:</form:label>
    	<form:input path="title" class="form-control"/>
    	<form:errors class ="text-danger" path="title"/>
		</div>
		<div class = "form-group">
		<form:label path="artist">Artist:</form:label>
    	<form:input path="artist" class="form-control"/>
    	<form:errors class ="text-danger" path="artist"/>
		</div>
		<div class = "form-group">
		<form:label path="rating">Rating:</form:label>
    	<form:input path="rating" class="form-control"/>
    	<form:errors class ="text-danger" path="rating"/>
		</div>
		<button class ="btn-primary">Add This Song</button>
</form:form>
</body>
</html>