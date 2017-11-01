 
 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page session="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
 <c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
 <html>
 
 <head>
 <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
</head><style type="text/css">
.error {
	color:#FF0000;
	font-weight: bold;
}
@import url(https://fonts.googleapis.com/css?family=Roboto:300);

.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  text-transform: uppercase;
  outline: 0;
  background: #4CAF50;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #FFFFFF;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #43A047;
}
.form .message {
  margin: 15px 0 0;
  color: #b3b3b3;
  font-size: 12px;
}
.form .message a {
  color: #4CAF50;
  text-decoration: none;
}
.form .register-form {
  display: none;
}
.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #1a1a1a;
}
.container .info span {
  color: #4d4d4d;
  font-size: 12px;
}
.container .info span a {
  color: #000000;
  text-decoration: none;
}
.container .info span .fa {
  color: #EF3B3A;
}
body {
  
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
</style>
<body>


 <div class="login-page">
  <div class="form">
  <form:form method="POST" class="register-form"  action="register" modelAttribute="user">
   
      <form:input path="fname"  type="text" class="form-control" id="inputName" placeholder="Fisrt Name" />
      
      <form:input path="lname" type="text" class="form-control"  placeholder="Last Name" />
     	
      <form:input path="phone" type="text" class="form-control"  placeholder="phone No" />
     	
      <form:input path="email"  type="email" class="form-control"  placeholder="Email" />
      
      <form:input path="username"  type="username" class="form-control"  placeholder="username" required> </form:input>
      
     <form:input path="password"  type="password"    placeholder="Password" required>  </form:input>
      
     <!--  <label>
	<input type="checkbox" required> Accept our <a href="#">privacy policy</a> and <a href="#">customer agreement</a>
	</label> -->
												
     <button type="submit" class="btn btn-group btn-default btn-animated">Sign Up  </button>
      <p class="message">Already registered? <a href="#">Sign In</a></p>
   	</form:form>
    
    
    
    
    
    
     <form:form method="POST" action="${contextPath}/login" class="login-form"  modelAttribute="user">
								  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    
      
      <form:input path="username" type="text"  id="inputUserName" placeholder="User Name" />
      <span><form:errors cssClass="error" path="username" /></span>
      
      	<form:input path="password"  type="password"   id="inputPassword" placeholder="Password" />
      <button type="submit" class="btn btn-group btn-default btn-animated">Log In  </button> 
      <p class="message">Not registered? <a href="#">Create an account</a></p>
  	</form:form>
  </div>
</div>


 
		 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
console.log("hello");
 $('.message a').click(function(){
   $('form').animate({height: "toggle", opacity: "toggle"}, "slow");
});
});
</script> 						  
</body>
</html>