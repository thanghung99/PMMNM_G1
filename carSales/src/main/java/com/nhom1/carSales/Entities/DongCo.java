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
@Table(name = "dongco")
public class DongCo implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name = "id_DongCo" ,length = 11)
	private Integer id_DongCo;
	
	@Column(name = "Loai_DongCo" ,length = 100 , nullable = true)
	private String Loai_DongCo;
	
	@Column(name = "Cong_Suat" ,length = 100 , nullable = true)
	private String Cong_Suat;
	
	@Column(name = "Mo_Men_Xoan" ,length = 100 , nullable = true)
	private String Mo_Men_Xoan;
	
	@Column(name = "Tu_Dong_Tat" ,length = 100 , nullable = true)
	private String Tu_Dong_Tat;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "dongco", fetch = FetchType.LAZY)
	private List<VanHanh> LvanHanh = new ArrayList<>();
	
	
	
	public List<VanHanh> getLvanHanh() {
		return LvanHanh;
	}

	public void setLvanHanh(List<VanHanh> lvanHanh) {
		LvanHanh = lvanHanh;
	}

	public Integer getId_DongCo() {
		return id_DongCo;
	}

	public void setId_DongCo(Integer id_DongCo) {
		this.id_DongCo = id_DongCo;
	}

	public String getLoai_DongCo() {
		return Loai_DongCo;
	}

	public void setLoai_DongCo(String loai_DongCo) {
		Loai_DongCo = loai_DongCo;
	}

	public String getCong_Suat() {
		return Cong_Suat;
	}

	public void setCong_Suat(String cong_Suat) {
		Cong_Suat = cong_Suat;
	}

	public String getMo_Men_Xoan() {
		return Mo_Men_Xoan;
	}

	public void setMo_Men_Xoan(String mo_Men_Xoan) {
		Mo_Men_Xoan = mo_Men_Xoan;
	}

	public String getTu_Dong_Tat() {
		return Tu_Dong_Tat;
	}

	public void setTu_Dong_Tat(String tu_Dong_Tat) {
		Tu_Dong_Tat = tu_Dong_Tat;
	}
	
	
}
