<%@page import="java.time.LocalDateTime"%>
<%@page import="java.sql.Time"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%--  for to use controller data w/o getparameter , i.e. directly through ${name } --%>
<%@page isELIgnored="false"  %>

<!--  for taglib to iterate through our list -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shortcut page</title>
</head>
<body>

<%-- <%
  String name=(String)request.getAttribute("name");
%> --%>

<%-- <h1> my name is : <%=name %></h1> --%>
<h1> my name is : ${name }</h1>


  <h1>This is help page !!!!</h1>
  
  <hr>
  
  <h1> MARKS : ${marks }</h1>
  
  <hr>
  
 <!--  using taglib to iterate through our list -->
  <c:forEach var="item" items="${marks }">
      <h1>${item }</h1>
  </c:forEach>

</body>
</html>