<%--
  Created by IntelliJ IDEA.
  User: Weronika Wawrzyniak
  Date: 18.03.2020
  Time: 09:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<h1>Welcome to Task 4 by Weronika Wawrzyniak </h1>

<form name='f1' action='con' method='post'>
  Enter first number <input type='text' name='text1'>

  Enter second number <input type='text' name='text2'>

  <input type='submit' name='submit' value='submit with POST'>
</form>
<form name='f2' action='con' method='get'>
  Enter first number <input type='text' name='text1'>

  Enter second number <input type='text' name='text2'>

  <input type='submit' name='submit' value='submit with GET'>
</form>
</body>
</html>