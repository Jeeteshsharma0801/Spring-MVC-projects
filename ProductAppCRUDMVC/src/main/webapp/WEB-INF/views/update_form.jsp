<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!--      ./  means in current directory , since adding the base.jsp      -->
<%@include file="./base.jsp" %>

</head>
<body>

<div class="container mt-3">

<%-- ${pageContext.request.contextPath } used so as to get "http:localhost:8080/ProductAppCRUDMVC --%>
<form action="${pageContext.request.contextPath }/handle-product" method="post">


 <h1 class="text-center mb-3">Change Product Details</h1>
  
  <div class="form-group">
  
   <!-- we will get the id on form , and when submitting the form  by @modelAtrribute all form details will be saved in object Product including id too
   and then update function will work on this existing id -->
 <div><input type="hidden" value="${product1.id }"name="id" /></div>
  
    <label for="name">Product Name</label>
    <input type="text" name="name" class="form-control" id="name" placeholder="Enter the product name here" value="${product1.name }">
  </div>
  <div class="form-group">
    <label for="description">Product Description</label>
    <textarea class="form-control" id="description" rows="5" name="description" placeholder="Enter the product Description" >value="${product1.description }"</textarea>
  </div>
  <div class="form-group">
    <label for="price">Product Price</label>
    <input type="text" name="price" class="form-control" id="price" placeholder="Enter the product price here" value="${product1.price }">
  </div>
  <div class="container text-center">
  <%-- ${pageContext.request.contextPath }  This will provide us the project name therefore path will be "ProductAppCRUDMVC/--%>
  <a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-warning">Update</button>
  </div>
  </div>
</form>
</body>
</html>