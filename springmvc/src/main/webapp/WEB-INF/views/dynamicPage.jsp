<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
 <h1>This is Dynamic Page</h1>
 
 <% 
 		String name1=(String)request.getAttribute("name");
        Integer id=(Integer)request.getAttribute("ID");
        List<String> friends=(List<String>)request.getAttribute("f");
 %>
 
 <h1>Name is : <%=name1 %></h1>
 <h2>ID is : <%=id %></h2>
 
 <%-- <%
   for(String s : friends)
   {
	   out.println(s);
   }
 %> --%>
 
   <%
     for(String s : friends)
     {
   %>
   <h1><%=s %></h1>
   <%
   }
   %>
 
 
</body>
</html>