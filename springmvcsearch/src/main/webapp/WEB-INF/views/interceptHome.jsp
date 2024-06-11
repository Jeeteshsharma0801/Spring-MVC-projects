<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

<!-- specifying the location from where our files kept , resources spelling should be matched from spring-servlet.xml file 
where we have given location of resources  , here c is the taken from jstl taglib -->
     <%-- <link href="<c:url value="/resources/css/style.css" />" >
    <link href="<c:url value="/resources/js/script.js" />" > --%>
    


    <title>Hello, world!</title>
  </head>
  <body>
  
  <div class="container mt-5">
    <form action="welcome">
      <input type="text" name="user" placeholder="Enter your name here"/>
      <button type="submit">Say Hello !</button>
    </form>
  </div>
  
  
  </body>
</html>