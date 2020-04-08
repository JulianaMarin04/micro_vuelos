package com.semillero.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class Vuelo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int idVuelo;
	
	@Column
	private String numeroVuelo;
	
	@Column
	private String modeloAvion;
	
	@Column
	private int capacidad;

	
	public Vuelo(String numeroVuelo, String modeloAvion, int capacidad) {
		this.modeloAvion = modeloAvion;
		this.numeroVuelo = numeroVuelo;
		this.capacidad = capacidad;
	}
	
	private void Vuelos() {
		

	}
	

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public String getModeloAvion() {
		return modeloAvion;
	}

	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", numeroVuelo=" + numeroVuelo + ", modeloAvion=" + modeloAvion
				+ ", capacidad=" + capacidad + "]";
	}
	
	
}
