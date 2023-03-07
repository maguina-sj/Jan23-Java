<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
 <head>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    <!-- For any Bootstrap that uses JS or jQuery-->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
        <meta charset="UTF-8">
        <title>Ninja Gold Game</title>
</head>
<body>
    <div class="container">
	<div class="row align-items-center, justify-content-around">
	<h1>Your Gold: <span class="gold_box"> <c:out value="${gold}"/> </span></h1>
	
    	<div class="col-3">
      	<h3>Farm</h3>
      	<p>(earn 10-20 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="farm" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
      	<h3>Cave</h3>
      	<p>(earn 10-20 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="cave" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
     	<h3>House</h3>
      	<p>(earn 0-10 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="house" value="Find Gold!"/></form>
    	</div>
    	<div class="col-3">
     	<h3>Quest</h3>
      	<p>(earn/takes 0-50 gold)</p>
      	<form action="/gold" method="post"><input class="button" type="submit" name="quest" value="Find Gold!"/></form>
    	</div>
  	</div>
  	<a class="btn btn-primary" href="/clear" role="button">Reset</a>
  </div>
  <div class="container2">
  	<h3>Activities:</h3>
  	<c:forEach var="activity" items="${activities}">
	<c:out escapeXml= "false" value="${activity}"/>
	</c:forEach >
	
  </div>
</body>
</html>