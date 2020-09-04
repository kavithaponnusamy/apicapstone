<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
  <h2 class="message">${ message }</h2> 
<h3>List of movies</h3>
<table>
	<c:forEach var="movie" items="${movies }">
		<tr>
			<td><a href="/movie-details?id=${movie.id}">${movie.title}</a></td>
	</c:forEach>
</table>
<br>
<p><a href="/genre-list">List of Available Genres</a></p>
<form action="/search-result-vote" method="post">
<p>Vote Average<input type="number" name="vote_average" step="any" > + or - 1
<button type="submit">Submit</button></p>
</form>
<form action="/search-result-length" method="post">
<p>Length<input type="number" name="runtime" >+ or - 10
<button type="submit">Submit</button></p>
</form>
<%@include file="partials/footer.jsp" %>

</body>
</html>