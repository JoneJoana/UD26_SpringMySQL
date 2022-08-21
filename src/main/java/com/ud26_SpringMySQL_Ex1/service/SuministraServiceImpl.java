package com.ud26_SpringMySQL_Ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ud26_SpringMySQL_Ex1.dao.ISuministraDAO;
import com.ud26_SpringMySQL_Ex1.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{
	
	@Autowired
	ISuministraDAO iSuministraDao;

	@Override
	public List<Suministra> listSuministrados() {
		return iSuministraDao.findAll();
	}

	@Override
	public Suministra saveSuministro(Suministra suministro) {
		return iSuministraDao.save(suministro);
	}

	@Override
	public Suministra suministroByID(int id) {
		return iSuministraDao.findById(id).orElse(null);
	}

	@Override
	public void deleteSuministro(int id) {
		iSuministraDao.deleteById(id);
	}
}
