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

import antlr.collections.List;

@Entity
public class Cliente {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int idCliente;
	
	@Column
	private int cedula;
	
	@Column
	private String nombre;
	
	@Column
	private int telefono;
	
	public Cliente(int cedula, String nombre,  int telefono) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Cliente() {
		
	}
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
	        name = "tikete",
	        joinColumns = @JoinColumn(name = "FK_Cliente", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="FK_Vuelo", nullable = false)
	    )	
	private Set<Vuelo> vuelos;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", cedula=" + cedula + ", telefono="
				+ telefono + "]";
	}
	
	
	
	
}
