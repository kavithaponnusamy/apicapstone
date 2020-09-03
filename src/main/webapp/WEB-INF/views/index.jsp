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
<%@include file="partials/footer.jsp" %>

</body>
</html>