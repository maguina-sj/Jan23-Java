<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<h1>Welcome to Lookify</h1>
<a href="/song/new">+Add a song</a>
<a href="/songs/top">Top Songs</a>


<table class="table table-striped">
<thead>
<tr>
<th>Title</th>
<th>Artist</th>
<th>Rating</th>
<th>Actions</th>
</tr>
</thead>
<c:forEach items="${songs}" var="song">
	<tr>
		<td><a href="/song/details/${song.id}">${song.title}</a></td>
		<td>${song.artist}</td>
		<td>${song.rating}</td>
		<td><a href="/song/delete/${song.id}">Delete</a></td>
	</tr>	
	</c:forEach>
</table>
</div>

</body>
</html>