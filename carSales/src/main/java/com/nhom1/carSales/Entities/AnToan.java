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
@Table(name = "antoan")
public class AnToan implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name = "id_antoan" ,length = 11)
	private Integer id_antoan;
	
	@Column(name = "Phanh_Truoc", length = 100 , nullable = true)
	private String Phanh_Truoc;
	
	@Column(name ="Phanh_Sau" ,length = 100 , nullable =true)
	private String Phanh_Sau;
	
	@Column(name = "Phanh_Dien",length = 100, nullable =true)
	private String Phanh_Dien;
	
	@Column(name ="Canh_bao" ,length = 100,nullable = true)
	private String Canh_bao;
	
	@Column(name ="Khoa_Cua_Tu_Dong" ,length = 100,nullable = true)
	private String Khoa_Cua_Tu_Dong;
	
	@Column(name ="He_Thong_Tui_Khi" ,length = 100,nullable = true)
	private String He_Thong_Tui_Khi;
	
	@Column(name ="Chong_Trom" ,length = 100,nullable = true)
	private String Chong_Trom;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "antoan", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();
	
	
	public List<Oto> getLoto() {
		return Loto;
	}

	public void setLoto(List<Oto> loto) {
		Loto = loto;
	}

	public Integer getId_antoan() {
		return id_antoan;
	}

	public void setId_antoan(Integer id_antoan) {
		this.id_antoan = id_antoan;
	}

	public String getPhanh_Truoc() {
		return Phanh_Truoc;
	}

	public void setPhanh_Truoc(String phanh_Truoc) {
		Phanh_Truoc = phanh_Truoc;
	}

	public String getPhanh_Sau() {
		return Phanh_Sau;
	}

	public void setPhanh_Sau(String phanh_Sau) {
		Phanh_Sau = phanh_Sau;
	}

	public String getPhanh_Dien() {
		return Phanh_Dien;
	}

	public void setPhanh_Dien(String phanh_Dien) {
		Phanh_Dien = phanh_Dien;
	}

	public String getCanh_bao() {
		return Canh_bao;
	}

	public void setCanh_bao(String canh_bao) {
		Canh_bao = canh_bao;
	}

	public String getKhoa_Cua_Tu_Dong() {
		return Khoa_Cua_Tu_Dong;
	}

	public void setKhoa_Cua_Tu_Dong(String khoa_Cua_Tu_Dong) {
		Khoa_Cua_Tu_Dong = khoa_Cua_Tu_Dong;
	}

	public String getHe_Thong_Tui_Khi() {
		return He_Thong_Tui_Khi;
	}

	public void setHe_Thong_Tui_Khi(String he_Thong_Tui_Khi) {
		He_Thong_Tui_Khi = he_Thong_Tui_Khi;
	}

	public String getChong_Trom() {
		return Chong_Trom;
	}

	public void setChong_Trom(String chong_Trom) {
		Chong_Trom = chong_Trom;
	}
	
	
}
