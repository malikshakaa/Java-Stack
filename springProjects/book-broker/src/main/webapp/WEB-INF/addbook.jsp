<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Add Book To Your Shelf!!</h1>
	
<form:form action="/books/new" method="post" modelAttribute="book">
    <p>
        <form:label path="title">name</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="author">Title</form:label>
        <form:errors path="author"/>
        <form:input path="author"/>
    </p>
    <p>
        <form:label path="mythoughts">mythoughts</form:label>
        <form:errors path="mythoughts"/>
        <form:input type="text" path="mythoughts"/>
    </p>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>