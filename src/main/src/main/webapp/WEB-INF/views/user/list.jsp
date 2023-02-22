<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>User list</title>
</head>
<body>
<table>
  <thead>
  <tr>
    <th>Id</th>
    <th>Name</th>
    <th>LastName</th>

  </tr>
  </thead>
  <c:forEach items="${users}" var="user">
    <tr>
      <td>${user.id}</td>
      <td><c:out value="${user.name}"/></td>
      <td><c:out value="${user.lastName}"/></td>
    </tr>
  </c:forEach>
</table>
<h4>Home : <a href="/home">powrót</a></h4>
</body>
</html>