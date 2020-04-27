package com.semillero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entity.Cliente;
import com.semillero.entity.Vuelo;
import com.semillero.repository.VueloRepository;

@Service
public class VueloServiceImpl implements VueloServices {
	
	@Autowired
	VueloRepository repositorioVuelo;


	public List<Vuelo> listaVuelos() {
		return repositorioVuelo.findAll();
	}


	@Override
	public Vuelo show(int idVuelo) {
		return repositorioVuelo.findById(idVuelo).get();
	}

}
