<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
 	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Add a Dojo</h1>
	<form:form action="/dojos/new/adding" method="post" modelAttribute="dojo">
    <p>
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <button type = "submit">create</button>
    </form:form>

</body>
</html>