<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>

<%
String username=request.getParameter("uname");
 String password=request.getParameter("pwd");
 if(username.equals("Ranjani") && password.equals("Pass"))
 {
	out.print("<a href =Details><font color:Red><b>login successful <br>proceed further</b></font> </a>  ");
 }
 else
 {
	 out.print("<font color=red><b>Invalid UserId and Password</b></font>");
 }
 %>
</body>
</html>