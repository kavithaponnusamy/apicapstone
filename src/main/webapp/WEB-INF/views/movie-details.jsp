<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="/style.css" rel="stylesheet" />
<meta charset="UTF-8">
<title>Home</title>
 <link href="style.css" rel="stylesheet" />

</head>
<body>
<!--  <h1>${movie.title}</h1>-->
<br>
<h2 class="message">${ message }</h2>
<h1>${movie.title}</h1>
<img src="http://image.tmdb.org/t/p/original${movie.poster_path}"/>
<p> </p>
<h3>Tagline: ${movie.tagline }</h3>
<h3>Vote Average: ${movie.vote_average }</h3>
<p><Strong>Overview:</Strong> ${movie.overview}</p>
<p><Strong>Length of the movie:</Strong> ${movie.runtime }</p>
<p><Strong>Genre: </Strong>
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
<p> <p>

<%@include file="partials/footer.jsp" %>
</body>
</html>