<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/SuaOto.css">
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
				<h3 class="h3-body">Danh Sách Hãng</h3>
				<c:forEach items="${HangSX}" var="hang">
				<div class="row row-button">
					
					<div class="col-md-12">
						<b class="b-MaNV">Mã Hãng : ${hang.getId_hangsx()}</b><br>
						<b class="b-TenNV">Tên hãng : ${hang.getTen_hangsx()}</b><br>
						<button type="submit" class="button-sua"><a href='<c:url value="/XoaHang${hang.getId_hangsx()}" />'>Xóa</a></button>
					</div>
				</div>
				</c:forEach>
			</div>
		</div>
	</div> 
</body>
</html>