package com.nhom1.carSales.Request;

public class TaiKhoan {
	public TaiKhoan(String id, String mk) {
		super();
		this.id = id;
		Mk = mk;
	}
	private String id;
	private String Mk;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMk() {
		return Mk;
	}
	public void setMk(String mk) {
		Mk = mk;
	}
	

}
