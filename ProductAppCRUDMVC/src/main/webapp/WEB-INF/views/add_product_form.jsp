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
<form action="handle-product" method="post">
 <h1 class="text-center mb-3">Fill the Product Details</h1>
  <div class="form-group">
    <label for="name">Product Name</label>
    <input type="text" name="name" class="form-control" id="name" placeholder="Enter the product name here">
  </div>
  <div class="form-group">
    <label for="description">Product Description</label>
    <textarea class="form-control" id="description" rows="5" name="description" placeholder="Enter the product Description"></textarea>
  </div>
  <div class="form-group">
    <label for="price">Product Price</label>
    <input type="text" name="price" class="form-control" id="price" placeholder="Enter the product price here">
  </div>
  <div class="container text-center">
  <%-- ${pageContext.request.contextPath }  This will provide us the project name therefore path will be "ProductAppCRUDMVC/--%>
  <a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
  </div>
</form>
</body>
</html>