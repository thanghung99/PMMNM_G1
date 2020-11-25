package com.nhom1.carSales.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="vanhanh")
public class VanHanh implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	
	@Column(name = "Hop_So" ,length = 100, nullable = true)
	private String Hop_So;
	
	@Column(name = "Dan_Dong" ,length = 100, nullable = true)
	private String Dan_Dong;
	
	@Column(name = "Dung_Tich_Xang" ,length = 100, nullable = true)
	private String Dung_Tich_Xang;
	
	@Column(name = "Treo_Truoc" ,length = 100, nullable = true)
	private String Treo_Truoc;
	
	@Column(name = "Treo_Sau" ,length = 100, nullable = true)
	private String Treo_Sau;
	
	@Column(name = "Tro_Luc" ,length = 100, nullable = true)
	private String Tro_Luc;
	
	@Id
	@Column(name = "id_vanhanh" ,length = 11, nullable = false)
	private Integer id_vanhanh;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_DongCo")
	private  DongCo dongco;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vanhanh", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();

	
	
	public DongCo getDongco() {
		return dongco;
	}

	public void setDongco(DongCo dongco) {
		this.dongco = dongco;
	}

	public List<Oto> getLoto() {
		return Loto;
	}

	public void setLoto(List<Oto> loto) {
		Loto = loto;
	}

	public String getHop_So() {
		return Hop_So;
	}

	public void setHop_So(String hop_So) {
		Hop_So = hop_So;
	}

	public String getDan_Dong() {
		return Dan_Dong;
	}

	public void setDan_Dong(String dan_Dong) {
		Dan_Dong = dan_Dong;
	}

	public String getDung_Tich_Xang() {
		return Dung_Tich_Xang;
	}

	public void setDung_Tich_Xang(String dung_Tich_Xang) {
		Dung_Tich_Xang = dung_Tich_Xang;
	}

	public String getTreo_Truoc() {
		return Treo_Truoc;
	}

	public void setTreo_Truoc(String treo_Truoc) {
		Treo_Truoc = treo_Truoc;
	}

	public String getTreo_Sau() {
		return Treo_Sau;
	}

	public void setTreo_Sau(String treo_Sau) {
		Treo_Sau = treo_Sau;
	}

	public String getTro_Luc() {
		return Tro_Luc;
	}

	public void setTro_Luc(String tro_Luc) {
		Tro_Luc = tro_Luc;
	}

	public Integer getId_vanhanh() {
		return id_vanhanh;
	}

	public void setId_vanhanh(Integer id_vanhanh) {
		this.id_vanhanh = id_vanhanh;
	}
	
	
}
