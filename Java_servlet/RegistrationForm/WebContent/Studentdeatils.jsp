<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*,webApp.nisum.Student" %>
    
    <%
    ArrayList<Student> getdetails=(ArrayList<Student>)request.getAttribute("getDetails");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Student</title>
</head>
<body>
<table>
 <%
 
for(Student student:getdetails)
{
	out.println(student);
}

%>
</table>


</body>
</html>