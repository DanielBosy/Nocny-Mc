<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User form</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<form:form method="post" action="/user/save" modelAttribute="user">
    <p>
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </p>
    <p>
        <form:label path="lastName">Last Name</form:label>
        <form:input path="lastName"/>
        <form:errors path="lastName" cssClass="error"/>
    </p>
    <p>
        <form:label path="password">Password</form:label>
        <form:input path="password"/>
        <form:errors path="password" cssClass="error"/>
    </p>
    <p>
        <button type="submit">dodaj</button>
    </p>
</form:form>
</body>
</html>