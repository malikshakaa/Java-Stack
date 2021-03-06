<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Login & Registration</title>

</head>
<body>
<h1>Registration</h1>
<form:form action="/register" method="post" modelAttribute="newUser">
    <p>
        <form:label path="userName">user name</form:label>
        <form:errors path="userName"/>
        <form:input path="userName"/>
    </p>
    <p>
        <form:label path="email">email</form:label>
        <form:errors path="email"/>
        <form:input type="email" path="email"/>
    </p>
    <p>
        <form:label path="password">password</form:label>
        <form:errors path="password"/>
        <form:input type="password" path="password"/>
    </p>
    <p>
        <form:label path="confirm">confirm</form:label>
        <form:errors path="confirm"/>
        <form:input type="password" path="confirm"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
<h1>Login</h1>
<form:form action="/login" method="post" modelAttribute="newLogin">
    <p>
        <form:label path="email">email</form:label>
        <form:errors path="email"/>
        <form:input path="email"/>
    </p>
    <p>
        <form:label path="password">password</form:label>
        <form:errors path="password"/>
        <form:input type="password" path="password"/>
    </p>

    <input type="submit" value="Submit"/>
</form:form>

</body>
</html>