<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task form</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<form:form method="post" action="/task/save"
           modelAttribute="task">
    <%--        <p>--%>
    <%--            <form:errors path="*"/>--%>
    <%--        </p>--%>
    <p>
        <form:label path="name">name</form:label>
        <form:input path="name"/>
        <form:errors path="name" cssClass="error"/>
    </p>
    <p>
        <form:label path="notes">notes</form:label>
        <form:input path="notes"/>
        <form:errors path="notes" cssClass="error"/>
    </p>
    <p>
        <form:input path="user.id" type="text" />

    </p>
    <p>
        <input type="submit">
    </p>
</form:form>
<h4>Home : <a href="/home">powrót</a></h4>
</body>
</html>