<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Publisher list</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>task</th>
  </tr>
  </thead>
  <c:forEach items="${defaultTasks}" var="defaultTasks">
    <tr>
      <td>${defaultTasks.id}</td>
      <td><c:out value="${defaultTasks.name}"/></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>