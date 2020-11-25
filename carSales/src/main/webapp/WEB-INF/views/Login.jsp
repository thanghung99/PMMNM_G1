<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/Login.css">
	<link rel="stylesheet" href="css/all.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="wrapper">

		<div class="form-main">
			<h3 class="h3-login">Login</h3>
			
			 <form:form method="post"   action="DangNhap" modelAttribute="Login">
				<i class="fas fa-user"></i><input type="UseName" name="UserName" placeholder="UserName"><br>
				<i class="fas fa-unlock-alt"></i><input type="Password" name="passWord" placeholder="PassWord"><br>
				
				<div class="forgotPW">
					<span class="register-user"><a href="#"> New User  </a></span>
					<span class="span-pw"><a href="#">Forgot PassWord?</a></span>
				</div>
				<button type="submit"  class="button-login">Login</button>
				<div class="conn-diff">
					<span class="span-conn">or Login with</span>
					<a href="#"><i class="fab fa-facebook fb"></i></a>
					<a href="#"><i class="fab fa-instagram ins"></i></a>
				<a href="#"><i class="fab fa-twitter-square tw"></i></a>

				</div>
				
			</form:form>
		</div>
		<div class="img-main">
			<img src="images/OtoXanh.jpg" alt="" class="img">
		</div>
	</div>
</body>
</html>