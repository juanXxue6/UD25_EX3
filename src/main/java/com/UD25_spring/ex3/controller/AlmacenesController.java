package com.UD25_spring.ex3.controller;

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

import com.UD25_spring.ex3.dto.Almacenes;
import com.UD25_spring.ex3.dto.Cajas;
import com.UD25_spring.ex3.service.AlmacenesServiceImpl;
import com.UD25_spring.ex3.service.CajasServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {

	@Autowired
	AlmacenesServiceImpl almacenesServideImpl;
	
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarCajas(){
		return almacenesServideImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes salvarAlmacenes(@RequestBody Almacenes almacenes) {
		
		return almacenesServideImpl.guardarAlmacenes(almacenes);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes almacenesXID(@PathVariable(name="id") Long id) {
		
		Almacenes almacenes_xid= new Almacenes();
		
		almacenes_xid=almacenesServideImpl.almacenesXID(id);
		
		System.out.println("almacenes XID: "+almacenes_xid);
		
		return almacenes_xid;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarCajas(@PathVariable(name="id")Long id,@RequestBody Almacenes almacenes) {
		
		Almacenes almacenes_seleccionado= new Almacenes();
		Almacenes almacenes_actualizado= new Almacenes();
		
		almacenes_seleccionado= almacenesServideImpl.almacenesXID(id);
		
		almacenes_seleccionado.setCapacidad(almacenes.getCapacidad());
		almacenes_seleccionado.setLugar(almacenes.getLugar());

		
		almacenes_actualizado = almacenesServideImpl.actualizarAlmacenes(almacenes_seleccionado);
		
		System.out.println("El almacen actualizado es: "+ almacenes_actualizado);
		
		return almacenes_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eliminarCajas(@PathVariable(name="id")Long id) {
		almacenesServideImpl.eliminar(id);
	}
	
	
	
}
