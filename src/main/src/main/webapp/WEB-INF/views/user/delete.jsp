<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Delete user</title>
</head>
<body>
<form:form method="post" action="/user/delete/${id}">
  <a href="/user/list">Cancel</a>
  <input type="submit" value="Delete">
</form:form>
</body>
</html>