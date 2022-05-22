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
<h1>${thisdojo.name}</h1>
<table>
<thead>
<th>First Name</th>
<th>Last Name</th>
<th>Age</th>
</thead>
<tbody>
</tr>
		<c:forEach var="ninja1" items="${ninjasindojo}">
		<tr class="table-secondary">
			<td><c:out value="${ninja1.firstName}"/></td>
			<td><c:out value="${ninja1.lastName}"/></td>
			<td><c:out value="${ninja1.age}"/></td>
		</tr>
		</c:forEach>
</tbody>
</table>
</body>
</html>