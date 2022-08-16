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

import com.ud26_SpringMySQL_Ex1.dto.Suministra;
import com.ud26_SpringMySQL_Ex1.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministros(){
		return suministraServImpl.listSuministrados();
	}
	
	
	@PostMapping("/suministra")
	public Suministra salvarRegistroCurso(@RequestBody Suministra suministro) {		
		return suministraServImpl.saveSuministro(suministro);
	}
	
	
	@GetMapping("/suministra/{id}")
	public Suministra suministrByID(@PathVariable(name="id") int id) {
		
		Suministra RegistroCurso_xid= new Suministra();
		
		RegistroCurso_xid=suministraServImpl.suministroByID(id);
				
		return RegistroCurso_xid;
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministro(@PathVariable(name="id")int id,@RequestBody Suministra suministro) {
		
		Suministra Sumi_selec= new Suministra();
		Suministra sumi_actualizado= new Suministra();
		
		Sumi_selec= suministraServImpl.suministroByID(id);
		
		
		Sumi_selec.setPieza(suministro.getPieza());
		Sumi_selec.setProveedor(suministro.getProveedor());
		Sumi_selec.setPrecio(suministro.getPrecio());
		
		sumi_actualizado = suministraServImpl.saveSuministro(Sumi_selec);
		
		return sumi_actualizado;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void deleteSuministro(@PathVariable(name="id")int id) {
		suministraServImpl.deleteSuministro(id);
	}
	
}
