<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task form</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<form:form method="post" action="/task/save" modelAttribute="task">
    <p>
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </p>
    <p>
        <input type="submit">
    </p>
</form:form>
</body>
</html>