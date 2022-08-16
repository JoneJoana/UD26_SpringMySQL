package com.ud26_SpringMySQL_Ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ud26_SpringMySQL_Ex1.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, String>{

}
