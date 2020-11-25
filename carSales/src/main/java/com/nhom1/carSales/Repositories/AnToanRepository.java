package com.nhom1.carSales.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.nhom1.carSales.Entities.AnToan;

@Repository
public interface AnToanRepository extends JpaRepository<AnToan	, Integer>{
	 
}
