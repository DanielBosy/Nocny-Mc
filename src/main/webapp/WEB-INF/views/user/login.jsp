<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><html>
<head>
    <title>Login</title>
</head>
<body>
<h1 class="h3 mb-0 text-gray-800">Login:</h1>
<form method="post">
    Name   <input type="text" name="name" /><br>
    <h1></h1>
    Password   <input type="password" name="password" /><br>
    <h3></h3>
    <button type="submit" class="log in"><a href="/home"/>log in</button>
    <button type="submit" class="log in"><a href="/user/loginManager"/>Jeśli jesteś Manager klikni</button>
</form>
</body>
</html>
