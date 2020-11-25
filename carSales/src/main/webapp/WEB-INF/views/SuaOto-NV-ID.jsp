<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="css/ThemOto.css">
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
							<img src="images/logoDB.png" width="150" height="100"  alt="">
						</div>
						<div class="logo-text">
							<h2 class="h2-logo">SUPER CAR</h2>
						</div>
					</div>
				</div>
				<div class="col-md-7">
					<%@ include file="/WEB-INF/views/layout/header-nv.jsp"%>
				</div>
			</div>
		</div>
		<div class="body">
			<div class="image-main">
				<img src="images/${anh}" alt="" class="img-body"></img>
			</div>
			<div class="body-main">
				<h3 class="h3-body">Sửa Sản Phẩm</h3>
				<form class="form-main" method="post" modelAttribute="suaOto" enctype="multipart/form-data">					
					<div class="row">
						<div class="col-md-6 col-child">
							<h4 class="h4-body">Thông Tin Cơ Bản</h4>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Mã Xe</span>
								</div>
								<div class="col-md-6">
									${id}
								</div>
							</div>
		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Tên Xe</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="tenXe">
								</div>
							</div>

							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Giá Xe</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="gia">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Mã Hãng Xe</span>
								</div>
								<div class="col-md-6">
									<select  name="maHang">
									<c:forEach items="${HangSX}" var="Hang">
												<option>${Hang.getId_hangsx() }</option>
												</c:forEach>
								
											</select>
								</div>
							</div>				
							<h4 class="h4-body">KÍCH THƯỚC & KHỐI LƯỢNG</h4>					
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Dài </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="dai">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Rộng</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="rong">
								</div>
							</div>					
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Cao</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="cao">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Khối lượng</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="khoiLuong">
								</div>
							</div>
							<h4 class="h4-body">ĐỘNG CƠ & VẬN HÀNH</h4>		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Loại động cơ  </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="loaiDongCo">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Công suất tối đa (hp/rmp)</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="congXuat">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Mô men xoắn cực đại (Nm/rpm)</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="moMen">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Chức năng tự động tắt động cơ tạm thời</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="tuDongTat">
								</div>
							</div>		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Hộp số</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="hopSo">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Dẫn động</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="danDong">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Dung tích bình nhiên liệu (lít) 
								</div>
								<div class="col-md-6">
									<input type="text" name="dungTich">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Hệ thống treo trước</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="treoTruoc">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Hệ thống treo sau</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="treoSau">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Trợ lực lái</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="troLucLai">
								</div>
							</div>
							<h4 class="h4-body">AN TOÀN & AN NINH</h4>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Phanh Trước</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="phanhTruoc">
								</div>
							</div>
		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Phanh Sau</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="phanhSau">
								</div>
							</div>

							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Phanh Điện Tử</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="phanhDienTu">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Khóa Cửa Tự Động</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="khoaCua">
								</div>
							</div>	
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Hệ Thống Túi Khí </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="tuiKhi">
								</div>
							</div>	
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Chống Trộm</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="chongTrom">
								</div>
							</div>	

							<h4 class="h4-body">TIÊU THỤ NHIÊN LIỆU</h4>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Chu Trình Cơ Bản</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="chuTrinh">
								</div>
							</div>		
							
							
							
							<h4 class="h4-body">ẢNH CHỤP XE</h4>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Ảnh 1</span>
								</div>
								<div class="col-md-6">
									<input type="file" name="image1">
								</div>
								<div class="col-md-6">
									<span class="span-titile">Ảnh 2</span>
								</div>
								<div class="col-md-6">
									<input type="file" name="image2">
								</div>
								<div class="col-md-6">
									<span class="span-titile">Ảnh 3</span>
								</div>
								<div class="col-md-6">
									<input type="file" name="image3">
								</div>
								<div class="col-md-6">
									<span class="span-titile">Ảnh 4</span>
								</div>
								<div class="col-md-6">
									<input  type="file" name="image4">
								</div>
							</div>	
							
							
							
						</div>
					

						<div class="col-md-6 col-child">
							<h4 class="h4-body">NGOẠI THẤT</h4>		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Đèn Trước  </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="denTruoc">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Đèn Ban Ngày</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="denBanNgay">
								</div>
							</div>
						<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Đèn Hậu</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="denHau">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Gương Chiếu Hậu</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="guongChieuHau">
								</div>
							</div>		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Gạt Mưa Tự Động</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="gatMua">
								</div>
							</div>
						
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Kính Cửa Sổ </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="kinhCuaSo">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Lốp</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="lop">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Viền Trang Trí</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="vienTrangChi">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Ống Xả Cần Sau</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="ongXa">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Bộ Vá Lốp</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="boVaLop">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Màu Xe</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="mauXe">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Kính Cách Nhiệt</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="kinhCachNhiet">
								</div>
							</div>

							<h4 class="h4-body">NỘI THẤT</h4>		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Số CHỗ Ngồi  </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="soChoNgoi">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Khóa Thông Minh </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="khoaThongMinh">
								</div>
							</div>
						<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Màn Hình Thông Minh</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="manHinh">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Màu Nội Thất</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="mauNoiThat">
								</div>
							</div>		
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Vô Lăng </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="voLang">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Điều Hòa</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="dieuHoa">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Kính Cửa Sổ </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="kinhCuaSo">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Giải Trí</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="giaiTri">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Kết Nối Điện Thoại</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="ketNoiDT">
								</div>
							</div>				
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Cổng USB </span>
								</div>
								<div class="col-md-6">
									<input type="text" name="usb">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Sạc Điện Thoại</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="sacDT">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Bluetooth</span>
								</div>
								<div class="col-md-6">
									<input type="text" name="bluetooth">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Âm Thanh</span>
								</div>
								<div class="col-md-6 bo ">
									<input type="text" name="amThanh">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Ánh Sáng</span>
								</div>
								<div class="col-md-6 bo ">
									<input  type="text" name="anhSang">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Đèn Cốp Sau</span>
								</div>
								<div class="bo col-md-6">
									<input type="text" name="denCopSau">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6 bo">
									<span class="span-titile">Gương Chiếu Hậu </span>
								</div>
								<div class="col-md-6 bo">
									<input  type="text" name="guongChieuHau">
								</div>
							</div>
							<div class="row row-child">
								<div class="col-md-6">
									<span class="span-titile">Đèn Trần</span>
								</div>
								<div class="col-md-6 bo">
									<input  type="text" name="denTran">
								</div>
							</div>
						</div>
					</div>
					<div class="div-button "><button type="submit"> Sửa Sản Phẩm</button>
				</form>
			</div>
		</div>
	</div> 
</body>
</html>