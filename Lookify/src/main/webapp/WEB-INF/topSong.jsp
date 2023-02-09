<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Songs</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" href="/css/style.css"/>
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table table-striped">
<thead>
<tr>
<th>Title</th>
<th>Artist</th>
<th>Rating</th>

</tr>
</thead>
<c:forEach items="${topSongs}" var="song">
	<tr>
		<td>${song.title}</td>
		<td>${song.artist}</td>
		<td>${song.rating}</td>

	</tr>	
	</c:forEach>
</table>
</body>
</html>