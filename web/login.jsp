<%--
  Created by IntelliJ IDEA.
  User: shiwu
  Date: 2021/5/28
  Time: 11:35 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login" method="post">
    <table>
        <tr>
            <td>用户名：</td>
            <td>
                <input type="text" name="login_name">
            </td>
        </tr>
        <tr>
            <td>密码：</td>
            <td>
                <input type="password" name="login_password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="登录">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
