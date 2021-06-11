<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>signin</title>
</head>  
<%@ include file="include/header.jsp" %>
<body>

<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
	       
		   <form  action="<%=request.getContextPath() %>/controller" method ="post" onsubmit="return validate()">
		   <h1>sign in</h1>
		   <table style="with: 50%">
				<tr>
				<td>UserName</td>
					<td><input type="text" name="username" id="username" class="form-control" placeholder="username" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" id="password" class="form-control" placeholder="password" /></td>
				</tr></table><br/>
		   
		            <input type="hidden" name="form"value="signinmethod">
		            <input type="submit"  class="btn btn-primary"  value="submit" >
		
		   </form>
		  
		   <script>
		   function validate(){
			   var username = document.getElementById("username");
			   var password = document.getElementById("password");
			   if(username.value == ""|| password.value ==""){
				   alert("no blank values allowed");
				   return false;
			   }
			   else
				   {
				   return true;
				   }
		  
		   
		   }
		   
		   
		   
		   </script>
		   
		</div>
	</div>
</div>
   
   


		

</body>
</html>