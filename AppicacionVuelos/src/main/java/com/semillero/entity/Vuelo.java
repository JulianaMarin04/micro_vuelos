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
import org.springframework.web.bind.annotation.GetMapping;


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
	
	@ManyToMany(mappedBy="vuelos")
	private Set<Cliente> clientes;

	
	public Vuelo(String numeroVuelo, String modeloAvion, int capacidad) {
		this.numeroVuelo = numeroVuelo;
		this.modeloAvion = modeloAvion;
		this.capacidad = capacidad;
	}
	
	public Vuelo() {
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

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", numeroVuelo=" + numeroVuelo + ", modeloAvion=" + modeloAvion
				+ ", capacidad=" + capacidad + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidad;
		result = prime * result + ((clientes == null) ? 0 : clientes.hashCode());
		result = prime * result + idVuelo;
		result = prime * result + ((modeloAvion == null) ? 0 : modeloAvion.hashCode());
		result = prime * result + ((numeroVuelo == null) ? 0 : numeroVuelo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		if (capacidad != other.capacidad)
			return false;
		if (clientes == null) {
			if (other.clientes != null)
				return false;
		} else if (!clientes.equals(other.clientes))
			return false;
		if (idVuelo != other.idVuelo)
			return false;
		if (modeloAvion == null) {
			if (other.modeloAvion != null)
				return false;
		} else if (!modeloAvion.equals(other.modeloAvion))
			return false;
		if (numeroVuelo == null) {
			if (other.numeroVuelo != null)
				return false;
		} else if (!numeroVuelo.equals(other.numeroVuelo))
			return false;
		return true;
	}
	
	
	
}
