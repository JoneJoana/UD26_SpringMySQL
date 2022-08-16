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

import com.ud26_SpringMySQL_Ex1.dto.Piezas;
import com.ud26_SpringMySQL_Ex1.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {

	@Autowired
	PiezasServiceImpl piezasServiceImple;
	
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas(){
		return piezasServiceImple.listPiezas();
	}
	
	
	@PostMapping("/piezas")
	public Piezas savePieza(@RequestBody Piezas pieza) {		
		return piezasServiceImple.savePieza(pieza);
	}
	
	
	@GetMapping("/piezas/{id}")
	public Piezas piezaByID(@PathVariable(name="id") int id) {
		
		Piezas pieza= new Piezas();
		
		pieza= piezasServiceImple.piezaByID(id);
		
		System.out.println("Pieza: "+pieza);
		
		return pieza;
	}
	
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPieza(@PathVariable(name="id")int id,@RequestBody Piezas piezas) {
		
		Piezas Pieza_selec= new Piezas();
		Piezas Pieza_actualizado= new Piezas();
		
		Pieza_selec= piezasServiceImple.piezaByID(id);
		
		Pieza_selec.setNombre(piezas.getNombre());
		Pieza_selec.setSuministra(piezas.getSuministra());
		
		Pieza_actualizado = piezasServiceImple.savePieza(Pieza_selec);
		
		System.out.println("El Curso actualizado es: "+ Pieza_actualizado);
		
		return Pieza_actualizado;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void deletePieza(@PathVariable(name="id")int id) {
		piezasServiceImple.deletePieza(id);
	}
}
