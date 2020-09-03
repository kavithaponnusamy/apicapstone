<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>details </title>
</head>
<body>
<h1>${movie.title}</h1>
<br>
<br>
<h3>${movie.tagline }</h3>
<h3>${movie.vote_average }</h3>
<p>${movie.overview}</p>
<p>${movie.runtime }</p>
<c:forEach var="genre" items="${movie.genres }">
<p>${genre.name}</p>

</c:forEach>

<%@include file="partials/footer.jsp" %>
</body>
</html>