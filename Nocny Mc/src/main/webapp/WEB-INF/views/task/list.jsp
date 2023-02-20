<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Task list</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>Id</th>
  </tr>
  </thead>
  <c:forEach items="${tasks}" var="task">
    <td>${task.id}</td>
    <td><c:out value="${task.name}"/></td>
  </c:forEach>
</table>
</body>
</html>