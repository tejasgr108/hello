<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<title>Book Tickets</title>
</head>
<body>
<h1> BOOK TICKETS</h1>
<form action="<%=request.getContextPath() %>/controller" method="post">
seat:<br/><input type="checkbox" name ="seat" value="a1">a1
     <input type="checkbox" name ="seat" value="a2">a2
     <input type="checkbox" name ="seat" value="a3">a3
     <input type="checkbox" name ="seat" value="a4">a4
     <input type="checkbox" name ="seat" value="a5">a5
     <input type="checkbox" name ="seat" value="a6">a6
     <input type="checkbox" name ="seat" value="a7">a7
     <input type="checkbox" name ="seat" value="a8">a8
     <input type="checkbox" name ="seat" value="a9">a9
     <input type="checkbox" name ="seat" value="a10">a10<br/>
     <input type="checkbox" name ="seat" value="b1">b1
     <input type="checkbox" name ="seat" value="b2">b2
     <input type="checkbox" name ="seat" value="b3">b3
     <input type="checkbox" name ="seat" value="b4">b4
     <input type="checkbox" name ="seat" value="b5">b5
     <input type="checkbox" name ="seat" value="b6">b6
     <input type="checkbox" name ="seat" value="b7">b7
     <input type="checkbox" name ="seat" value="b8">b8
     <input type="checkbox" name ="seat" value="b9">b9
     <input type="checkbox" name ="seat" value="b10">b10<br/>
     <input type="checkbox" name ="seat" value="c1">c1
     <input type="checkbox" name ="seat" value="c2">c2
     <input type="checkbox" name ="seat" value="c3">c3
     <input type="checkbox" name ="seat" value="c4">c4
     <input type="checkbox" name ="seat" value="c5">c5
     <input type="checkbox" name ="seat" value="c6">c6
     <input type="checkbox" name ="seat" value="c7">c7
     <input type="checkbox" name ="seat" value="c8">c8
     <input type="checkbox" name ="seat" value="c9">c9
     <input type="checkbox" name ="seat" value="c10">c10<br/>
         
     
     
     <input type="hidden" name="form" value="bookticketsmethod">
     <input type="submit" name="book">

</form>

</body>
</html>