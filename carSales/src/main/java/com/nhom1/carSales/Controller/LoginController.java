package com.nhom1.carSales.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nhom1.carSales.Entities.ADMIN;
import com.nhom1.carSales.Entities.TaiKhoan;
import com.nhom1.carSales.Repositories.AdminRepository;
import com.nhom1.carSales.Repositories.NhanVienRepository;
import com.nhom1.carSales.Repositories.TaiKhoanRepository;
import com.nhom1.carSales.Request.LoginRequest;

@Controller
public class LoginController {
	@Autowired TaiKhoanRepository taikhoanRepository;
	@Autowired AdminRepository adR;
	@Autowired NhanVienRepository nhanvienRepository;
	
	
	@PostMapping("/DangNhap")
	public String saveUser(@ModelAttribute("Login") LoginRequest loginRequest, ModelMap model) {

		System.out.println("Username : " + loginRequest.getUserName());
		System.out.println("Password : " + loginRequest.getPassWord());
	int count=0;
		List<TaiKhoan> LTaiKhoan = taikhoanRepository.findAll();
		List<ADMIN> Lad = adR.findAll();
		for(TaiKhoan tk:LTaiKhoan) {
			if(loginRequest.getUserName().equals(tk.getId())&&loginRequest.getPassWord().equals(tk.getMk())) {
				for(ADMIN ad:Lad) {
					if(ad.getTaikhoan_ad().getId().equals(loginRequest.getUserName())) {
						count++;
						break;
						
					}
				}
				if(count!=0) return "redirect:/ADMIN";
				else return "redirect:/NhanVienView";
					
			}
			
		}
		
		return "Login";
	}
}
