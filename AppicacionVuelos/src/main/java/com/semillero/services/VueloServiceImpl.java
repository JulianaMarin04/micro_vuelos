package com.semillero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entity.Vuelo;
import com.semillero.repository.VueloRepository;

@Service
public class VueloServiceImpl implements VueloServices {
	
	@Autowired
	VueloRepository repositorioVuelo;


	@Override
	public Iterable<Vuelo> getAllVuelo() {
		
		return repositorioVuelo.findAll();
	}
	

	

}
