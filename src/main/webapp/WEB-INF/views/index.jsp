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
<table>
	<tr>
	<th>Title</th>
	</tr>
	<c:forEach var="movie" items="${movies }">
		<tr>
			<td><a href="/movie-details?id=${movie.id}">${movie.title}</a></td>
	</c:forEach>
</table>
<form action="/search-result-genre" method="post">
<label for="city">Genre</label> 
				<select id="genres" name="genres">
				<option value="drama">Drama</option>
				<option value="action">Action</option>
				<option value="animation">Animation</option>
				<option value="Family">Family</option>				
				</select>
</form>
<form action="/search-result-vote" method="post">
<p>Vote Average<input type="number" name="vote_average" step="any" >
<button type="submit">Submit</button></p>
</form>
<form action="/search-result-length" method="post">
<p>Length<input type="number" name="runtime" >
<button type="submit">Submit</button></p>
</form>
<%@include file="partials/footer.jsp" %>

</body>
</html>