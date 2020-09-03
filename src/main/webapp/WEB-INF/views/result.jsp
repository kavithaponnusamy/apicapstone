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
<Strong><p><c:out value="${movie.title}"/></p></Strong>
<p>Avg: ${movie.vote_average }<p>
<p>Runtime: ${movie.runtime }</p>
</c:forEach>


</body>
</html>