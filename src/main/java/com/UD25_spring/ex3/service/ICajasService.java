package com.UD25_spring.ex3.service;

import java.util.List;

import com.UD25_spring.ex3.dto.Almacenes;
import com.UD25_spring.ex3.dto.Cajas;

public interface ICajasService {
	public List<Cajas> listarCajas(); 
	
	public Cajas guardarCajas(Cajas cajas);	
	
	public Cajas cajassXID(Long id); 
	
	public Cajas actualizarCajas(Cajas cajas); 
	
	public void eliminar(Long id);	
}
