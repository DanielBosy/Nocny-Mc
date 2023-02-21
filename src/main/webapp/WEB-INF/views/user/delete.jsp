<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 20.02.2023
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Delete book</title>
</head>
<body>
<form:form method="post" action="/user/delete/${id}">
  <a href="/user/list">Cancel</a>
  <input type="submit" value="Delete">
</form:form>
</body>
</html>
