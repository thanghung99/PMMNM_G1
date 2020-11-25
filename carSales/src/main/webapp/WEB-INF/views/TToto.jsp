<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title></title>
	<link rel="stylesheet" href="<c:url value="css/TToto.css"/>" type="text/css">
	<link rel="stylesheet" href="<c:url value="css/all.min.css"/>">
	<link rel="stylesheet" href="<c:url value="css/bootstrap.min.css"/>">
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
				<img src="images/${Products.getAnh1() }" alt="" class="img-body"></img>
			
			</div>
			<div class="body-main">
				<h3 class="h3-body">Thông Tin Xe</h3>	
				<div class="row row-TTxe">
				<div class="col-md-5 col-img">			
					<img src="images/${Products.getAnh1() }" class="img-xe">
					
				</div>
				<div class="col-md-7 col-derc">
					<div class="basic-derc">
						<h3 class="h3-derc">Thông Tin Cơ Bản</h3>			
						<b class="b-ten">Xe : ${Products.getTen_oto()}</b><br>
						<b class="b-gia">Giá : ${Products.getGiaxe()}</b><br>
						<b class="b-hang">Hãng Xe : ${Products.getHangsx().getTen_hangsx()}</b>
					</div>
					<div class="kichthuoc-derc">
						<h3 class="h3-derc">KÍCH THƯỚC & KHỐI LƯỢNG</h3>			
						<b class="b-KT">Dài x Rộng x Cao (mm) :   ${Products.getKhoiluong().getDai()} x ${Products.getKhoiluong().getRong()}x ${Products.getKhoiluong().getCao()}</b><br>
						<b class="b-KT">Khối lượng bản thân (Kg) :   ${Products.getKhoiluong().getKhoi_luong()}</b><br>
					</div>
					<div class="dongco-derc">
						<h3 class="h3-derc">ĐỘNG CƠ & VẬN HÀNH</h3>			
						<b class="b-KT">Loại động cơ :   ${Products.getVanhanh().getDongco().getLoai_DongCo()}</b><br>
						<b class="b-KT">Công suất tối đa (hp/rmp) : ${Products.getVanhanh().getDongco().getCong_Suat()}</b><br>
						<b class="b-KT">Mô men xoắn cực đại (Nm/rpm) :${Products.getVanhanh().getDongco().getMo_Men_Xoan()}</b><br>
						<b class="b-KT">Chức năng tự động tắt động cơ tạm thời:    ${Products.getVanhanh().getDongco().getTu_Dong_Tat()}</b><br>
						<b class="b-KT">Hộp số :  ${Products.getVanhanh().getHop_So()}</b><br>
						<b class="b-KT">Dẫn động :   ${Products.getVanhanh().getHop_So()} (RWD)</b><br>
						<b class="b-KT">Dung tích bình nhiên liệu (lít) :    ${Products.getVanhanh().getHop_So()}</b><br>
						<b class="b-KT">Hệ thống treo trước :   ${Products.getVanhanh().getHop_So()}</b><br>
						<b class="b-KT">Hệ thống treo sau :   ${Products.getVanhanh().getHop_So()}</b><br>
						<b class="b-KT">Trợ lực lái :   ${Products.getVanhanh().getHop_So()}</b><br>
					</div>
					<div class="basic-derc">
						<h3 class="h3-derc">NGOẠI THẤT</h3>			
						<b class="b-ten">Đèn Trước : ${Products.getNgoaithat().getDenTruoc()}</b><br>
						<b class="b-gia">Đèn Ban Ngày : ${Products.getNgoaithat().getDenBanNgay()}</b><br>
						<b class="b-hang">Đèn Hậu : ${Products.getNgoaithat().getDenHau()}</b>
						<b class="b-gia">Đèn Chào Mừng : ${Products.getNgoaithat().getDenChaoMung()}</b><br>
						<b class="b-gia">Gương Chiếu Hậu : ${Products.getNgoaithat().getGuongChieuHau()}</b><br>
						<b class="b-gia">Gạt Mưa Tự Động : ${Products.getNgoaithat().getGatMuaTuDong()}</b><br>
						<b class="b-gia">Kính Cửa Sổ : ${Products.getNgoaithat().getKinhCuaSo()}</b><br>
						<b class="b-gia">Lốp : ${Products.getNgoaithat().getLop()}</b><br>
						<b class="b-gia">Viền Trang Trí : ${Products.getNgoaithat().getVienTrangTri()}</b><br>
						<b class="b-gia">Ống Xả Cần Sau : ${Products.getNgoaithat().getOngXaCanSau()}</b><br>
						<b class="b-gia">Bộ Vá Lốp: ${Products.getNgoaithat().getBoVaLop()}</b><br>
						<b class="b-gia">Màu Xe : ${Products.getNgoaithat().getMauXe()}</b><br>
						<b class="b-gia">Kính Cách Nhiệt : ${Products.getNgoaithat().getKinhCachNhiet()}</b><br>
					</div>

					<div class="basic-derc">
						<h3 class="h3-derc">NỘI THẤT</h3>			
						<b class="b-ten">Số CHỗ Ngồi : ${Products.getNoithat().getSo_Cho_Ngoi()}</b><br>
						<b class="b-gia">Khóa Thông Minh : ${Products.getNoithat().getKhoa_Thong_Minh()}</b><br>
						<b class="b-hang">Màn Hình Thông Minh : ${Products.getNoithat().getMan_Hinh_Thong_Minh()}</b><br>
						<b class="b-gia">Cấu Hình Ghế: ${Products.getNoithat().getCau_Hinh_Ghe()}</b><br>
						<b class="b-gia">Màu Nội Thất : ${Products.getNoithat().getMau_noi_That()}</b><br>
						<b class="b-gia">Vô Lăng : ${Products.getNoithat().getVo_Lang()}</b><br>
						<b class="b-gia">Điều Hòa : ${Products.getNoithat().getDieu_Hoa()}</b><br>
						<b class="b-gia">Giải Trí : ${Products.getNoithat().getGiai_Tri()}</b><br>
						<b class="b-gia">Kết Nối Điện Thoại : ${Products.getNoithat().getKet_Noi_DT()}</b><br>
						<b class="b-gia">Cổng USB : ${Products.getNoithat().getCong_USB()}</b><br>
						<b class="b-gia">Sạc Điện Thoại: ${Products.getNoithat().getSac_DT()}</b><br>
						<b class="b-gia">Bluetooth : ${Products.getNoithat().getBluetooth()}</b><br>
						<b class="b-gia">Âm Thanh : ${Products.getNoithat().getAm_Thanh()}</b><br>
						<b class="b-gia">Ánh Sáng : ${Products.getNoithat().getAnh_Sang()}</b><br>
						<b class="b-gia">Đèn Cốp Sau : ${Products.getNoithat().getDen_Cop_Sau()}</b><br>
						<b class="b-gia">Gương Chiếu Hậu : ${Products.getNoithat().getGuong_Chieu_Hau()}</b><br>
						<b class="b-gia">Đèn Trần : ${Products.getNoithat().getDen_Tran()}</b><br>
					</div>

					<div class="basic-derc">
						<h3 class="h3-derc">AN TOÀN & AN NINH</h3>			
						<b class="b-ten">Phanh Trước : ${Products.getAntoan().getPhanh_Truoc()}</b><br>
						<b class="b-gia">Phanh Sau : ${Products.getAntoan().getPhanh_Sau()}</b><br>
						<b class="b-hang">Phanh Điện Tử : ${Products.getAntoan().getPhanh_Dien()}</b><br>
						<b class="b-gia">Cảnh Báo: ${Products.getAntoan().getCanh_bao()}</b><br>
						<b class="b-gia">Khóa Cửa Tự Động : ${Products.getAntoan().getKhoa_Cua_Tu_Dong()}</b><br>
						<b class="b-gia">Hệ Thống Túi Khí : ${Products.getAntoan().getHe_Thong_Tui_Khi()}</b><br>
						<b class="b-gia">Chống Trộm : ${Products.getAntoan().getChong_Trom()}</b><br>	
					</div>

					<div class="basic-derc">
						<h3 class="h3-derc">TIÊU THỤ NHIÊN LIỆU</h3>		
						<b class="b-gia">Chu Trình Cơ Bản : ${Products.getNhienlieu().getChu_Trinh_Co_Ban()}</b><br>	
					</div>
				</div>	
			</div>
		</div>
	</div> 
</body>
</html>