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

	<form:form action="/ninjas/new/adding" method="post" modelAttribute="ninja">
    <p>
        <form:label path="dojo">dojo</form:label>
        <form:errors path="dojo"/>
             <form:select path="dojo">
        <c:forEach var="dojo1" items="${dojos}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${dojo1.id}">
					${dojo1.name}
            </form:option>
        </c:forEach>
    </form:select>
    </p>
    <p>
        <form:label path="firstName">first Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
        <p>
        <form:label path="lastName">last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
        <p>
        <form:label path="age">age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>
    <button type = "submit">create</button>
    </form:form>

</body>
</html>