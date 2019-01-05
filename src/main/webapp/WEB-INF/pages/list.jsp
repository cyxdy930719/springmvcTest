<%--
  Created by IntelliJ IDEA.
  User: hasee
  Date: 2019/1/4
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: solid 1px black;
        }
    </style>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>用户名</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${lists}" var="u">
    <tr>
        <td>${u.name}</td>
        <td>${u.pwd}</td>
        <td><a href="update.do?username=${u.name}">修改</a>||<a href="delete.do?username=${u.name}">删除</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<form action="list1.do" method="post">
    用户名：<input type="text" name="name">
    密码：<input type="password" name="pwd">
    <input type="submit" value="添加">
</form>
</body>
</html>
