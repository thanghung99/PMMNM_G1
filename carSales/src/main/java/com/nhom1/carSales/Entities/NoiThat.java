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
@Table(name ="noithat")
public class NoiThat implements Serializable{
	 static final long serialVersionUID = 880163957096965869L;
	@Id
	@Column(name ="id_noithat" ,length = 11)
	private Integer id_noithat;
	
	@Column(name="So_Cho_Ngoi",length = 11,nullable = true)
	private Integer So_Cho_Ngoi;
	
	@Column(name = "Khoa_Thong_Minh",length = 100,nullable = true)
	private String Khoa_Thong_Minh;
	
	@Column(name = "Man_Hinh_Thong_Minh", length = 100 ,nullable = true)
	private String Man_Hinh_Thong_Minh;
	
	@Column(name = "Cau_Hinh_Ghe", length = 100 ,nullable = true)
	private String Cau_Hinh_Ghe;
	
	@Column(name = "Mau_noi_That", length = 100 ,nullable = true)
	private String Mau_noi_That;
	
	@Column(name = "Vo_Lang", length = 100 ,nullable = true)
	private String Vo_Lang;
	
	@Column(name = "Dieu_Hoa", length = 100 ,nullable = true)
	private String Dieu_Hoa;
	
	@Column(name = "Giai_Tri",length = 100,nullable = true)
	private String Giai_Tri;
	
	@Column(name = "Ket_Noi_DT",length = 100,nullable = true)
	private String Ket_Noi_DT;
	
	@Column(name = "Cong_USB",length = 100,nullable = true)
	private String Cong_USB;
	
	@Column(name = "Sac_DT",length = 100,nullable = true)
	private String Sac_DT;
	
	@Column(name = "Bluetooth",length = 100,nullable = true)
	private String Bluetooth;
	
	@Column(name = "Am_Thanh", length = 100 ,nullable = true)
	private String Am_Thanh ;
	
	@Column(name = "Anh_Sang", length = 100 ,nullable = true)
	private String Anh_Sang ;
	
	@Column(name = "Den_Cop_Sau",length = 100,nullable = true)
	private String Den_Cop_Sau;
	
	@Column(name = "Guong_Chieu_Hau",length = 100,nullable = true)
	private String Guong_Chieu_Hau;
	
	@Column(name = "Den_Tran",length = 100,nullable = true)
	private String Den_Tran;

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "noithat", fetch = FetchType.LAZY)
	private List<Oto> Loto = new ArrayList<>();
	
	
	
	public Integer getId_noithat() {
		return id_noithat;
	}

	public List<Oto> getLoto() {
		return Loto;
	}

	public void setLoto(List<Oto> loto) {
		Loto = loto;
	}

	public void setId_noithat(Integer id_noithat) {
		this.id_noithat = id_noithat;
	}

	public Integer getSo_Cho_Ngoi() {
		return So_Cho_Ngoi;
	}

	public void setSo_Cho_Ngoi(Integer so_Cho_Ngoi) {
		So_Cho_Ngoi = so_Cho_Ngoi;
	}

	public String getKhoa_Thong_Minh() {
		return Khoa_Thong_Minh;
	}

	public void setKhoa_Thong_Minh(String khoa_Thong_Minh) {
		Khoa_Thong_Minh = khoa_Thong_Minh;
	}

	public String getMan_Hinh_Thong_Minh() {
		return Man_Hinh_Thong_Minh;
	}

	public void setMan_Hinh_Thong_Minh(String man_Hinh_Thong_Minh) {
		Man_Hinh_Thong_Minh = man_Hinh_Thong_Minh;
	}

	public String getCau_Hinh_Ghe() {
		return Cau_Hinh_Ghe;
	}

	public void setCau_Hinh_Ghe(String cau_Hinh_Ghe) {
		Cau_Hinh_Ghe = cau_Hinh_Ghe;
	}

	public String getMau_noi_That() {
		return Mau_noi_That;
	}

	public void setMau_noi_That(String mau_noi_That) {
		Mau_noi_That = mau_noi_That;
	}

	public String getVo_Lang() {
		return Vo_Lang;
	}

	public void setVo_Lang(String vo_Lang) {
		Vo_Lang = vo_Lang;
	}

	public String getDieu_Hoa() {
		return Dieu_Hoa;
	}

	public void setDieu_Hoa(String dieu_Hoa) {
		Dieu_Hoa = dieu_Hoa;
	}

	public String getGiai_Tri() {
		return Giai_Tri;
	}

	public void setGiai_Tri(String giai_Tri) {
		Giai_Tri = giai_Tri;
	}

	public String getKet_Noi_DT() {
		return Ket_Noi_DT;
	}

	public void setKet_Noi_DT(String ket_Noi_DT) {
		Ket_Noi_DT = ket_Noi_DT;
	}

	public String getCong_USB() {
		return Cong_USB;
	}

	public void setCong_USB(String cong_USB) {
		Cong_USB = cong_USB;
	}

	public String getSac_DT() {
		return Sac_DT;
	}

	public void setSac_DT(String sac_DT) {
		Sac_DT = sac_DT;
	}

	public String getBluetooth() {
		return Bluetooth;
	}

	public void setBluetooth(String bluetooth) {
		Bluetooth = bluetooth;
	}

	public String getAm_Thanh() {
		return Am_Thanh;
	}

	public void setAm_Thanh(String am_Thanh) {
		Am_Thanh = am_Thanh;
	}

	public String getAnh_Sang() {
		return Anh_Sang;
	}

	public void setAnh_Sang(String anh_Sang) {
		Anh_Sang = anh_Sang;
	}

	public String getDen_Cop_Sau() {
		return Den_Cop_Sau;
	}

	public void setDen_Cop_Sau(String den_Cop_Sau) {
		Den_Cop_Sau = den_Cop_Sau;
	}

	public String getGuong_Chieu_Hau() {
		return Guong_Chieu_Hau;
	}

	public void setGuong_Chieu_Hau(String guong_Chieu_Hau) {
		Guong_Chieu_Hau = guong_Chieu_Hau;
	}

	public String getDen_Tran() {
		return Den_Tran;
	}

	public void setDen_Tran(String den_Tran) {
		Den_Tran = den_Tran;
	}

	
	
}
