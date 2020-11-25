<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!-- tag-libs -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- JSTL -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title></title>
<link rel="stylesheet" href="css/trangchu.css">
<link rel="stylesheet" href="css/all.min.css">
<link rel="stylesheet" href="css/bootstrap.min.css">

</head>
<body>
	<div class="header">
		<div >
			<%@ include file="/WEB-INF/views/layout/header.jsp"%>
		</div>
		<div class="menu">
			<div class="container">
				<div class="row">
					<div class="col-md-6 ">
						<a href="TrangChu"><img class="img-logo" alt="" src="images/logo.png">Supper Car</a>
					</div>
					<div class="col-md-6 text-right">
						<a href="TrangChu" class="move"><i class="fa fa-home"></i></a> &nbsp; &nbsp;
						<a href="HangSX" class="move">Hãng Sản Xuất </a> &nbsp; &nbsp;
						 <a href="LienHe" class="move">Liên Hệ</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="img">
			<div class="nen">
				<img alt="" src="images/OtoXanh.jpg">
			</div>	
	</div>

	<div class="body-main">
		<h3 class="h3-body">Danh Sách Xe</h3>
		 <form method="post" modelAttribute="timOto">
			 <input type="text" name="tenXe"/>
			<button type="submit">Search</button>
		</form>
		<!-- <div class="row"> -->
		<div class="row row-products">
			<c:forEach items="${products}" var="product">

				<div class="products">
					<!-- <div class="row row-button"> -->

					<div class="col-md-6">
						<div class="img-product">
							<img src="images/${product.getAnh1()}" alt="" class="logo-NV">
						</div>
						<div class="derc-pro">
							<b class="b-TenXe">${product.getTen_oto()}</b><br> <b
								class="b-Gia">Giá : ${product.getGiaxe()} VND</b><br> <b
								class="b-HangSX">Hãng sản xuất:
								${product.getHangsx().getTen_hangsx()}</b><br>
							<button type="submit" class="button-sua">
								<a href='<c:url value="/TToto${product.getId_oto()}" />'>
									Xem Thông Tin Chi Tiết</a>
							</button>
						</div>
					</div>
				</div>

			</c:forEach>
		</div>
	</div>
	
	
	
	----------------------
	
	
	
	
	
	
	<div class="information">
		<div class="row">
			<div class="col-md-4">
				<ul >
					<li>Nguyễn Chí Thành</li>
					<li>Nguyễn Anh Tú</li>
					<li>Nguyễn Hùng Thắng</li>
					<li>Phạm Xuân Thắng</li>
					<li>Đào Minh Hiếu</li>
				</ul>
			</div>
			<div class="col-md-4">
				<ul>
					<li>2017605...</li>
					<li>2017605287</li>
					<li>2017605...</li>
					<li>2017605...</li>
					<li>2017605...</li>
				</ul>
			</div>
			<div class="col-md-4">
				<ul>
					<li>Hưng Yên-Hưng Yên-Việt Nam</li>
					<li>Hưng Yên-Hưng Yên-Việt Nam</li>
					<li>Hưng Yên-Hưng Yên-Việt Nam</li>
					<li>Hưng Yên-Hưng Yên-Việt Nam</li>
					<li>Hưng Yên-Hưng Yên-Việt Nam</li>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="footer">
		<div class="coppyright">
			@2020-Coppyright by Nhóm 1_KTPM3_K12s
		</div>
	</div>

</body>
</html>
