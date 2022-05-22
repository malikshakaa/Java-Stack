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

<h1>all dojos</h1>
		
		<table>
		<c:forEach var="dojo1" items="${dojos}">
		<tr class="table-secondary">
			<td><a href = "/dojos/${dojo1.id}">"${dojo1.name}"</a></td>
		</tr>
		</c:forEach>
		</table>

</body>
</html>