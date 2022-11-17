package com.UD25_spring.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25_spring.ex3.dao.ICajasDAO;
import com.UD25_spring.ex3.dto.Cajas;

@Service
public class CajasServiceImpl implements ICajasService {

	@Autowired
	ICajasDAO iCajasDao;

	@Override
	public List<Cajas> listarCajas() {
		// TODO Auto-generated method stub
		return iCajasDao.findAll();
	}

	@Override
	public Cajas guardarCajas(Cajas cajas) {
		// TODO Auto-generated method stub
		return iCajasDao.save(cajas);
	}

	@Override
	public Cajas cajassXID(Long id) {
		// TODO Auto-generated method stub
		return iCajasDao.findById(id).get();
	}

	@Override
	public Cajas actualizarCajas(Cajas cajas) {
		// TODO Auto-generated method stub
		return iCajasDao.save(cajas);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		iCajasDao.deleteById(id);
	}
	
	
}
