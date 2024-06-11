<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
     <%-- <h1>Welcome , ${name1 }</h1>
     <h1>Your Email address is : ${email1 }</h1>
     <h1> your password is : ${password1 } , try to secure the password !!</h1> --%>
     
     <h1 style="color:green">${msg }</h1>
     
     <hr>
     
     <h1>Welcome , ${user.userName }</h1>
     <h1>Your Email address is : ${user.email }</h1>
     <h1> your password is : ${user.password } , try to secure the password !!</h1>
     
</body>
</html>