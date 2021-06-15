<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign in </title>

</head>
<%@ include file="include/header.jsp" %>
<body>


<div class="container mtb">
	<div class="row">
		<div class="col-lg-6">
		
<form action="<%=request.getContextPath()%>/controller" method="post" onclick="return execute()">
            <h1>Create User</h1>
			<table style="with: 50%">
				<tr>
					<td>First Name</td>
					<td><input type="text" name="first_name" id="first_name" class="form-control" placeholder="firstname" required/></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="last_name" id="last_name" class="form-control" placeholder="lastname" required /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" id="username" class="form-control" placeholder="username" required /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" id="password" class="form-control" placeholder="password" required /></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" id="email" class="form-control" placeholder="email" required /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="contact" id="contact" class="form-control" placeholder="contactno" required /></td>
				</tr></table><br/>
			<input type="hidden" name="form" value="createusermethod"><br/>
			<input type="submit" class="btn btn-primary" value="Submit" />
		
		</form>
	
			
			<script>
			  function execute(){
				var fname = document.getElementById("first_name");
				var lname = document.getElementById("last_name");
				var uname = document.getElementById("username");
				var pd = document.getElementById("password");
				var mail = document.getElementById("email");
				var no = document.getElementById("contact");
				
				var firstname =/^[a-z A-Z]+$/;
				var lastname =/^[a-z A-Z]+$/;
				var username =/^[a-z A-Z 0-9]{6,14}$/;
				var password =/^[a-z A-Z 0-9 @&*#]{8,12}$/;
				var email =/^([a-z A-Z 1-9]{6,15})@([a-z A-Z 1-9]{4,8}).([a-z A-Z ]{1,4})$/;
				var contact =/^([1-9]{1,2})+([1-9]{8,11})$/;
			
				
				if(!firstname.test(fname)||fname.value == ""){
					alert("enter valid firstname");
					
					return false;
				}
				}
				if(!lastname.test(laname)||lname.value ==""){
					  alert("enter a valid lastname");
					  
					  return false;
				}
				}
				if(!username.test(uname) || uname.value ==""){
					alert("enter a valid username ");
					
					return false;
				}
				}
				if(!password.test(pd)|| pd.value == ""){
					alert("enter a valid password");
					
					return false;
				}
				}
				if(!email.test(mail)||mail.value ==""){
					alert("enter a valid mail id");
					
					return false;
				}
				}
				if(!contact.test(no)||no.value =="")){
					alert("enter a valid contact no");
					return false;
				}
				}
			}
			
			</script>
			
			
		</div>
	</div>
</div>




</body>
</html>