package com.UD25_spring.ex3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UD25_spring.ex3.dao.IAlmacenDao;
import com.UD25_spring.ex3.dto.Almacenes;

@Service
public class AlmacenesServiceImpl implements IAlmacenesService {

	@Autowired
	IAlmacenDao iAlmacenDao;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		// TODO Auto-generated method stub
		return iAlmacenDao.findAll();
	}

	@Override
	public Almacenes guardarAlmacenes(Almacenes almacenes) {
		// TODO Auto-generated method stub
		return iAlmacenDao.save(almacenes);
	}

	@Override
	public Almacenes almacenesXID(Long id) {
		// TODO Auto-generated method stub
		return iAlmacenDao.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacenes(Almacenes almacenes) {
		// TODO Auto-generated method stub
		return iAlmacenDao.save(almacenes);
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		iAlmacenDao.deleteById(id);
	}

	
	
	
	
	
}
