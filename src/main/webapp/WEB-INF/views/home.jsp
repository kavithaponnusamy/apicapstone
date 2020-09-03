<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/result" method="post">
Vote Average<input type="number" name="vote_average" step="any" >
Length<input type="number" name="length" >
<button type="submit">Submit</button>

</form>
<%@include file="partials/footer.jsp" %>
</body>
</html>