<%--
  Created by IntelliJ IDEA.
  User: Weronika Wawrzyniak
  Date: 15.03.2020
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<html>
<head>
    <title>Task3</title>
</head>
<body>
<h1>Welcome to Task 3 by Weronika Wawrzyniak </h1>

<form name='f1' action='msg' method='post'>
    Enter first number <input type='text' name='text1'>

    Enter second number <input type='text' name='text2'>

    <input type='submit' name='submit' value='submit with POST'>
</form>


<form name='f2' action='msg' method='get'>
    Enter first number <input type='text' name='text1'>

    Enter second number <input type='text' name='text2'>

    <input type='submit' name='submit' value='submit with GET'>
</form>
</body>
</html>
