package com.nhom1.carSales.Controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.nhom1.carSales.Request.Hang;
import com.nhom1.carSales.Request.themOto;

@Controller
public class editController {
	@PersistenceContext protected EntityManager entityManager;
	@Value("${attachment.path}") private String attachmentPath; 
	@Autowired
	private AnToanRepository atR;
	@Autowired
	private OtoRepository otoR;
	@Autowired
	private KhoiLuongRepository klRepository;
	@Autowired
	private AdminRepository adRepository;
	@Autowired
	private DongCoRepository dongcoRepository;
	@Autowired
	private NgoaiThatRepository ngoaithatRepository;
	@Autowired
	private NhanVienRepository nvRepository;
	@Autowired
	private NhienLieuRepository NhienLieuRepository;
	@Autowired
	private NoiThatRepository noithatRepository;
	@Autowired
	private TaiKhoanRepository TaiKhoanRepository;
	@Autowired
	private VanHanhRepository VanHanhRepository;
	@Autowired
	private NhanVienRepository NhanVienRepository;
	@Autowired
	private HangSXRepository hangsxRepository;
	@Autowired
	private OtoRepository otoRepository;

	
	
	//////////XOA OTO
	@RequestMapping(value = { "/XoaOto" }, method = RequestMethod.GET)
	public String view(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for (com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);
		}

		model.addAttribute("products", listCar);
		return "XoaOto";
	};

	@RequestMapping(value = { "/XoaOto{id}" }, method = RequestMethod.GET)
	public String xoaoto(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		otoRepository.deleteById(id);
		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for (com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);

		}

		model.addAttribute("products", listCar);
		return "XoaOto";
	};
/////////////XOANV
	@RequestMapping(value = { "/XoaNV" }, method = RequestMethod.GET)
	public String xoanv(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<NhanVien> Lnhanvien = new ArrayList<NhanVien>();
		for (NhanVien nv : NhanVienRepository.findAll()) {
			Lnhanvien.add(nv);
			System.out.println(nv.getTen_Nhan_Vien());
		}
		model.addAttribute("NhanVien", Lnhanvien);
		return "XoaNV";
	};

	@RequestMapping(value = { "/XoaNV{id}" }, method = RequestMethod.GET)
	public String xoanvid(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		NhanVienRepository.deleteById(id);
		List<NhanVien> Lnhanvien = new ArrayList<NhanVien>();
		for (NhanVien nv : NhanVienRepository.findAll()) {
			Lnhanvien.add(nv);
			System.out.println(nv.getTen_Nhan_Vien());
		}
		model.addAttribute("NhanVien", Lnhanvien);
		return "XoaNV";
	};

//	XOA OTo_NV
	@RequestMapping(value = { "/XoaOto-NV" }, method = RequestMethod.GET)
	public String xoaotonv(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for (com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);

		}

		model.addAttribute("products", listCar);
		return "XoaOto-NV";
	};

	@RequestMapping(value = { "/XoaOtoNV{id}" }, method = RequestMethod.DELETE)
	public String xoaotonvid(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		otoR.deleteById(id);
		List<com.nhom1.carSales.Entities.Oto> listCar = new ArrayList<com.nhom1.carSales.Entities.Oto>();
		for (com.nhom1.carSales.Entities.Oto cars : otoRepository.findAll()) {
			listCar.add(cars);

		}

		model.addAttribute("products", listCar);
		return "XoaOto-NV";
	};
/////// THEM NV
	/*
	 * @ModelAttribute("addNV") public com.nhom1.carSales.Request.addNV addNV() {
	 * return new com.nhom1.carSales.Request.addNV(); }
	 */
	@PostMapping("/ThemNV")
	public String saveUser(@ModelAttribute("addNV") com.nhom1.carSales.Request.addNV addnv, ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response) {

		TaiKhoan tk = new TaiKhoan();
		for(TaiKhoan taikhoan: TaiKhoanRepository.findAll()) {
			if(taikhoan.getId().equals(addnv.getUserName()))
				break;
			else {
		
		tk.setId(addnv.getUserName());
		tk.setMk(addnv.getPassWord());
		TaiKhoanRepository.save(tk);
		
		for(NhanVien nhanvien :NhanVienRepository.findAll() ) {
			if(nhanvien.getId_nhanvien()==addnv.getMaNV())
					break;
			else {
				NhanVien nv = new NhanVien();
				nv.setTaikhoan_nv(tk);
				nv.setId_nhanvien(addnv.getMaNV());
				nv.setTen_Nhan_Vien(addnv.getTennv());
				NhanVienRepository.save(nv);
				
			}
				
		}
		}
		}
		
	
		
		return "ThemNV";
	}

	@RequestMapping(value = { "/ThemNV" }, method = RequestMethod.GET)
	public String themnv(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		return "ThemNV";
	};
