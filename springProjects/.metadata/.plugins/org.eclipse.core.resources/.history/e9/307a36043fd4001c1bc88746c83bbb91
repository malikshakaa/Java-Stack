<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/main.css"/>
</head>
<body>
<h1>Save Travels</h1>
<table>
<tbody>
<tr>
<th>Expense</th>
<th>Vendor</th>
<th>Amount</th>
</tr>
		<c:forEach var="travel" items="${travels}">
		<tr class="table-secondary">
			<td><c:out value="${travel.expense}"/></td>
			<td><c:out value="${travel.vendor}"/></td>
			<td><c:out value="${travel.amount}"/></td>
		</tr>
		</c:forEach>
</tbody>
</table>
<h1>Add an expense</h1>
<h3>Description must not be blank</h3>
    <form:form action='/add' method='POST' modelAttribute="travel">
   	<label>Expense Name:</label>
   	<input type="text" id="expenseName" name="expense" min="1" max="25">
	<label>Vendor:</label>
	<input type="text" id="Vendor" name="Vendor" min="1" max="25">
   	<label>Amount:</label>
   	<input type="number" id="amount" name="amount" min="0" max="5000000">
   	<label>description:</label>
   	<input type="text" id="expenseName" name="description" min="1" max="25">
    	<input type='submit' value='Submit'>
   	</form:form>


</body>
</html>