<%@page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=utf-8" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<h2>Hello World!</h2>
<%-- 通过Struts传递参数,数据传递方式必须选择post,否则编码错误! --%>
<form action="login.action" method="post" >
    <p id="message">${message}</p>
    <b>Username:</b><input type="text" id="name" name="username" /><br>
    <b>Password:</b><input type="password" id="password" name="password"/><br>
    <input type="submit"  value="Login"/>
</form>
</body>
</html>