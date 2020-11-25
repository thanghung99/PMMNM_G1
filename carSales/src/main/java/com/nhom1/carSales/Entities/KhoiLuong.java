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
@Table(name = "khoiluong")
public class KhoiLuong implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name = "id_khoiluong",length = 11)
	private Integer id_khoiluong;
	
	@Column(name = "dai",length = 11 , nullable = true)
	private Integer dai;
	
	@Column(name = "rong",length = 11 , nullable = true)
	private Integer rong;

	@Column(name = "cao",length = 11 , nullable = true)
	private Integer cao;

	@Column(name = "khoi_luong",length = 11 , nullable = true)
	private Integer khoi_luong;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "khoiluong", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();
	
	
	
	public List<Oto> getLoto() {
		return Loto;
	}

	public void setLoto(List<Oto> loto) {
		Loto = loto;
	}

	public Integer getId_khoiluong() {
		return id_khoiluong;
	}

	public void setId_khoiluong(Integer id_khoiluong) {
		this.id_khoiluong = id_khoiluong;
	}

	public Integer getDai() {
		return dai;
	}

	public void setDai(Integer dai) {
		this.dai = dai;
	}

	public Integer getRong() {
		return rong;
	}

	public void setRong(Integer rong) {
		this.rong = rong;
	}

	public Integer getCao() {
		return cao;
	}

	public void setCao(Integer cao) {
		this.cao = cao;
	}

	public Integer getKhoi_luong() {
		return khoi_luong;
	}

	public void setKhoi_luong(Integer khoi_luong) {
		this.khoi_luong = khoi_luong;
	}
	
	
}
