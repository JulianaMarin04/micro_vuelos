package com.semillero.services;

import java.util.List;

import com.semillero.entity.Cliente;
import com.semillero.entity.Vuelo;

public interface VueloServices {

	public List<Vuelo> listaVuelos();
	
	//public List<Cliente> findVueloPasajero(int idVuelo);
}
