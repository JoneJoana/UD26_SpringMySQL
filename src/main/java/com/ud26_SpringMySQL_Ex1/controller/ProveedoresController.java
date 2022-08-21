package com.ud26_SpringMySQL_Ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ud26_SpringMySQL_Ex1.service.ProveedoresServiceImpl;
import com.ud26_SpringMySQL_Ex1.dto.Proveedores;

@RestController
@RequestMapping("/api")
public class ProveedoresController {

	@Autowired
	ProveedoresServiceImpl proveedoresServImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedor(){
		return proveedoresServImpl.listProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedores guardarProveedor(@RequestBody Proveedores proveedor) {		
		return proveedoresServImpl.saveProveedor(proveedor);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedores proveedorById(@PathVariable(name="id") String id) {
		return proveedoresServImpl.proveedorByID(id);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedor(@PathVariable(name="id")String id,@RequestBody Proveedores proveedor) {
		
		Proveedores prov_seleccionado = proveedoresServImpl.proveedorByID(id);		
		prov_seleccionado.setNombre(proveedor.getNombre());
		prov_seleccionado.setSuministra(proveedor.getSuministra());
		
		return proveedoresServImpl.saveProveedor(prov_seleccionado);
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void deleteProveedor(@PathVariable(name="id")String id) {
		proveedoresServImpl.deleteProveedor(id);
	}
}
