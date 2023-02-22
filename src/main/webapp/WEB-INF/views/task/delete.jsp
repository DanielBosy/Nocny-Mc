<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Task</title>
</head>
<body>
<form:form method="post" action="/task/delete/${id}">
    <a href="/task/list">Cancel</a>
    <input type="submit" value="Delete">
</form:form>
</body>
</html>
