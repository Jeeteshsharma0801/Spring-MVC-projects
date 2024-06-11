<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>${ student }</h1>
<hr>
<h1>Student name is : ${student.name }</h1>
<h1>Student ID is : ${student.id }</h1>
<h1>Student DOB is : ${student.dob }</h1>
<h1>courses are : ${student.courses }</h1>
<h1>Student Gender is : ${student.gender }</h1>
<h1>Student Type is : ${student.type }</h1>

 <!-- //important -->
<h1>Student address Street is : ${student.address.street }</h1>
<h1>Student address city is : ${student.address.city }</h1>

</body>
</html>