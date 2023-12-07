<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="Mycontroller">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="fname"></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="lname"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="text" name="mobile"></td>
</tr>


<tr>
<td>Address</td>
<td><textarea rows="5" cols="21" name="address"></textarea></td>
</tr>


<tr>
<td>Gender</td>
<td>
<input type="radio" name="gender" value="male">Male
<input type="radio" name="gender" value="female">FeMale
</td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><input type="password" name="cpassword"></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="INSERT">
</td>
</tr>
</table>
</body>
</html>