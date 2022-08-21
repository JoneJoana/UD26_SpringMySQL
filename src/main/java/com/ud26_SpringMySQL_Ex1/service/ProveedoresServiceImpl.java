package com.ud26_SpringMySQL_Ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26_SpringMySQL_Ex1.dao.IProveedoresDAO;
import com.ud26_SpringMySQL_Ex1.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService{
	
	@Autowired
	IProveedoresDAO iProveedoresDAO;
	
	
	@Override
	public List<Proveedores> listProveedores() {
		return iProveedoresDAO.findAll();
	}

	@Override
	public Proveedores saveProveedor(Proveedores proveedor) {
		return iProveedoresDAO.save(proveedor);
	}

	@Override
	public Proveedores proveedorByID(String id) {
		return iProveedoresDAO.findById(id).orElse(null);
	}

	@Override
	public void deleteProveedor(String id) {
		iProveedoresDAO.deleteById(id);
	}

}
