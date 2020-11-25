<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/ThemNV.css">
	<link rel="stylesheet" href="css/all.min.css">
	<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="wrapper">
		<div class="header">
			<div class="row row-header">
				<div class="col-md-5">
					<div class="logo">
						<div class="logo-image">
							<img src="images/logoDB.png" width="150" height="100" alt="">
						</div>
						<div class="logo-text">
							<h2 class="h2-logo">SUPER CAR</h2>
						</div>
					</div>
				</div>
				<div class="col-md-7">
					<%@ include file="/WEB-INF/views/layout/header-ad.jsp"%>
				</div>
			</div>
		</div>
		<div class="body">
			<div class="image-main">
				<img src="images/OtoXanh.jpg" alt="" class="img-body"></img>
			</div>
			<div class="body-main">
				<h3 class="h3-body">Sửa Nhân Viên</h3>
				<form method="post" modelAttribute="suaNV">
				<span class="h3-titile">Mã Nhân Viên</span>
					${NV.getId_nhanvien() }<br>
					<span class="h3-titile">Tên Nhân Viên</span>
					<textarea name="tennv" rows="1" placeholder="TenNhanVien...." class="tennv"></textarea><br>
					<span class="h3-titile">Tài Khoản</span>
					${NV.getTaikhoan_nv().getId()}   <br>
					<span class="h3-titile">Mật Khẩu</span>
					<textarea name="passWord" rows="1" placeholder="MatKhau...." class="MK"></textarea><br>
						
					
					<button type="submit" class="button-Them button button4"><b>Sửa</b></button>
				</form>
			</div>
		</div>
	</div> 
</body>
</html>