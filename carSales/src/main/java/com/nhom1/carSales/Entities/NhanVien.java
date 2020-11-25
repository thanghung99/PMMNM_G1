package com.nhom1.carSales.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="nhanvien")
public class NhanVien implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name = "id_nhanvien" ,length = 11)
	private Integer id_nhanvien;
	
	@Column(name = "Ten_Nhan_Vien",length = 100 ,nullable = false)
	private String Ten_Nhan_Vien;
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id")
	private TaiKhoan taikhoan_nv;
	
	
	
	public TaiKhoan getTaikhoan_nv() {
		return taikhoan_nv;
	}

	public void setTaikhoan_nv(TaiKhoan taikhoan_nv) {
		this.taikhoan_nv = taikhoan_nv;
	}

	public Integer getId_nhanvien() {
		return id_nhanvien;
	}

	public void setId_nhanvien(Integer id_nhanvien) {
		this.id_nhanvien = id_nhanvien;
	}

	public String getTen_Nhan_Vien() {
		return Ten_Nhan_Vien;
	}

	public void setTen_Nhan_Vien(String ten_Nhan_Vien) {
		Ten_Nhan_Vien = ten_Nhan_Vien;
	}

	
}
