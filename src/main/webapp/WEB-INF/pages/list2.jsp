<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/1/5
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doupdate.do">
        用户名：<input type="text" name="name" value="${user.name}"><br>
        密码：<input type="password" name="pwd" value="${user.pwd}">
        <input type="submit">
    </form>
</body>
</html>
