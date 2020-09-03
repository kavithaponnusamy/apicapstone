<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie Details</title>
</head>
<body>
<h3>Movie Details</h3>

Id: <c:out value="${result.id}"/>
Overview: <c:out value="${result.overview}"/>
Vote average: <c:out value="${result.vote_average}"/>
Popularity: <c:out value="${result.popularity}"/>
Genre Id's: <c:out value="${result.genre_ids}"/>

<p> </p>
</body>
</html>

