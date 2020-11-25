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
@Table(name = "ngoaithat")
public class NgoaiThat implements Serializable {
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name ="id_ngoaithat",length = 11)
	private Integer id_ngoaithat;
	
	@Column(name = "DenTruoc" ,length = 100 ,nullable = true)
	private String DenTruoc;
	
	@Column(name = "DenBanNgay" ,length = 100 ,nullable = true)
	private String DenBanNgay;
	
	@Column(name = "DenHau" ,length = 100 ,nullable = true)
	private String DenHau;
	
	@Column(name = "DenChaoMung" ,length = 100 ,nullable = true)
	private String DenChaoMung;
	
	@Column(name ="GuongChieuHau" ,length = 4,nullable = true)
	private String GuongChieuHau;
	
	@Column(name = "GatMuaTuDong" ,length = 100 ,nullable = true)
	private String GatMuaTuDong;
	
	@Column(name = "KinhCuaSo" ,length = 100 ,nullable = true)
	private String KinhCuaSo;
	
	@Column(name = "KinhCachNhiet" ,length = 100 ,nullable = true)
	private String KinhCachNhiet;
	
	@Column(name = "Lop" ,length = 100 ,nullable = true)
	private String Lop;
	
	@Column(name ="VienTrangTri" ,length = 4,nullable = true)
	private String VienTrangTri;
	
	@Column(name = "OngXaCanSau" ,length = 100 ,nullable = true)
	private String OngXaCanSau;
	
	@Column(name ="BoVaLop" ,length = 4,nullable = true)
	private String BoVaLop;
	
	@Column(name = "MauXe" ,length = 100 ,nullable = true)
	private String MauXe;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ngoaithat", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();
	
	
	public List<Oto> getLoto() {
		return Loto;
	}

	public void setLoto(List<Oto> loto) {
		Loto = loto;
	}

	public Integer getId_ngoaithat() {
		return id_ngoaithat;
	}

	public void setId_ngoaithat(Integer id_ngoaithat) {
		this.id_ngoaithat = id_ngoaithat;
	}

	public String getDenTruoc() {
		return DenTruoc;
	}

	public void setDenTruoc(String denTruoc) {
		DenTruoc = denTruoc;
	}

	public String getDenBanNgay() {
		return DenBanNgay;
	}

	public void setDenBanNgay(String denBanNgay) {
		DenBanNgay = denBanNgay;
	}

	public String getDenHau() {
		return DenHau;
	}

	public void setDenHau(String denHau) {
		DenHau = denHau;
	}

	public String getDenChaoMung() {
		return DenChaoMung;
	}

	public void setDenChaoMung(String denChaoMung) {
		DenChaoMung = denChaoMung;
	}

	public String getGuongChieuHau() {
		return GuongChieuHau;
	}

	public void setGuongChieuHau(String guongChieuHau) {
		GuongChieuHau = guongChieuHau;
	}

	public String getGatMuaTuDong() {
		return GatMuaTuDong;
	}

	public void setGatMuaTuDong(String gatMuaTuDong) {
		GatMuaTuDong = gatMuaTuDong;
	}

	public String getKinhCuaSo() {
		return KinhCuaSo;
	}

	public void setKinhCuaSo(String kinhCuaSo) {
		KinhCuaSo = kinhCuaSo;
	}

	public String getKinhCachNhiet() {
		return KinhCachNhiet;
	}

	public void setKinhCachNhiet(String kinhCachNhiet) {
		KinhCachNhiet = kinhCachNhiet;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public String getVienTrangTri() {
		return VienTrangTri;
	}

	public void setVienTrangTri(String vienTrangTri) {
		VienTrangTri = vienTrangTri;
	}

	public String getOngXaCanSau() {
		return OngXaCanSau;
	}

	public void setOngXaCanSau(String ongXaCanSau) {
		OngXaCanSau = ongXaCanSau;
	}

	public String getBoVaLop() {
		return BoVaLop;
	}

	public void setBoVaLop(String boVaLop) {
		BoVaLop = boVaLop;
	}

	public String getMauXe() {
		return MauXe;
	}

	public void setMauXe(String mauXe) {
		MauXe = mauXe;
	}
	
	
}
