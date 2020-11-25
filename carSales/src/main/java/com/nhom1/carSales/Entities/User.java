/*
 * package com.nhom1.carSales.Entities;
 * 
 * import java.io.Serializable;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
 * import javax.persistence.Id; import javax.persistence.Table;
 * 
 * //Serializable giup luu object vao dang text va doc ra
 * 
 * @Entity
 * 
 * @Table(name = "user") public class User implements Serializable { private
 * static final long serialVersionUID = 880163957096965869L;
 * 
 * @Id // xác định đây là khoá chính.
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment.
 * 
 * @Column(name = "id_user") private Integer id; // primary-key
 * 
 * @Column(name = "tenKH", length = 30, nullable = false) private String tenKH;
 * 
 * @Column(name = "soDT", length = 11, nullable = false) private Integer soDT;
 * 
 * @Column(name = "email", length = 45, nullable = false) private String email;
 * 
 * @Column(name = "diachi", length = 30, nullable = false) private String
 * diachi;
 * 
 * public Integer getId() { return id; }
 * 
 * public void setId(Integer id) { this.id = id; }
 * 
 * public String getTenKH() { return tenKH; }
 * 
 * public void setTenKH(String tenKH) { this.tenKH = tenKH; }
 * 
 * public Integer getSoDT() { return soDT; }
 * 
 * public void setSoDT(Integer soDT) { this.soDT = soDT; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public String getDiachi() { return diachi; }
 * 
 * public void setDiachi(String diachi) { this.diachi = diachi; }
 * 
 * }
 */