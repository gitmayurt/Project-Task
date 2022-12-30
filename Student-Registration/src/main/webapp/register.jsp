<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<center>
<h1>Registration Form</h1>
<form action="gotologin">
Name:
<input type="text" name="nm">
<br>
<br>
Email:
<input type="text" name="mail">
<br>
<br>
Username:
<input type="text" name="user">
<br>
<br>
Password:
<input type="text" name="pass">
<br>
<br>
Mobile No:
<input type="number" name="mob">
<br>
<br>
gender:
<input type="radio" name="gender"><label>Male</label>
<input type="radio" name="gender"><label>Female</label>
<br>
<br>
Course:
<select name="course">
<option>Java</option>
<option>Python</option>
<option>Testing</option>
</select>
<br>
<br>
<input type="submit" value="Register">
</form>
</center>
</body>
</html>