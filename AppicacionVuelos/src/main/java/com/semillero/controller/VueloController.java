package com.semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.semillero.repository.VueloRepository;

@Controller
public class VueloController {
	
	@Autowired
	private VueloRepository repositorioVuelos;
	
	@GetMapping("/Vuelos")
	public String greeting( Model model) {
		model.addAttribute("vuelos",repositorioVuelos.findAll());
		return "listaVuelos";
	}
}