/////////////THEM OTO
	@RequestMapping(value = { "/ThemOto" }, method = RequestMethod.GET)
	public String themot(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
	List<HangSX> Lhang = new ArrayList<HangSX>();
	for(HangSX hang : hangsxRepository.findAll()) {
		Lhang.add(hang);
		System.out.println(hang.getTen_hangsx());
	}
		model.addAttribute("HangSX", Lhang);
		return "ThemOto";
	};

//	----------------------------------------------------------
//	@ModelAttribute("/ThemOto")
//	public themOto them() {
//		return new themOto();
//	}

	@PostMapping(value = "/ThemOto")
	public String themoto(@ModelAttribute("themOto") themOto them, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response, 
			@RequestParam("image1") MultipartFile image1,
			@RequestParam("image2") MultipartFile image2,
			@RequestParam("image3") MultipartFile image3,
			@RequestParam("image4") MultipartFile image4) throws Exception {
		for(Oto ot : otoR.findAll()) {
			if(ot.getId_oto().equals(them.getId()))
					break;
			else  {
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
						AnToan antoan = new AnToan();
						antoan.setChong_Trom(them.getChongTrom());
						antoan.setHe_Thong_Tui_Khi(them.getTuiKhi());
						antoan.setId_antoan(them.getId());
						antoan.setKhoa_Cua_Tu_Dong(them.getKhoaCua());
						antoan.setPhanh_Dien(them.getPhanhDienTu());
						antoan.setPhanh_Sau(them.getPhanhSau());
						antoan.setPhanh_Truoc(them.getPhanhTruoc());
						atR.save(antoan);
						
						
						NgoaiThat ngoaithat = new NgoaiThat();
						ngoaithat.setId_ngoaithat(them.getId());
						ngoaithat.setDenTruoc(them.getDenTruoc());
						ngoaithat.setDenBanNgay(them.getDenBanNgay());
						ngoaithat.setDenHau(them.getDenHau());
						ngoaithat.setGuongChieuHau(them.getGuongChieuHau());
						ngoaithat.setGatMuaTuDong(them.getGatMua());
						ngoaithat.setKinhCuaSo(them.getKinhCuaSo());
						ngoaithat.setKinhCachNhiet(them.getKinhCachNhiet());
						ngoaithat.setLop(them.getLop());
						ngoaithat.setVienTrangTri(them.getVienTrangChi());
						ngoaithat.setBoVaLop(them.getBoVaLop());
						ngoaithat.setMauXe(them.getMauXe());
						ngoaithatRepository.save(ngoaithat);
						
						NoiThat noithat = new NoiThat();
						noithat.setId_noithat(them.getId());
						noithat.setSo_Cho_Ngoi(them.getSoChoNgoi());
						noithat.setKhoa_Thong_Minh(them.getKhoaThongMinh());
						noithat.setMan_Hinh_Thong_Minh(them.getManHinh());
						// noithat.setCau_Hinh_Ghe(them.ca); //khong co
						noithat.setMau_noi_That(them.getMauNoiThat());
						noithat.setVo_Lang(them.getVoLang());
						noithat.setDieu_Hoa(them.getDieuHoa());
						noithat.setGiai_Tri(them.getGiaiTri());
						noithat.setKet_Noi_DT(them.getKetNoiDT());
						noithat.setCong_USB(Integer.toString(them.getUsb()));
						noithat.setSac_DT(them.getSacDT());
						noithat.setBluetooth(them.getBluetooth());
						noithat.setAm_Thanh(them.getAmThanh());
						noithat.setAnh_Sang(them.getAnhSang());
						noithat.setDen_Cop_Sau(them.getDenCopSau());
						noithat.setGuong_Chieu_Hau(them.getGuongChieuHau());
						noithat.setDen_Tran(them.getDenTran());
						noithatRepository.save(noithat);
						
						
						DongCo dongco = new DongCo();
						dongco.setId_DongCo(them.getId());
						dongco.setLoai_DongCo(them.getLoaidongCo());
						dongco.setCong_Suat(them.getCongXuat());
						dongco.setMo_Men_Xoan(them.getMoMenXoan());
						dongco.setTu_Dong_Tat(them.getTuDongTat());
						dongcoRepository.save(dongco);
						
					
						
						VanHanh vanhanh = new VanHanh();
						vanhanh.setId_vanhanh(them.getId());
						vanhanh.setHop_So(them.getHopSo());
						vanhanh.setDan_Dong(them.getDanDong());
						vanhanh.setDung_Tich_Xang(them.getDungTich());
						vanhanh.setTreo_Truoc(them.getTreoTruoc());
						vanhanh.setTreo_Sau(them.getTreoSau());
						vanhanh.setDongco(dongco);
						vanhanh.setTro_Luc(them.getTroLuc());
						VanHanhRepository.save(vanhanh);
						
						
						KhoiLuong khoiluong = new KhoiLuong();
						khoiluong.setId_khoiluong(them.getId());
						khoiluong.setDai(them.getDai());
						khoiluong.setRong(them.getRong());
						khoiluong.setCao(them.getCao());
						khoiluong.setKhoi_luong(them.getKhoiLuong());
						klRepository.save(khoiluong);
						
						HangSX hang = hangsxRepository.getOne(them.getMaHang())	;	

						NhienLieu nhienlieu = new NhienLieu();
						nhienlieu.setId_nhienlieu(them.getId());
						nhienlieu.setChu_Trinh_Co_Ban(them.getChuTrinh());
						NhienLieuRepository.save(nhienlieu);
						
						Oto oto = new Oto();
						oto.setId_oto(them.getId());
						oto.setTen_oto(them.getTenXe());
						oto.setKhoiluong(khoiluong);
						oto.setVanhanh(vanhanh);
						oto.setAntoan(antoan);
						oto.setNhienlieu(nhienlieu);
						oto.setNoithat(noithat);
						oto.setHangsx(hang);
						oto.setGiaxe(them.getGia());
						oto.setNgoaithat(ngoaithat);
						oto.setAnh1(image1.getOriginalFilename());
						oto.setAnh2(image1.getOriginalFilename());
						oto.setAnh3(image1.getOriginalFilename());
						oto.setAnh4(image1.getOriginalFilename());
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

				
				
				
			
			}
		}
		List<HangSX> Lhang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
			model.addAttribute("HangSX", Lhang);
		return "ThemOto";
	};

	

	

