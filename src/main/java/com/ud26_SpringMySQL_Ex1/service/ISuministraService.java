package com.ud26_SpringMySQL_Ex1.service;

import java.util.List;

import com.ud26_SpringMySQL_Ex1.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
	public List<Suministra> listSuministrados(); //Listar All 
	
	public Suministra saveSuministro(Suministra suministro);	//Guarda un suministro CREATE UPDATE
	
	public Suministra suministroByID(int id); //Leer datos de un suministro READ
	
	public void deleteSuministro(int id);// Elimina el suministro DELETE

}
