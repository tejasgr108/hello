<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%@include file="include/header1.jsp" %>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
		    <h1>book now</h1>
            <a href="<%=request.getContextPath() %>/controller?page=book">book</a><br/>
       </div>
    </div>
</div>



<%@include file="include/footer1.jsp" %>
</body>

</html>