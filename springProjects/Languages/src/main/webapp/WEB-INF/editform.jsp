<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1>Edit Language</h1><a href="/languages">Go Back</a>
                <form:form action="/languages/${languages.id}/edit/update" method="post" modelAttribute="languages">
                <input type="hidden" name="_method" value="put">
               <p>
                      <form:input path="name" class="form-control" name = "name" id="floatingInput" placeholder="name@example.com"/>
                      <form:label path="name" for="floatingInput">Expense Name</form:label>
                        <form:errors path="name" />
				</p>
                    <p>
                      <form:input path="creator" type="text" class="form-control" name = "creator" id="floatingInput" placeholder="name@example.com"/>
                      <form:label path="creator" for="floatingInput">Creator</form:label>
                        <form:errors path="creator" />
                    </p>
                    <p>
                      <form:input path="version" type="text" class="form-control" name = "version" id="floatingInput" placeholder="name@example.com"/>
                      <form:label path="version" for="floatingInput">Version</form:label>
                    <form:errors path="version" />
                    </p>
                    <button type="submit" class="btn btn-outline-warning align-self-center">Add</button>
                    </form:form>

</body>
</html>