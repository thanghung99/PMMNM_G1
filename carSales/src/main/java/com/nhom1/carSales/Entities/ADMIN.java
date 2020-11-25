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
@Table(name="admin")
public class ADMIN implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name = "id_admin" ,length = 11)
	private Integer id_admin;
	
	@Column(name = "Ten_Admin" ,length = 45 ,nullable = false)
	private String Ten_Admin;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id")
	private TaiKhoan taikhoan_ad;
	
	
	
	public TaiKhoan getTaikhoan_ad() {
		return taikhoan_ad;
	}

	public void setTaikhoan_ad(TaiKhoan taikhoan_ad) {
		this.taikhoan_ad = taikhoan_ad;
	}

	public Integer getId_admin() {
		return id_admin;
	}

	public void setId_admin(Integer id_admin) {
		this.id_admin = id_admin;
	}

	public String getTen_Admin() {
		return Ten_Admin;
	}

	public void setTen_Admin(String ten_Admin) {
		Ten_Admin = ten_Admin;
	}

}
