package com.UD25_spring.ex3.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="cajas")
public class Cajas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "contenido")//no hace falta si se llama igual
	private String contenido;
	
	@Column(name = "valor")//no hace falta si se llama igual
	private String valor;
	
	@ManyToOne
    @JoinColumn(name="almacen_id")
    private Almacenes almacen;

	public Cajas(Long id, String contenido, String valor, Almacenes almacen) {
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}
	
	public Cajas() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public Almacenes getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacenes almacen) {
		this.almacen = almacen;
	}
	

	
	
}
