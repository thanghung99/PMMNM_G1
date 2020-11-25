package com.nhom1.carSales.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nhom1.carSales.Entities.HangSX;

@Repository
public interface HangSXRepository extends JpaRepository<HangSX, Integer>{
	 List<HangSX> findAll() ;	
	 @Query("select u from HangSX u where u.id_hangsx = :id_hangsx ")//day la biet theo kieu cua JPA
	    com.nhom1.carSales.Entities.HangSX findHangByIdHangSX(@Param("id_hangsx") int id_hangsx);
}
