<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Welcom <c:out value = "${user.userName}"></c:out></h1>
<h4>This is your dashboard.Nothing to see here yet.</h4>
<a herf="/logout">Logout</a>
</body>
</html>