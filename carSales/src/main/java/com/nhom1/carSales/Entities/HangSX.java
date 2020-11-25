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
@Table(name ="hangsx")
public class HangSX implements Serializable {
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name ="id_hangsx" ,length = 11)
	private Integer id_hangsx;
	
	@Column(name = "ten_hangsx", length = 500 , nullable = true)
	private String ten_hangsx;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "hangsx", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();
	
	
	
	public List<Oto> getLoto() {
		return Loto;
	}

	public void setLoto(List<Oto> loto) {
		Loto = loto;
	}

	public Integer getId_hangsx() {
		return id_hangsx;
	}

	public void setId_hangsx(Integer id_hangsx) {
		this.id_hangsx = id_hangsx;
	}

	public String getTen_hangsx() {
		return ten_hangsx;
	}

	public void setTen_hangsx(String ten_hangsx) {
		this.ten_hangsx = ten_hangsx;
	}
	
	
}
