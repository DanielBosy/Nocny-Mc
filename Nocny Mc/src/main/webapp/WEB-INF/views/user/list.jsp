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
  </tr>
  </thead>
  <c:forEach items="${users}" var="user">
    <td>${user.id}</td>
    <td><c:out value="${user.name}"/></td>
  </c:forEach>
</table>
</body>
</html>