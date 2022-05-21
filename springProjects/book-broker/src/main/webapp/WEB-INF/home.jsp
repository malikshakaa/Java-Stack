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
	<h3><a href="/logout">Logout</a></h3>
	<h3><a href="/books/new">+ add to my shelve</a></h3>
<h1>Welcome <c:out value = "${user.userName}"></c:out></h1>
<h4>Books from everyone's shelves:</h4>
<table>
<tr>
<th>Id</th>
<th>Title</th>
<th>Author</th>
<th>Posted By</th>	
</tr>
		<c:forEach var="book" items="${books}">
		<tr>
			<td><c:out value="${book.id}"/></td>
			<td><c:out value="${book.title}"/></td>
			<td><c:out value="${book.author}"/></td>
			<td><c:out value="${book.user.userName}"/></td>
		</tr>
		</c:forEach>
</table>

</body>
</html>