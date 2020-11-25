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
@Table(name = "nhienlieu")
public class NhienLieu implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name ="id_nhienlieu",length = 11)
	private Integer id_nhienlieu;
	
	@Column(name = "Chu_Trinh_Co_Ban",nullable = true)
	private Float Chu_Trinh_Co_Ban;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "nhienlieu", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();
	
	public Integer getId_nhienlieu() {
		return id_nhienlieu;
	}

	public void setId_nhienlieu(Integer id_nhienlieu) {
		this.id_nhienlieu = id_nhienlieu;
	}

	public Float getChu_Trinh_Co_Ban() {
		return Chu_Trinh_Co_Ban;
	}

	public void setChu_Trinh_Co_Ban(Float chu_Trinh_Co_Ban) {
		Chu_Trinh_Co_Ban = chu_Trinh_Co_Ban;
	}
	
	
}
