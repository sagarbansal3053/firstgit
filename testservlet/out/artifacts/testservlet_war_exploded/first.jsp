<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 27/6/17
  Time: 7:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
  <head>
    <title>Login Page</title>
  </head>
  <body>

  <h1 style="margin: 10px auto ;max-width: 400px; padding: 20px 12px 10px 20px">Login Here </h1>

  <form action = "/index" method = "post" style=" margin: 10px auto; max-width: 400px; padding: 20px 12px 10px 20px">
    UserName <input type = "text" name = "username">
    <br />
    Password <input type = "password" name = "password" />
    <input type = "submit" value = "Submit" />
  </form>



  </body>
</html>
