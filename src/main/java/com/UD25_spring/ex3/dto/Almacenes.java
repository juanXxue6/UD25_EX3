package com.UD25_spring.ex3.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="almacenes")
public class Almacenes {

	
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	
	@Column(name = "lugar")//no hace falta si se llama igual
	private String lugar;
	
	@Column(name = "capacidad")//no hace falta si se llama igual	
	private int capacidad;
	
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Cajas> cajas;
	
	//Constructores
	
	public Almacenes() {
	
	}

	public Almacenes(Long id, String lugar, int capacidad, List<Cajas> cajas) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.cajas = cajas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cajas")
	public List<Cajas> getCajas() {
		return cajas;
	}

	public void setCajas(List<Cajas> cajas) {
		this.cajas = cajas;
	}
	
	
	
	
	
	
}
