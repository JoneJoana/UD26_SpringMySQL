package com.ud26_SpringMySQL_Ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26_SpringMySQL_Ex1.dao.IPiezasDAO;
import com.ud26_SpringMySQL_Ex1.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService{

	@Autowired
	IPiezasDAO iPiezasDao;

	@Override
	public List<Piezas> listPiezas() {
		return iPiezasDao.findAll();
	}

	@Override
	public Piezas savePieza(Piezas pieza) {		
		return iPiezasDao.save(pieza);
	}

	@Override
	public Piezas piezaByID(int id) {
		return iPiezasDao.findById(id).get();
	}

	@Override
	public void deletePieza(int id) {
		iPiezasDao.deleteById(id);
	}
	
}
