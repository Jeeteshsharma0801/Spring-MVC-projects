<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Time"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>

<%
  String name=(String)request.getAttribute("name"); 
  Integer rollno=(Integer)request.getAttribute("rollNumber");
  LocalDateTime now = (LocalDateTime)request.getAttribute("time");
%>

<h1> my name is : <%=name %></h1>
  <h1>This is help page !!!!</h1>
  <h1>name is : <%=name %> , rollNumber is : <%=rollno %></h1>
  <h1>Server Time is : <%=now %></h1>

</body>
</html>