package com.semillero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.services.VueloServiceImpl;
import com.semillero.entity.Cliente;
import com.semillero.entity.Vuelo;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/HomeVuelos")
public class VueloController {
	
	@Autowired
	VueloServiceImpl vueloServiceImpl;
	
	@GetMapping("/Vuelos")
	public List<Vuelo> listaVuelos(){
		return vueloServiceImpl.listaVuelos();
	}
	
}
