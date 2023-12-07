<%@page import="com.bean.Employee"%>
<%@page import="com.dao.EmployeeDao"%>
<%@page import="java.util.List"%>
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
<h1 align="center">List of Employee</h1>
<table width="100%" cellpadding="10px" cellspacing="10px">
<tr>
<th>EMPID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile</th>
</tr>

<%
   List<Employee> list=EmployeeDao.getAllEmployee();
for(Employee e:list)
{
%>
<tr>
<td><%=e.getEid()%></td>
<td><%=e.getFname()%></td>
<td><%=e.getLname()%></td>
<td><%=e.getEmail()%></td>
<td><%=e.getMobile()%></td>
<td>
<form name="edit" method="post" action="Mycontroller">
<input type="hidden" name="eid" value="<%=e.getEid()%>">
<input type="submit" name="action" value="EDIT" class="btn btn-primary" >
</form>
</td>
<td>
<form name="delete" method="post" action="Mycontroller">
<input type="hidden" name="eid" value="<%=e.getEid()%>">
<input type="submit" name="action" value="DELETE" class="btn btn-danger">
</form>
</td>
</tr>
<%
}



%>

</table>
</body>
</html>