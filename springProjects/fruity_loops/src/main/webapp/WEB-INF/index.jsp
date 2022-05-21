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
<h1>Fruit Store</h1>
<table>
<tbody>
<tr>
<th>Name</th>
<th>Price</th>
</tr>
		<c:forEach var="type" items="${fruitsAll}">
		<tr class="table-secondary">
			<td><c:out value="${type.name}"/></td>
			<td><c:out value="${type.price}"/></td>
		</tr>
		</c:forEach>
</tbody>
</table>
</body>
</html>