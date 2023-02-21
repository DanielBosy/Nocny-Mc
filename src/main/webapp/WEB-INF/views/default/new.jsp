<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User form</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<form:form method="post" action="/default/save" modelAttribute="defaultTask">
    <%--        <p>--%>
    <%--            <form:errors path="*"/>--%>
    <%--        </p>--%>
    <p>
        <form:label path="name">Name</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </p>
        <form:input path="user.id" type="text" />
    <p>
        <button type="submit">dodaj</button>
    </p>
</form:form>
</body>
</html>