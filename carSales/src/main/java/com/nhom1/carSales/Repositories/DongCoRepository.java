package com.nhom1.carSales.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom1.carSales.Entities.DongCo;

@Repository
public interface DongCoRepository extends JpaRepository<DongCo, Integer>{

}
