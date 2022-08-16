package com.ud26_SpringMySQL_Ex1.service;

import java.util.List;

import com.ud26_SpringMySQL_Ex1.dto.Proveedores;

public interface IProveedoresService {

	//Metodos del CRUD
	public List<Proveedores> listProveedores(); //Listar All 
	
	public Proveedores saveProveedor(Proveedores proveedor); //Guarda un PROVEEDOR CREATE UPDATE
	
	public Proveedores proveedorByID(String id); //Leer datos de un PROVEEDOR READ	
	
	public void deleteProveedor(String id);// Elimina el PROVEEDOR DELETE
}
