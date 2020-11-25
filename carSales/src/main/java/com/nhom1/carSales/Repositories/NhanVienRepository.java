package com.nhom1.carSales.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom1.carSales.Entities.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer>{

}
