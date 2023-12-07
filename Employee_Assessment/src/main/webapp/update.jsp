<%@page import="com.bean.Employee"%>
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
<%
Employee e=(Employee)request.getAttribute("e");


%>
<form name="frm" method="post" action="Mycontroller">
<table>
<tr>
<td><input type="hidden" name="eid" value="<%=e.getEid()%>"></td>
</tr>
<tr>
<td>First Name</td>
<td><input type="text" name="fname" value="<%=e.getFname()%>"></td>
</tr>

<tr>
<td>Last Name</td>
<td><input type="text" name="lname" value="<%=e.getLname()%>"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="email" value="<%=e.getEmail()%>"></td>
</tr>

<tr>
<td>Mobile</td>
<td><input type="text" name="mobile" value="<%=e.getMobile()%>"></td>
</tr>


<tr>
<td>Address</td>
<td><textarea rows="5" cols="21" name="address" ><%=e.getAddress()%></textarea></td>
</tr>


<tr>
<td>Gender</td>
<td>
<%
if(e.getGender().equals("male"))
{
%>
<input type="radio" name="gender" value="male" checked="checked">Male
<input type="radio" name="gender" value="female">female
<%
}
else
{
%>
<input type="radio" name="gender" value="female" checked="checked">FeMale
<input type="radio" name="gender" value="male">Male
<%
}
%>

</td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password" value="<%=e.getPassword()%>"></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><input type="password" name="cpassword" value="<%=e.getPassword()%>"></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" name="action" value="UPDATE">
</td>
</tr>
</table>
</body>
</html>