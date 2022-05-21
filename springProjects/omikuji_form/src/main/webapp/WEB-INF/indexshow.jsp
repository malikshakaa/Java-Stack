<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Here's Your Omikuji!</h1>
<p>In <c:out value="${quantitykey}"></c:out> years, You will 
live in <c:out value="${namekey}"></c:out> with
 <c:out value="${personkey}"></c:out> as your 
 roommate,<c:out value="${hobbykey}"></c:out> for a living.
 The next time you see a  <c:out value="${livingkey}"></c:out>, you will have good luck.Aslo,
<c:out value="${nicekey}"></c:out></p>
<c:out value="${nicekey }"></c:out>
<a href = "/omikuji">go back</a>

</body>
</html>