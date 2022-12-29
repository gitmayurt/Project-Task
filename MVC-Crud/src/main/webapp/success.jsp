<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<script type="text/javascript">
function add()
{
	document.fn.action="register.jsp";
	document.fn.submit();
}
function edit()
{
	document.fn.action="edit";
	document.fn.submit();
}
function remove()
{
	document.fn.action="delete";
	document.fn.submit();
}
</script>
</head>
<body>
<h1>Student Data</h1>
<form name="fn">
<table>
<tr>
<th>Sr No</th>
<th>Roll No</th>
<th>Name</th>
<th>Email</th>
<th>Password</th>
</tr>
<tr>
<c:forEach items="${data}" var="d">
<td><input type="radio" name="roll" value="${d.roll}"></td>
<td>${d.roll}</td>
<td>${d.name}</td>
<td>${d.mail}</td>
<td>${d.pass}</td>
</tr>
</c:forEach>
</table>
<table border="2">
<tr>
<td><input type="button" value="ADD" onclick="add()"></td>
<td><input type="button" value="EDIT" onclick="edit()"></td>
<td><input type="button" value="DELETE" onclick="remove()"></td>
</tr>
</table>
</form>
</body>
</html>