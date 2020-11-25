<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/LienHe.css">
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
					<%@ include file="/WEB-INF/views/layout/header.jsp"%>
				</div>
			</div>
		</div>
		<div class="body">
			<div class="image-main">
				<img src="images/OtoXanh.jpg" alt="" class="img-body"></img>
			</div>
			<div class="body-main">
				<h3 class="h3-body">Danh Sách Showroom</h3>
				<div class="derc">
				<div class="row row-header" >
					<div class="col-md-2">
						STT
					</div>
					<div class="col-md-2">
						Tên Showroom
					</div>
					<div class="col-md-4">
						Địa chỉ
					</div>
					<div class="col-md-2">
						Hotline
					</div>
					<div class="col-md-2">
						Tỉnh thành
					</div>
				</div>
				<div class="row row-derc" >
					<div class="col-md-2">
						1
					</div>
					<div class="col-md-2">
						Car Lạng Sơn
					</div>
					<div class="col-md-4">
						Phía Nam Cầu Kỳ Lừa, phường Chi Lăng, thành phố Lạng Sơn, tỉnh Lạng Sơn
					</div>
					<div class="col-md-2">
						0904698869
					</div>
					<div class="col-md-2">
						Lạng Sơn
					</div>
				</div>
				<div class="row row-derc" >
					<div class="col-md-2">
						2
					</div>
					<div class="col-md-2">
						Bro Hà Nam
					</div>
					<div class="col-md-4">
						Tổ hợp Thương mại - Dịch vụ Tổng hợp Hà Nam, phường Minh Khai, Thành phố Phủ Lý, Tỉnh Hà Nam, Việt Nam
					</div>
					<div class="col-md-2">
						0913908659
					</div>
					<div class="col-md-2">
						 Hà Nam
					</div>
				</div>
				<div class="row row-derc" >
					<div class="col-md-2">
						3
					</div>
					<div class="col-md-2">
						Bro Long Biên
					</div>
					<div class="col-md-4">
						Tầng 1, TTTM Vincom Plaza Long Biên - Khu đô thị Vinhomes Riverside, Phường Phúc Lợi, Quận Long Biên, Hà Nội
					</div>
					<div class="col-md-2">
						0981335504 - han.longbien@vinfast.vn
					</div>
					<div class="col-md-2">
						Hà Nội
					</div>
				</div>
			</div>
		</div>
		</div>
	</div> 
</body>
</html>