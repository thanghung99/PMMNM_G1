package com.nhom1.carSales.Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.nhom1.carSales.Entities.AnToan;
import com.nhom1.carSales.Entities.DongCo;
import com.nhom1.carSales.Entities.HangSX;
import com.nhom1.carSales.Entities.KhoiLuong;
import com.nhom1.carSales.Entities.NgoaiThat;
import com.nhom1.carSales.Entities.NhanVien;
import com.nhom1.carSales.Entities.NhienLieu;
import com.nhom1.carSales.Entities.NoiThat;
import com.nhom1.carSales.Entities.Oto;
import com.nhom1.carSales.Entities.TaiKhoan;
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
import com.nhom1.carSales.Request.addNV;
import com.nhom1.carSales.Request.themOto;

@Controller
public class updateController {
	@PersistenceContext protected EntityManager entityManager;
	@Value("${attachment.path}") private String attachmentPath; 
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
	@Autowired private HangSXRepository hangsxRepository;
	@Autowired private OtoRepository otoRepository;
	
	//////////// SuaNV
//	@ModelAttribute(value = "suaNV")
//	public addNV nv() {
//		return new addNV();
//	}
	@PostMapping(value = "SuaNV{id}")
	public String suanv(@ModelAttribute("suaNV") addNV sua,final ModelMap model, @PathVariable("id") int id) {
		NhanVien nv = nvRepository.getOne(id); 
		
		TaiKhoan tk =TaiKhoanRepository.getOne(nv.getTaikhoan_nv().getId());
		tk.setMk(sua.getPassWord());
		TaiKhoanRepository.save(tk);
		
		
		nv.setTen_Nhan_Vien(sua.getTennv());
		nv.setTaikhoan_nv(tk);
		nvRepository.save(nv);
		
		
		List<NhanVien> Lnhanvien = new ArrayList<NhanVien>();
		for (NhanVien nvs : NhanVienRepository.findAll()) {
			Lnhanvien.add(nvs);
		}
		model.addAttribute("NhanVien", Lnhanvien);
		model.addAttribute("NV", nv);
		return "SuaNV";
		
	}
	
	@RequestMapping(value = { "/SuaNV{id}" }, method = RequestMethod.GET)
	public String suanvid(@PathVariable("id") int id,final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		NhanVien nv = NhanVienRepository.getOne(id);
		
		List<NhanVien> Lnhanvien = new ArrayList<NhanVien>();
		for (NhanVien nvs : NhanVienRepository.findAll()) {
			Lnhanvien.add(nvs);
		}
		model.addAttribute("NhanVien", Lnhanvien);
		model.addAttribute("NV", nv);
	return "SuaNVByID";
	};
	
	@RequestMapping(value = { "/SuaNV" }, method = RequestMethod.GET)
	public String suanv(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<NhanVien> Lnhanvien = new ArrayList<NhanVien>();
		for (NhanVien nv : NhanVienRepository.findAll()) {
			Lnhanvien.add(nv);
			System.out.println(nv.getTen_Nhan_Vien());
		}
		model.addAttribute("NhanVien", Lnhanvien);
		return "SuaNV";
	};
////////////// SUA OTO
	@RequestMapping(value = { "/SuaOto" }, method = RequestMethod.GET)
	public String suaoto(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<Oto> listCar = new ArrayList<Oto>();
		for (Oto cars : otoRepository.findAll()) {
			listCar.add(cars);
		}
		
		model.addAttribute("products", listCar);
		return "SuaOto";
	};

	@RequestMapping(value = { "/SuaOto{id}" }, method = RequestMethod.GET)
	public String suaotoid(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		
		Oto oto = otoR.getOne(id);
		model.addAttribute("anh", oto.getAnh1());
		model.addAttribute("id", id);
		List<HangSX> Lhang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
		model.addAttribute("HangSX", Lhang);
		return "SuaOtoID";
	}

