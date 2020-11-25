package com.nhom1.carSales.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="taikhoan")
public class TaiKhoan implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name ="id" ,length = 45)
	private String id;
	
	@Column(name= "mk" ,length = 45 ,nullable = false)
	private String mk;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "taikhoan_ad", fetch = FetchType.LAZY)
	private List<ADMIN> Lad = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "taikhoan_nv", fetch = FetchType.LAZY)
	private List<NhanVien> Lnv = new ArrayList<>();
	
	
	public List<ADMIN> getLad() {
		return Lad;
	}

	public void setLad(List<ADMIN> lad) {
		Lad = lad;
	}

	public List<NhanVien> getLnv() {
		return Lnv;
	}

	public void setLnv(List<NhanVien> lnv) {
		Lnv = lnv;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMk() {
		return mk;
	}

	public void setMk(String mk) {
		this.mk = mk;
	}
	
	
}
