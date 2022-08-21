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
		return piezasServiceImple.piezaByID(id);
	}
	
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPieza(@PathVariable(name="id")int id,@RequestBody Piezas piezas) {
		
		Piezas pieza_selec=piezasServiceImple.piezaByID(id);
		
		pieza_selec.setNombre(piezas.getNombre());
		pieza_selec.setSuministra(piezas.getSuministra());
		
		return piezasServiceImple.savePieza(pieza_selec);
	}
	
	@DeleteMapping("/piezas/{id}")
	public void deletePieza(@PathVariable(name="id")int id) {
		piezasServiceImple.deletePieza(id);
	}
}
