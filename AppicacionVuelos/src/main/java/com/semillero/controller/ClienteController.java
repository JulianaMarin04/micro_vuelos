package com.semillero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.semillero.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository repositorioCliente;
	
	
	@GetMapping("/home")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Word") String name, Model model) {
		model.addAttribute("name",name);
		return "index";
	}
}
