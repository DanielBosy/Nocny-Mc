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
    <th>task</th>
    <th>notes</th>

    <th>userId</th>
  </tr>
  </thead>
  <c:forEach items="${task}" var="task">
    <p>
      <td>${task.id}</td>
      <td><c:out value="${task.name}"/></td>
      <td><c:out value="${task.notes}"/></td>
      <td><c:out value="${task.user.id}"/></td>
    </tr>
  </c:forEach>

</table>

<h4>Home : <a href="/home">powrót</a></h4>
</body>
</html>