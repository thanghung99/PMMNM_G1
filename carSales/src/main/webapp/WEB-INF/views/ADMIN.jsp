<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/AD.css">
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
							<img src="images/logoDB.png" alt="" width="150" height="100">
						</div>
						<div class="logo-text">
							<span style="font-size: 36px"><h2 class="h2-logo">SUPER CAR</h2></span>
						</div>
					</div>
				</div>
				<div class="col-md-7">
					 <%@ include file="/WEB-INF/views/layout/header-ad.jsp"%>
				</div>
			</div>
		</div>
		<div class="body">
			
			<div class="body-main">
				<div class="row row-button">
					<div class="col-md-4">
					<a href="ThemOto">	<button class= " button button4" type="submit"><b>Thêm Ô Tô</b></button></a>
					</div>
					<div class="col-md-4">
					<a href="SuaOto">	<button class= " button button4" type="submit"><b>Sửa Ô Tô</b></button></a>
					</div>
					<div class="col-md-4">
					<a href="XoaOto">	<button class= " button button4" type="submit"><b>Xóa Ô Tô</b></button></a>
					</div>
				</div>
				<div class="row row-button row-end">
					<div class="col-md-4">
					<a href="ThemNV"> 	<button class= " button button4" type="submit"><b>Thêm Nhân viên</b></button></a>
					</div>
					<div class="col-md-4">
					<a href="SuaNV">	<button class= " button button4" type="submit"><b>Sửa Nhân Viên</b></button></a>
					</div>
					<div class=" col-md-4">
					<a href="XoaNV"><button  class= " button button4" type="submit"><b>Xóa Nhân Viên</b></button></a>
					</div>
				</div >
				<div class="row row-button row-end">
					<div class="col-md-4">
					<a href="ThemHang"> 	<button class= " button button4" type="submit"><b>Thêm/Sửa Hãng </b></button></a>
					</div>
					<div class="col-md-4">
					<a href="XoaHang"> 	<button class= " button button4" type="submit"><b>Xóa Hãng</b></button></a>
					</div>
					
				</div >
				<div class="image-main ma">
				<img  src="images/OtoXanh.jpg" alt="" class="img-body">
			</div>
			</div>
		</div>
	</div>
</body>
</html>