//	THEM OTO_NV
	@RequestMapping(value = { "/ThemOto-NV" }, method = RequestMethod.GET)
	public String themoto_nv(final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
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
		return "ThemOto-NV";
	};

	

//	----------------------------------------------------------
	

	@PostMapping(value = "/ThemOto-NV")
	public String themotonv(@ModelAttribute("themOto") themOto them, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response, 
			@RequestParam("image1") MultipartFile image1,
			@RequestParam("image2") MultipartFile image2,
			@RequestParam("image3") MultipartFile image3,
			@RequestParam("image4") MultipartFile image4) throws Exception {
		for(Oto ot : otoR.findAll()) {
			if(ot.getId_oto().equals(them.getId()))
					break;
			else  {
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
						AnToan antoan = new AnToan();
						antoan.setChong_Trom(them.getChongTrom());
						antoan.setHe_Thong_Tui_Khi(them.getTuiKhi());
						antoan.setId_antoan(them.getId());
						antoan.setKhoa_Cua_Tu_Dong(them.getKhoaCua());
						antoan.setPhanh_Dien(them.getPhanhDienTu());
						antoan.setPhanh_Sau(them.getPhanhSau());
						antoan.setPhanh_Truoc(them.getPhanhTruoc());
						atR.save(antoan);
						
						
						NgoaiThat ngoaithat = new NgoaiThat();
						ngoaithat.setId_ngoaithat(them.getId());
						ngoaithat.setDenTruoc(them.getDenTruoc());
						ngoaithat.setDenBanNgay(them.getDenBanNgay());
						ngoaithat.setDenHau(them.getDenHau());
						ngoaithat.setGuongChieuHau(them.getGuongChieuHau());
						ngoaithat.setGatMuaTuDong(them.getGatMua());
						ngoaithat.setKinhCuaSo(them.getKinhCuaSo());
						ngoaithat.setKinhCachNhiet(them.getKinhCachNhiet());
						ngoaithat.setLop(them.getLop());
						ngoaithat.setVienTrangTri(them.getVienTrangChi());
						ngoaithat.setBoVaLop(them.getBoVaLop());
						ngoaithat.setMauXe(them.getMauXe());
						ngoaithatRepository.save(ngoaithat);
						
						NoiThat noithat = new NoiThat();
						noithat.setId_noithat(them.getId());
						noithat.setSo_Cho_Ngoi(them.getSoChoNgoi());
						noithat.setKhoa_Thong_Minh(them.getKhoaThongMinh());
						noithat.setMan_Hinh_Thong_Minh(them.getManHinh());
						// noithat.setCau_Hinh_Ghe(them.ca); //khong co
						noithat.setMau_noi_That(them.getMauNoiThat());
						noithat.setVo_Lang(them.getVoLang());
						noithat.setDieu_Hoa(them.getDieuHoa());
						noithat.setGiai_Tri(them.getGiaiTri());
						noithat.setKet_Noi_DT(them.getKetNoiDT());
						noithat.setCong_USB(Integer.toString(them.getUsb()));
						noithat.setSac_DT(them.getSacDT());
						noithat.setBluetooth(them.getBluetooth());
						noithat.setAm_Thanh(them.getAmThanh());
						noithat.setAnh_Sang(them.getAnhSang());
						noithat.setDen_Cop_Sau(them.getDenCopSau());
						noithat.setGuong_Chieu_Hau(them.getGuongChieuHau());
						noithat.setDen_Tran(them.getDenTran());
						noithatRepository.save(noithat);
						
						
						DongCo dongco = new DongCo();
						dongco.setId_DongCo(them.getId());
						dongco.setLoai_DongCo(them.getLoaidongCo());
						dongco.setCong_Suat(them.getCongXuat());
						dongco.setMo_Men_Xoan(them.getMoMenXoan());
						dongco.setTu_Dong_Tat(them.getTuDongTat());
						dongcoRepository.save(dongco);
						
					
						
						VanHanh vanhanh = new VanHanh();
						vanhanh.setId_vanhanh(them.getId());
						vanhanh.setHop_So(them.getHopSo());
						vanhanh.setDan_Dong(them.getDanDong());
						vanhanh.setDung_Tich_Xang(them.getDungTich());
						vanhanh.setTreo_Truoc(them.getTreoTruoc());
						vanhanh.setTreo_Sau(them.getTreoSau());
						vanhanh.setDongco(dongco);
						vanhanh.setTro_Luc(them.getTroLuc());
						VanHanhRepository.save(vanhanh);
						
						
						KhoiLuong khoiluong = new KhoiLuong();
						khoiluong.setId_khoiluong(them.getId());
						khoiluong.setDai(them.getDai());
						khoiluong.setRong(them.getRong());
						khoiluong.setCao(them.getCao());
						khoiluong.setKhoi_luong(them.getKhoiLuong());
						klRepository.save(khoiluong);
						
						HangSX hang = hangsxRepository.getOne(them.getMaHang())	;	

						NhienLieu nhienlieu = new NhienLieu();
						nhienlieu.setId_nhienlieu(them.getId());
						nhienlieu.setChu_Trinh_Co_Ban(them.getChuTrinh());
						NhienLieuRepository.save(nhienlieu);
						
						Oto oto = new Oto();
						oto.setId_oto(them.getId());
						oto.setTen_oto(them.getTenXe());
						oto.setKhoiluong(khoiluong);
						oto.setVanhanh(vanhanh);
						oto.setAntoan(antoan);
						oto.setNhienlieu(nhienlieu);
						oto.setNoithat(noithat);
						oto.setHangsx(hang);
						oto.setGiaxe(them.getGia());
						oto.setNgoaithat(ngoaithat);
						oto.setAnh1(image1.getOriginalFilename());
						oto.setAnh2(image1.getOriginalFilename());
						oto.setAnh3(image1.getOriginalFilename());
						oto.setAnh4(image1.getOriginalFilename());
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

				
				
				
			
			}
		}
		List<HangSX> Lhang = new ArrayList<HangSX>();
		for(HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
			model.addAttribute("HangSX", Lhang);
		return "ThemOto";
	};

	
	//////////////// Them/SƯa hãng
//	@ModelAttribute(value = "themHang")
//	public Hang hang() {
//		return new Hang();
//	}
	@PostMapping(value = "/ThemHang")
	public String themhang(@ModelAttribute("themHang") Hang them, final ModelMap model,
			final HttpServletRequest request, final HttpServletResponse response) {
		
			HangSX hang = new HangSX();
		for(HangSX hangsx : hangsxRepository.findAll()) {
			if(hangsx.getId_hangsx().equals(them.getMaHang()))
				break;
			else
			{	
			hang.setId_hangsx(them.getMaHang());
			hang.setTen_hangsx(them.getTenHang());
			hangsxRepository.save(hang);
			}
		}
		
		
		return "ThemHang";
	}
	
	
	//// xóa Hãng
	
	@RequestMapping(value = { "/XoaHang{id}" }, method = RequestMethod.GET)
	public String xoahangid(@PathVariable("id") int id, final ModelMap model, final HttpServletRequest request,
			final HttpServletResponse response) {
		int count = 0;
		for(Oto o : otoR.findAll()) {
			if(o.getHangsx().getId_hangsx().equals(id))
				count++;
				break;
			
		}
		if(count==0) {
		hangsxRepository.deleteById(id);
		}
		List<HangSX> Lhang = new ArrayList<>();
		for (HangSX hangs : hangsxRepository.findAll()) {
			Lhang.add(hangs);
		}
		model.addAttribute("HangSX", Lhang);
		return "XoaHang";
	};

	
}