	@PostMapping("/SuaOto{id}")
	public String suaoto(@ModelAttribute("suaOto") themOto suaoto, ModelMap model,@PathVariable("id") int id,
			@RequestParam("image1") MultipartFile image1,
			@RequestParam("image2") MultipartFile image2,
			@RequestParam("image3") MultipartFile image3,
			@RequestParam("image4") MultipartFile image4) throws Exception  {
		File file1 = null;
		File file2 = null;
		File file3 = null;
		File file4 = null;
		try {

			// kiểm tra xem người dùng có upload ảnh lên không ?
			if(image1 != null && image1.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file1 = new File(attachmentPath + image1.getOriginalFilename());
				image1.transferTo(file1);
			}
			if(image2 != null && image2.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file2 = new File(attachmentPath + image2.getOriginalFilename());
				image2.transferTo(file2);
			}
			if(image3 != null && image3.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file3 = new File(attachmentPath + image3.getOriginalFilename());
				image3.transferTo(file3);
			}
			if(image4 != null && image4.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file4 = new File(attachmentPath + image4.getOriginalFilename());
				image4.transferTo(file4);
			}
			if(image1 != null && image1.getSize() > 0 ||image2 != null && image2.getSize() > 0||image3 != null && image3.getSize() > 0||image4 != null && image4.getSize() > 0 ) { 	
				// thực hiện lưu thông tin file trong database.
		Oto oto = otoR.getOne(id);
		
		AnToan antoan = atR.getOne(oto.getAntoan().getId_antoan());
		antoan.setChong_Trom(suaoto.getChongTrom());
		antoan.setHe_Thong_Tui_Khi(suaoto.getTuiKhi());
		antoan.setKhoa_Cua_Tu_Dong(suaoto.getKhoaCua());;
		antoan.setPhanh_Dien(suaoto.getPhanhDienTu());
		antoan.setPhanh_Sau(suaoto.getPhanhSau());
		antoan.setPhanh_Truoc(suaoto.getPhanhTruoc());
		antoan.setId_antoan(suaoto.getId());
		atR.save(antoan);
		
		//Bang vanhanh
		VanHanh vanhanh=VanHanhRepository.getOne(oto.getVanhanh().getId_vanhanh());
		vanhanh.setDan_Dong(suaoto.getDanDong());
		vanhanh.setDung_Tich_Xang(suaoto.getDungTich());
		vanhanh.setHop_So(suaoto.getHopSo());
		vanhanh.setTreo_Sau(suaoto.getTreoSau());
		vanhanh.setTreo_Truoc(suaoto.getTreoTruoc());
		vanhanh.setTro_Luc(suaoto.getTroLuc());
		VanHanhRepository.save(vanhanh);
		
		//bang dong co
		DongCo dongco=dongcoRepository.getOne(vanhanh.getDongco().getId_DongCo());
		dongco.setCong_Suat(suaoto.getCongXuat());
		dongco.setLoai_DongCo(suaoto.getLoaidongCo());
		dongco.setMo_Men_Xoan(suaoto.getMoMenXoan());
		dongco.setTu_Dong_Tat(suaoto.getMoMenXoan());
		dongcoRepository.save(dongco);
		
		//bang khoi luong
		KhoiLuong khoiluong=klRepository.getOne(oto.getKhoiluong().getId_khoiluong());
		khoiluong.setCao(suaoto.getCao());
		khoiluong.setDai(suaoto.getDai());
		khoiluong.setRong(suaoto.getRong());
		khoiluong.setKhoi_luong(suaoto.getKhoiLuong());
		klRepository.save(khoiluong);
		
		//bang nhien lieu
		NhienLieu nhienlieu=NhienLieuRepository.getOne(oto.getNhienlieu().getId_nhienlieu());
		nhienlieu.setChu_Trinh_Co_Ban(suaoto.getChuTrinh());
		NhienLieuRepository.save(nhienlieu);
		
		//bang noi that
		NoiThat noithat=noithatRepository.getOne(oto.getNoithat().getId_noithat());
		noithat.setAm_Thanh(suaoto.getAmThanh());
		noithat.setAnh_Sang(suaoto.getAnhSang());
		noithat.setBluetooth(suaoto.getBluetooth());
		noithat.setDen_Cop_Sau(suaoto.getDenCopSau());
		noithat.setDen_Tran(suaoto.getDenTran());
		noithat.setDieu_Hoa(suaoto.getDieuHoa());
		noithat.setGiai_Tri(suaoto.getGiaiTri());
		noithat.setGuong_Chieu_Hau(suaoto.getGuongChieuHau());
		noithat.setKet_Noi_DT(suaoto.getKetNoiDT());
		noithat.setKhoa_Thong_Minh(suaoto.getKhoaThongMinh());
		noithat.setMan_Hinh_Thong_Minh(suaoto.getManHinh());
		noithat.setMau_noi_That(suaoto.getMauNoiThat());
		noithat.setSac_DT(suaoto.getSacDT());
		noithat.setSo_Cho_Ngoi(suaoto.getSoChoNgoi());
		noithat.setVo_Lang(suaoto.getVoLang());
		noithatRepository.save(noithat);
		
		//bang ngoai that
		NgoaiThat ngoaithat=ngoaithatRepository.getOne(oto.getNgoaithat().getId_ngoaithat());
		ngoaithat.setBoVaLop(suaoto.getBoVaLop());
		ngoaithat.setDenBanNgay(suaoto.getDenBanNgay());
		ngoaithat.setDenHau(suaoto.getDenHau());
		ngoaithat.setDenTruoc(suaoto.getDenTruoc());
		ngoaithat.setGatMuaTuDong(suaoto.getGatMua());
		ngoaithat.setGuongChieuHau(suaoto.getGuongChieuHau());
		ngoaithat.setKinhCachNhiet(suaoto.getKinhCachNhiet());
		ngoaithat.setKinhCuaSo(suaoto.getKinhCuaSo());
		ngoaithat.setLop(suaoto.getLop());
		ngoaithat.setMauXe(suaoto.getMauXe());
		ngoaithat.setOngXaCanSau(suaoto.getOngXa());
		ngoaithat.setVienTrangTri(suaoto.getVienTrangChi());
		ngoaithatRepository.save(ngoaithat);
		
		///HangSX
		HangSX hangsx = hangsxRepository.getOne(suaoto.getMaHang());
		
		
		
		oto.setAnh1(image1.getOriginalFilename());
		oto.setAnh2(image2.getOriginalFilename());
		oto.setAnh3(image3.getOriginalFilename());
		oto.setAnh4(image4.getOriginalFilename());		
		oto.setAntoan(antoan);
		oto.setVanhanh(vanhanh); 
		oto.setKhoiluong(khoiluong);
		oto.setNhienlieu(nhienlieu);
		oto.setNoithat(noithat);
		oto.setNgoaithat(ngoaithat);
		oto.setTen_oto(suaoto.getTenXe());
		oto.setGiaxe(suaoto.getGia());
		oto.setHangsx(hangsx);
		otoR.save(oto);
			}
		} catch (Exception x) {
			if (file1 != null) {
				file1.deleteOnExit();
			}
			if (file2 != null) {
				file2.deleteOnExit();
			}
			if (file3 != null) {
				file3.deleteOnExit();
			}
			if (file4 != null) {
				file4.deleteOnExit();
			}
			throw x;
		}

		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for (com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);
		}
		List<HangSX> Lhang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
		model.addAttribute("HangSX", Lhang);
		model.addAttribute("products", listCar);
		return "SuaOto";
		
	}
	
	
	////////////////////// SUA OTO_nv
	@RequestMapping(value = { "/SuaOto-NV" }, method = RequestMethod.GET)
	public String suaotonv(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<Oto> listCar = new ArrayList<Oto>();
		for (Oto cars : otoRepository.findAll()) {
			listCar.add(cars);
		}
		
		model.addAttribute("products", listCar);
		return "SuaOto-NV";
	};

	@RequestMapping(value = { "/SuaOtoNV{id}" }, method = RequestMethod.GET)
	public String suaotonvid(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		
		Oto oto = otoR.getOne(id);
		model.addAttribute("anh", oto.getAnh1());
		model.addAttribute("id", id);
		List<HangSX> Lhang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
			model.addAttribute("HangSX", Lhang);
		return "SuaOto-NV-ID";
	}



	@PostMapping("/SuaOtoNV{id}")
	public String suaotonvi(@ModelAttribute("suaOto") themOto suaoto, ModelMap model,@PathVariable("id") int id,
			@RequestParam("image1") MultipartFile image1,
			@RequestParam("image2") MultipartFile image2,
			@RequestParam("image3") MultipartFile image3,
			@RequestParam("image4") MultipartFile image4) throws Exception  {
		File file1 = null;
		File file2 = null;
		File file3 = null;
		File file4 = null;
		try {

			// kiểm tra xem người dùng có upload ảnh lên không ?
			if(image1 != null && image1.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file1 = new File(attachmentPath + image1.getOriginalFilename());
				image1.transferTo(file1);
			}
			if(image2 != null && image2.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file2 = new File(attachmentPath + image2.getOriginalFilename());
				image2.transferTo(file2);
			}
			if(image3 != null && image3.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file3 = new File(attachmentPath + image3.getOriginalFilename());
				image3.transferTo(file3);
			}
			if(image4 != null && image4.getSize() > 0) {
				// thực hiện lưu attacment vào folder trên server.
				file4 = new File(attachmentPath + image4.getOriginalFilename());
				image4.transferTo(file4);
			}
			if(image1 != null && image1.getSize() > 0 ||image2 != null && image2.getSize() > 0||image3 != null && image3.getSize() > 0||image4 != null && image4.getSize() > 0 ) { 	
				// thực hiện lưu thông tin file trong database.
		Oto oto = otoR.getOne(id);
		
		AnToan antoan = atR.getOne(oto.getAntoan().getId_antoan());
		antoan.setChong_Trom(suaoto.getChongTrom());
		antoan.setHe_Thong_Tui_Khi(suaoto.getTuiKhi());
		antoan.setKhoa_Cua_Tu_Dong(suaoto.getKhoaCua());;
		antoan.setPhanh_Dien(suaoto.getPhanhDienTu());
		antoan.setPhanh_Sau(suaoto.getPhanhSau());
		antoan.setPhanh_Truoc(suaoto.getPhanhTruoc());
		antoan.setId_antoan(suaoto.getId());
		atR.save(antoan);
		
		//Bang vanhanh
		VanHanh vanhanh=VanHanhRepository.getOne(oto.getVanhanh().getId_vanhanh());
		vanhanh.setDan_Dong(suaoto.getDanDong());
		vanhanh.setDung_Tich_Xang(suaoto.getDungTich());
		vanhanh.setHop_So(suaoto.getHopSo());
		vanhanh.setTreo_Sau(suaoto.getTreoSau());
		vanhanh.setTreo_Truoc(suaoto.getTreoTruoc());
		vanhanh.setTro_Luc(suaoto.getTroLuc());
		VanHanhRepository.save(vanhanh);
		
		//bang dong co
		DongCo dongco=dongcoRepository.getOne(vanhanh.getDongco().getId_DongCo());
		dongco.setCong_Suat(suaoto.getCongXuat());
		dongco.setLoai_DongCo(suaoto.getLoaidongCo());
		dongco.setMo_Men_Xoan(suaoto.getMoMenXoan());
		dongco.setTu_Dong_Tat(suaoto.getMoMenXoan());
		dongcoRepository.save(dongco);
		
		//bang khoi luong
		KhoiLuong khoiluong=klRepository.getOne(oto.getKhoiluong().getId_khoiluong());
		khoiluong.setCao(suaoto.getCao());
		khoiluong.setDai(suaoto.getDai());
		khoiluong.setRong(suaoto.getRong());
		khoiluong.setKhoi_luong(suaoto.getKhoiLuong());
		klRepository.save(khoiluong);
		
		//bang nhien lieu
		NhienLieu nhienlieu=NhienLieuRepository.getOne(oto.getNhienlieu().getId_nhienlieu());
		nhienlieu.setChu_Trinh_Co_Ban(suaoto.getChuTrinh());
		NhienLieuRepository.save(nhienlieu);
		
		//bang noi that
		NoiThat noithat=noithatRepository.getOne(oto.getNoithat().getId_noithat());
		noithat.setAm_Thanh(suaoto.getAmThanh());
		noithat.setAnh_Sang(suaoto.getAnhSang());
		noithat.setBluetooth(suaoto.getBluetooth());
		noithat.setDen_Cop_Sau(suaoto.getDenCopSau());
		noithat.setDen_Tran(suaoto.getDenTran());
		noithat.setDieu_Hoa(suaoto.getDieuHoa());
		noithat.setGiai_Tri(suaoto.getGiaiTri());
		noithat.setGuong_Chieu_Hau(suaoto.getGuongChieuHau());
		noithat.setKet_Noi_DT(suaoto.getKetNoiDT());
		noithat.setKhoa_Thong_Minh(suaoto.getKhoaThongMinh());
		noithat.setMan_Hinh_Thong_Minh(suaoto.getManHinh());
		noithat.setMau_noi_That(suaoto.getMauNoiThat());
		noithat.setSac_DT(suaoto.getSacDT());
		noithat.setSo_Cho_Ngoi(suaoto.getSoChoNgoi());
		noithat.setVo_Lang(suaoto.getVoLang());
		noithatRepository.save(noithat);
		
		//bang ngoai that
		NgoaiThat ngoaithat=ngoaithatRepository.getOne(oto.getNgoaithat().getId_ngoaithat());
		ngoaithat.setBoVaLop(suaoto.getBoVaLop());
		ngoaithat.setDenBanNgay(suaoto.getDenBanNgay());
		ngoaithat.setDenHau(suaoto.getDenHau());
		ngoaithat.setDenTruoc(suaoto.getDenTruoc());
		ngoaithat.setGatMuaTuDong(suaoto.getGatMua());
		ngoaithat.setGuongChieuHau(suaoto.getGuongChieuHau());
		ngoaithat.setKinhCachNhiet(suaoto.getKinhCachNhiet());
		ngoaithat.setKinhCuaSo(suaoto.getKinhCuaSo());
		ngoaithat.setLop(suaoto.getLop());
		ngoaithat.setMauXe(suaoto.getMauXe());
		ngoaithat.setOngXaCanSau(suaoto.getOngXa());
		ngoaithat.setVienTrangTri(suaoto.getVienTrangChi());
		ngoaithatRepository.save(ngoaithat);
		
		///HangSX
		HangSX hangsx = hangsxRepository.getOne(suaoto.getMaHang());
		
		
		
		oto.setAnh1(image1.getOriginalFilename());
		oto.setAnh2(image2.getOriginalFilename());
		oto.setAnh3(image3.getOriginalFilename());
		oto.setAnh4(image4.getOriginalFilename());		
		oto.setAntoan(antoan);
		oto.setVanhanh(vanhanh); 
		oto.setKhoiluong(khoiluong);
		oto.setNhienlieu(nhienlieu);
		oto.setNoithat(noithat);
		oto.setNgoaithat(ngoaithat);
		oto.setTen_oto(suaoto.getTenXe());
		oto.setGiaxe(suaoto.getGia());
		oto.setHangsx(hangsx);
		otoR.save(oto);
			}
		} catch (Exception x) {
			if (file1 != null) {
				file1.deleteOnExit();
			}
			if (file2 != null) {
				file2.deleteOnExit();
			}
			if (file3 != null) {
				file3.deleteOnExit();
			}
			if (file4 != null) {
				file4.deleteOnExit();
			}
			throw x;
		}

		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for (com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);
		}
		List<HangSX> Lhang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
		model.addAttribute("HangSX", Lhang);
		model.addAttribute("products", listCar);
		return "SuaOto-NV";
		
	}
	
}
