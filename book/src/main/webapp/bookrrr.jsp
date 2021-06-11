<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Book Tickets</title>
</head>
<%@ include file="include/header.jsp" %>
<body>

 <div class="carousel-item active" style="background-image: url(img/slide/backgr.jpg)">
  <div class="carousel-container">
    <div class="container">
 
     <form action="<%=request.getContextPath() %>/controller" method="post" onsubmit="return validate()" >
       <h1> BOOK TICKETS </h1>


          seat:<br/><input type="checkbox" name ="seat" id="a1"  value="a1" >a1
          <input type="checkbox" name ="seat" id="a2"  value="a2">a2
     <input type="checkbox" name ="seat" id="a3"  value="a3">a3
     <input type="checkbox" name ="seat" id="a4"  value="a4">a4
     <input type="checkbox" name ="seat" id="a5"  value="a5">a5
     <input type="checkbox" name ="seat" id="a6"  value="a6">a6
     <input type="checkbox" name ="seat" id="a7"  value="a7">a7
     <input type="checkbox" name ="seat" id="a8"  value="a8">a8
     <input type="checkbox" name ="seat" id="a9"  value="a9">a9
     <input type="checkbox" name ="seat" id="a10"  value="a10">a10<br/>
     <input type="checkbox" name ="seat" id="b1"  value="b1">b1
     <input type="checkbox" name ="seat" id="b2"  value="b2">b2
     <input type="checkbox" name ="seat" id="b3"  value="b3">b3
     <input type="checkbox" name ="seat" id="b4"  value="b4">b4
     <input type="checkbox" name ="seat" id="b5"  value="b5">b5
     <input type="checkbox" name ="seat" id="b6" value="b6">b6
     <input type="checkbox" name ="seat" id="b7" value="b7">b7
     <input type="checkbox" name ="seat" id="b8"  value="b8">b8
     <input type="checkbox" name ="seat" id="b9" value="b9">b9
     <input type="checkbox" name ="seat" id="b10" value="b10">b10<br/>
     <input type="checkbox" name ="seat" id="c1"  value="c1">c1
     <input type="checkbox" name ="seat" id="c2" value="c2">c2
     <input type="checkbox" name ="seat" id="c3" value="c3">c3
     <input type="checkbox" name ="seat" id="c4"  value="c4">c4
     <input type="checkbox" name ="seat" id="c5"  value="c5">c5
     <input type="checkbox" name ="seat" id="c6"  value="c6">c6
     <input type="checkbox" name ="seat" id="c7"  value="c7">c7
     <input type="checkbox" name ="seat" id="c8"  value="c8">c8
     <input type="checkbox" name ="seat" id="c9"  value="c9">c9
     <input type="checkbox" name ="seat" id="c10"  value="c10">c10<br/>
     
         
     
     
     <input type="hidden" name="form" value="bookticketsmethod1">
     <input type="submit" name="book" class="btn btn-primary" value="book">
  
   </form>

   
   </div>
</div>
</div>    







</body>
</html>