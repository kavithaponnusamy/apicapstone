<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	
<c:forEach var="movie" items="${movies }">
<Strong><p><a href="movie-details?id=<c:out value="${movie.id}"/>">${movie.title}</a></p></Strong>
<p>Avg: ${movie.vote_average }<p>
<p>Runtime: ${movie.runtime }</p>
</c:forEach>


<%@include file="partials/footer.jsp" %>
</body>
</html>