<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Book list</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>LastName</th>
    <th>Password</th>
  </tr>
  </thead>
  <c:forEach items="${users}" var="user">
    <tr>
      <td>${user.id}</td>
      <td><c:out value="${user.name}"/></td>
      <td><c:out value="${user.lastName}"/></td>
      <td><c:out value="${user.password}"/></td>
    </tr>
  </c:forEach>
</table>
</body>
</html>