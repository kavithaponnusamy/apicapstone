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
<h3>List of Movies</h3>
<c:forEach items="${movie.results}" var="movie">
<p>${movie.title}&nbsp;&nbsp;&nbsp;
<a href="/show-details?id=${movie.id}">See more details</a>
</p>
<p> </p>
</c:forEach>
<form action="/result" method="post">
Vote Average<input type="number" name="vote_average" step="any" >
Length<input type="number" name="length" >
<button type="submit">Submit</button>
</form>

</body>
</html>