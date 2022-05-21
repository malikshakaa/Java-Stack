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
<h1>Customer Info</h1>
<h2>Customer Name:<c:out value="${name}"></c:out></h2>
<h4>Item Name:<c:out value="${itemName}"></c:out></h4>
<h4>Price :<c:out value="${price}"></c:out></h4>
<h4>Description:<c:out value="${description}"></c:out></h4>
<h4>Vendor:<c:out value="${vendor}"></c:out></h4>


</body>
</html>
