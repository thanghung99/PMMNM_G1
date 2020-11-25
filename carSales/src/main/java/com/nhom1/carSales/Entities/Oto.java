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
@Table(name = "oto")
public class Oto implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name ="id_oto" ,length = 11)
	private Integer id_oto;
	
	@Column(name = "ten_oto" ,length = 100 ,nullable = false)
	private String ten_oto;
	
	
	@Column(name = "giaxe"  ,nullable = true)
	private Float giaxe;
	
	
	
	@Column(name = "anh1" ,length = 200 ,nullable = true)
	private String anh1;
	
	@Column(name = "anh2" ,length = 200 ,nullable = true)
	private String anh2;
	
	@Column(name = "anh3" ,length = 200 ,nullable = true)
	private String anh3;
	
	@Column(name = "anh4" ,length = 200 ,nullable = true)
	private String anh4;
	
	@Column(name = "anh5" ,length = 200 ,nullable = true)
	private String anh5;
	
	@Column(name = "anh6" ,length = 200 ,nullable = true)
	private String anh6;
	
	@Column(name = "anh7" ,length = 200 ,nullable = true)
	private String anh7;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_vanhanh")
	private VanHanh vanhanh;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_khoiluong")
	private KhoiLuong khoiluong;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_antoan")
	private AnToan antoan;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_nhienlieu")
	private NhienLieu nhienlieu;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_noithat")
	private NoiThat noithat;


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_hangsx")
	private HangSX hangsx;
	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ngoaithat")
	private NgoaiThat ngoaithat;


	public Integer getId_oto() {
		return id_oto;
	}


	public void setId_oto(Integer id_oto) {
		this.id_oto = id_oto;
	}


	public String getTen_oto() {
		return ten_oto;
	}


	public void setTen_oto(String ten_oto) {
		this.ten_oto = ten_oto;
	}


	public Float getGiaxe() {
		return giaxe;
	}


	public void setGiaxe(Float giaxe) {
		this.giaxe = giaxe;
	}


	public String getAnh1() {
		return anh1;
	}


	public void setAnh1(String anh1) {
		this.anh1 = anh1;
	}


	public String getAnh2() {
		return anh2;
	}


	public void setAnh2(String anh2) {
		this.anh2 = anh2;
	}


	public String getAnh3() {
		return anh3;
	}


	public void setAnh3(String anh3) {
		this.anh3 = anh3;
	}


	public String getAnh4() {
		return anh4;
	}


	public void setAnh4(String anh4) {
		this.anh4 = anh4;
	}


	public String getAnh5() {
		return anh5;
	}


	public void setAnh5(String anh5) {
		this.anh5 = anh5;
	}


	public String getAnh6() {
		return anh6;
	}


	public void setAnh6(String anh6) {
		this.anh6 = anh6;
	}


	public String getAnh7() {
		return anh7;
	}


	public void setAnh7(String anh7) {
		this.anh7 = anh7;
	}


	public VanHanh getVanhanh() {
		return vanhanh;
	}


	public void setVanhanh(VanHanh vanhanh) {
		this.vanhanh = vanhanh;
	}


	public KhoiLuong getKhoiluong() {
		return khoiluong;
	}


	public void setKhoiluong(KhoiLuong khoiluong) {
		this.khoiluong = khoiluong;
	}


	public AnToan getAntoan() {
		return antoan;
	}


	public void setAntoan(AnToan antoan) {
		this.antoan = antoan;
	}


	public NhienLieu getNhienlieu() {
		return nhienlieu;
	}


	public void setNhienlieu(NhienLieu nhienlieu) {
		this.nhienlieu = nhienlieu;
	}


	public NoiThat getNoithat() {
		return noithat;
	}


	public void setNoithat(NoiThat noithat) {
		this.noithat = noithat;
	}


	public HangSX getHangsx() {
		return hangsx;
	}


	public void setHangsx(HangSX hangsx) {
		this.hangsx = hangsx;
	}


	public NgoaiThat getNgoaithat() {
		return ngoaithat;
	}


	public void setNgoaithat(NgoaiThat ngoaithat) {
		this.ngoaithat = ngoaithat;
	}

	
	
	
	
}
