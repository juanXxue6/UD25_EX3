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

import com.UD25_spring.ex3.dto.Cajas;
import com.UD25_spring.ex3.service.CajasServiceImpl;


@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajasServiceImpl cajasServideImpl;
	
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajasServideImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCajas(@RequestBody Cajas cajas) {
		
		return cajasServideImpl.guardarCajas(cajas);
	}
	
	@GetMapping("/cajas/{id}")
	public Cajas cajasXID(@PathVariable(name="id") Long id) {
		
		Cajas cajas_xid= new Cajas();
		
		cajas_xid=cajasServideImpl.cajassXID(id);
		
		System.out.println("Cajas XID: "+cajas_xid);
		
		return cajas_xid;
	}
	
	@PutMapping("/cajas/{id}")
	public Cajas actualizarCajas(@PathVariable(name="id")Long id,@RequestBody Cajas cajas) {
		
		Cajas cajas_seleccionado= new Cajas();
		Cajas cajas_actualizado= new Cajas();
		
		cajas_seleccionado= cajasServideImpl.cajassXID(id);
		
		cajas_seleccionado.setAlmacen(cajas.getAlmacen());
		cajas_seleccionado.setContenido(cajas.getContenido());
		cajas_seleccionado.setValor(cajas.getValor());
		
		cajas_actualizado = cajasServideImpl.actualizarCajas(cajas_seleccionado);
		
		System.out.println("La caja actualizado es: "+ cajas_actualizado);
		
		return cajas_actualizado;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eliminarCajas(@PathVariable(name="id")Long id) {
		cajasServideImpl.eliminar(id);
	}
	
	
}
