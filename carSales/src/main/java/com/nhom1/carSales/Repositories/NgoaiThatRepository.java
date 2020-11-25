package com.nhom1.carSales.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom1.carSales.Entities.NgoaiThat;

@Repository
public interface NgoaiThatRepository extends JpaRepository<NgoaiThat, Integer>{

}
