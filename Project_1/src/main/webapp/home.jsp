<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>welcome!</title>
</head>
<body>

<form method="post" action="LoginCheck">

<table>


<tr>
<td>USER NAME </td>
<td><input type="text" name="uname"></td>
</tr>


<tr>
<td>PASSWORD </td>
<td><input type="password" name="password"></td>
</tr>


<tr>
<td></td>
<td><input type="submit" value="login"> </td>

</tr>
</table>

</form>
<a href="register.jsp" style="color: red">Register</a>

</body>
</html>