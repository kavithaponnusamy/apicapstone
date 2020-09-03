<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>details </title>
</head>
<body>
<h1>${movie.title}</h1>
<br>
<h2 class="message">${ message }</h2>
<br>
<h3>${movie.tagline }</h3>
<h3>${movie.vote_average }</h3>
<p>${movie.overview}</p>
<p>${movie.runtime }</p>
<c:forEach var="genre" items="${movie.genres }">
<p>${genre.name}</p>

</c:forEach>
<div>
<form method="post">
			<input type="hidden" name="title" value="${movie.title}">
			<input type="hidden" name="runtime" value="${movie.runtime}">
			<input type="hidden" name="vote_average" value="${movie.vote_average}">
			<input type="hidden" name="api_id" value="${movie.id}">

			<button type="submit">Add to Favorites</button>

		</form>
</div>
<form action="/result" method="post">
Vote Average<input type="number" name="vote_average" step="any" >
Length<input type="number" name="length" >
<button type="submit">Submit</button>
</form>

<%@include file="partials/footer.jsp" %>
</body>
</html>