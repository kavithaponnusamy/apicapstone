<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list of genres</title>
</head>
<body>

	<!--<c:forEach var="genre" items="${genres }">
		
			<a href="/genre-list?id=${genre.id}">${genre.name}</a>
	</c:forEach>-->
	<h1>Select a genre to see the top movies of that genre</h1>
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
	<form method="post">
	<select name="genres">
					<c:forEach var="genre" items="${genres}">

						<option value="${genre.id}">
						<c:out value="${genre.name}" />
						</option>
						</c:forEach>
						</select>
						<button type="submit" class="btn btn-warning">submit</button>
						</form>
						
	

<%@include file="partials/footer.jsp" %>
</body>
</html>