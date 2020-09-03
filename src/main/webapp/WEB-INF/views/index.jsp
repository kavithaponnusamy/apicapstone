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
<br><br>
<p><a href="/genre-list">List of Available Genres</a></p>
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