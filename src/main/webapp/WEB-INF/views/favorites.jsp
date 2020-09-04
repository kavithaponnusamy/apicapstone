<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Favorites</title>
</head>
<body>
	<h1>Your Favorites</h1>
	<h2 class="message">${ flashmessage }</h2>

	<table class="table table-striped">
		<tr>
			<th>Title</th>
			<th>Rating</th>
			<th>Duration</th>
			<th>Delete?</th>
		</tr>

		<c:forEach var="FavoriteList" items="${favorites}">
			<tr>
				<td><a href="/movie-details?id=${FavoriteList.api_id}">${FavoriteList.title}</a>
				</td>
				<td>
					<p>${FavoriteList.vote_average}</p>
				</td>
				<td>
				<p>${FavoriteList.runtime }</p>
				</td>
				<td><a href="
				<c:url value="/${FavoriteList.id}/delete" />"
					class="btn btn-dark">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<p> </p>
	<%@include file="partials/footer.jsp"%>
</body>
</html>