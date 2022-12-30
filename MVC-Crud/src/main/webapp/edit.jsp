<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update</title>
</head>
<body>
<h1>Update Data</h1>
<form action="update">
<table border="2">
<tr>
<td>RollNo:</td>
<td><input type="text" name="roll" value="${data.roll}"></td>
</tr>
<tr>
<td>Name:</td>
<td><input type="text" name="name" value="${data.name}"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="mail" value="${data.mail}"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="text" name="pass" value="${data.pass}"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Update"></td>
</tr>
</table>
</form>
</body>
</html>