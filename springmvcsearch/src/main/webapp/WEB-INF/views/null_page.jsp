<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
  <div class="row">
    <div class="col-md-12">
       <div class="error-template">
          <h1>Oops! sorry !</h1>
          <h2>${msg }</h2>
          <div class="error-details">Sorry, an error has occured,
          Requested page not found</div>
          <div class="error-actions">
           <a href="#!"></span>Take me Home</a><a href="#!"
           class="btn btn-default btn-lg"><span></span></a>
          </div>
       </div>
    </div>
  </div>
</div>

<h1>Oops , something went wrong !!</h1>
<h2> Some issue occurred at server side , Please contact administrator !!!!</h2>

</body>
</html>