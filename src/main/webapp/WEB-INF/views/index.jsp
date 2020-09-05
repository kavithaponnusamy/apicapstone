<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
  <link href="style.css" rel="stylesheet" />
<body>
  <h2 class="message">${ message }</h2> 

<table>
	<tr><th><h1>List of movies</h1></th>
	<th></th>
	<th><a href="/genre-list">List of Available Genres</a><th>&nbsp;&nbsp;&nbsp;
	<th><form action="/search-result-vote" method="post">
Vote Average: <input type="number" name="vote_average" step="any" >
<button type="submit">Submit</button>&nbsp;&nbsp;&nbsp;
</form></th>
<th><form action="/search-result-length" method="post">
<p>Length: <input type="number" name="runtime" >
<button type="submit">Submit</button></p>  
</form></th>
	
	<c:forEach var="movie" items="${movies }">
		<tr>
			<td><a href="/movie-details?id=${movie.id}">${movie.title}</a></td>
			<td><img src="http://image.tmdb.org/t/p/original${movie.poster_path}" /></td>
		</tr>	
	</c:forEach>
</table>
<br>





<%@include file="partials/footer.jsp" %>

</body>
</html>