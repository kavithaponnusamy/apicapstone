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
<h2 class="message">${ flashmessage }</h2>
	<c:forEach var="FavoriteList" items="${favorites}">

		<p><a href="/movie-details?id=${FavoriteList.api_id}">${FavoriteList.title}</a></p>
		<p><a
				href="
				<c:url value="/${FavoriteList.id}/delete" />"
				class="btn btn-dark">Delete</a></p>

	</c:forEach>
<%@include file="partials/footer.jsp" %>
</body>
</html>