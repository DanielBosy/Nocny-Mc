<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task form</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/style.css" />
</head>
<body>
<p>
</p>
    <form:form method="post" action="/status/save"
           modelAttribute="status">
    <%--        <p>--%>
    <%--            <form:errors path="*"/>--%>
    <%--        </p>--%>
    <p>
        <label for="status">notes</label>
        <form:textarea path="status" rows="3"
                       cols="20"/>
    </p>

    <p>
        <input type="submit">
    </p>
</form:form>
<h4>Home : <a href="/home">powrót</a></h4>
</body>
</html>