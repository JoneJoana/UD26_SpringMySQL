package com.ud26_SpringMySQL_Ex1.service;

import java.util.List;

import com.ud26_SpringMySQL_Ex1.dto.Piezas;

public interface IPiezasService {

	//Metodos del CRUD
	public List<Piezas> listPiezas(); //Listar All 
	
	public Piezas savePieza(Piezas piezas);	//Guarda una pieza CREATE UPDATE
	
	public Piezas piezaByID(int id); //Leer datos de una pieza READ
		
	public void deletePieza(int id);// Elimina la pieza DELETE
}
