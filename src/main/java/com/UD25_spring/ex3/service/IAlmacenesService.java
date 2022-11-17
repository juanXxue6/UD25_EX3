package com.UD25_spring.ex3.service;

import java.util.List;

import com.UD25_spring.ex3.dto.Almacenes;


public interface IAlmacenesService {

	public List<Almacenes> listarAlmacenes(); 
	
	public Almacenes guardarAlmacenes(Almacenes almacenes);	
	
	public Almacenes almacenesXID(Long id); 
	
	public Almacenes actualizarAlmacenes(Almacenes almacenes); 
	
	public void  eliminar(Long id);	
}
