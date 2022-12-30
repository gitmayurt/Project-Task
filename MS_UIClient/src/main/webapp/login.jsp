<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function login() 
{
	alert("Welcome");
	var un=document.getElementById("us").value;	
	var pass=document.getElementById("ps").value;
	
	alert(un);
	alert(pass);
	
	var req=new XMLHttpRequest();
	/*  Eureka->zuul->UI->consume->zuul->produce
	var url="http://localhost:9092/getCon"+"/"+un+"/"+pass;*/
	
	/* Eureka->Zuul->UI->Zuul->Consume->Zuul->Produce */
	var url="http://localhost:8085/mechcon/getCon"+"/"+un+"/"+pass;
	
	req.open("GET",url,true);
	req.send();
	alert("Success");
	
	req.onreadystatechange=function(){
		alert("Ready State "+req.readyState);
		if(req.readyState==4 && req.status==200){
			alert(req.responseText);
		}
	}
}
</script>
</head>
<body>
Username: <input type="text" name="user" id="us">
<br>
<br>
Password: <input type="text" name="pass" id="ps">
<br>
<br>
<input type="submit" value="Login" onclick="login()">
</body>
</html>