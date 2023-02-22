<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Status list</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>task</th>
  </tr>
  </thead>
  <c:forEach items="${status}" var="status">
    <tr>
      <td>${status.id}</td>
      <td><c:out value="${status.status}"/></td>
    </tr>
  </c:forEach>
</table>
<h4>Home : <a href="/home">powrót</a></h4>
</body>
</html>