package com.nhom1.carSales.Controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nhom1.carSales.Entities.AnToan;
import com.nhom1.carSales.Entities.DongCo;
import com.nhom1.carSales.Entities.HangSX;
import com.nhom1.carSales.Entities.NgoaiThat;
import com.nhom1.carSales.Entities.NhanVien;
import com.nhom1.carSales.Entities.NhienLieu;
import com.nhom1.carSales.Entities.NoiThat;
import com.nhom1.carSales.Entities.Oto;
import com.nhom1.carSales.Entities.VanHanh;
import com.nhom1.carSales.Repositories.AdminRepository;
import com.nhom1.carSales.Repositories.AnToanRepository;
import com.nhom1.carSales.Repositories.DongCoRepository;
import com.nhom1.carSales.Repositories.HangSXRepository;
import com.nhom1.carSales.Repositories.KhoiLuongRepository;
import com.nhom1.carSales.Repositories.NgoaiThatRepository;
import com.nhom1.carSales.Repositories.NhanVienRepository;
import com.nhom1.carSales.Repositories.NhienLieuRepository;
import com.nhom1.carSales.Repositories.NoiThatRepository;
import com.nhom1.carSales.Repositories.OtoRepository;
import com.nhom1.carSales.Repositories.TaiKhoanRepository;
import com.nhom1.carSales.Repositories.VanHanhRepository;
import com.nhom1.carSales.Request.TimKiem;


@Controller
public class HomeController {
//	----------------------------------------------------------
	@Autowired private AnToanRepository atR;
	@Autowired private OtoRepository otoR;
	@Autowired private KhoiLuongRepository klRepository;
	@Autowired private AdminRepository adRepository;
	@Autowired private DongCoRepository dongcoRepository;
	@Autowired private NgoaiThatRepository ngoaithatRepository;
	@Autowired private NhanVienRepository nvRepository;
	@Autowired private NhienLieuRepository NhienLieuRepository;
	@Autowired private NoiThatRepository noithatRepository;
	@Autowired private TaiKhoanRepository TaiKhoanRepository;
	@Autowired private VanHanhRepository VanHanhRepository;
	@Autowired private NhanVienRepository NhanVienRepository;
	
	@RequestMapping(value = { "/NhanVienView" }, method = RequestMethod.GET)
	public String nvview(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		return "NhanVienView";
	};
	
//	----------------------------------------------------------	
	@RequestMapping(value = { "/ADMIN" }, method = RequestMethod.GET)
	public String adm(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {	
		return "ADMIN";
	};
	
//	----------------------------------------------------------
	@RequestMapping(value = { "/ThemHang" }, method = RequestMethod.GET)
	public String themhang(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {	
		return "ThemHang";
	};
	
	
	@RequestMapping(value = { "/XoaHang" }, method = RequestMethod.GET)
	public String xoahang(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {	
		List<HangSX> Lhang = new ArrayList<>();
		for (HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
		model.addAttribute("HangSX", Lhang);
		return "XoaHang";
	};
	@Autowired private HangSXRepository hangsxRepository;
	@RequestMapping(value = { "/HangSX" }, method = RequestMethod.GET)
	public String hangsx(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
	
		List<HangSX> listHang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			listHang.add(hangs);
			
		}
		model.addAttribute("HangSX", listHang);
	
	return "HangSX";
	};
//	----------------------------------------------------------
	@RequestMapping(value = { "/LienHe" }, method = RequestMethod.GET)
	public String lienhe(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
	return "LienHe";
	};
	@RequestMapping(value = { "/Login" }, method = RequestMethod.GET)
	public String login(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
	return "Login";
	};
//	----------------------------------------------------------
	
//	----------------------------------------------------------
	
//	----------------------------------------------------------
	
//	----------------------------------------------------------
	
//	----------------------------------------------------------
	
//	----------------------------------------------------------
	@Autowired private OtoRepository otoRepository;
	@RequestMapping(value = { "/","/TrangChu" }, method = RequestMethod.GET)
	public String TrangChu(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for(com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);
			
		}
		
		model.addAttribute("products", listCar);
		
		return "TrangChu";
	};
//	----------------------------------------------------------
	
//	----------------------------------------------------------
	
/// Xem TT SAN PHAM	
	@RequestMapping(value = { "/TToto{id}" }, method = RequestMethod.GET)
	public String ttoto(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		Oto oto = otoRepository.getOne(id);
		model.addAttribute("Products", oto);
		
		return "TToto";
	};
	/////////// Tim San Pham
	
	@RequestMapping(value = { "/" }, method = RequestMethod.POST)
	public String timkiem(final ModelMap model,@ModelAttribute("timOto") String tenXe ) {
		List<Oto> listCar = new ArrayList<>();
		for(Oto cars : otoRepository.findAll()) {
			System.out.println("------aa-----"+cars.getTen_oto());System.out.println("------aa-----"+tenXe);
			if(tenXe.equals(cars.getTen_oto())) {
				listCar.add(cars);
				System.out.println("------aa-----"+tenXe);
			}
					
		}
		
		model.addAttribute("products", listCar);
		
		return "TrangChu";
	};
//	@RequestMapping(value = { "/Search" }, method = RequestMethod.GET)
//	public String s(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
//	return "TrangChu";
//	};
}
