package com.semillero.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.semillero.entity.Cliente;
import com.semillero.repository.ClienteRepository;
import com.semillero.services.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository repositorioCliente;
	
	@Autowired
	private ClienteService clienteService;
	
	
//	@GetMapping("/home")
//	public String greeting(@RequestParam(name="name", required=false, defaultValue="Word") String name, Model model) {
//		model.addAttribute("name",name);
//		
//		Cliente cliente = new Cliente();
//		cliente.setIdCliente(13);
//		cliente.setCedula(123456789);
//		cliente.setNombre("Alfonso herrera");
//		cliente.setTelefono(310222);
//		repositorioCliente.save(cliente);
//		
//		return "registroClientes";
//	}
	
	@PostMapping("/Registro")
	public String createCliente(@Valid @ModelAttribute("clienteForm") Cliente cliente, ModelMap model) {
		model.addAttribute("clienteForm", cliente);
		return "registroClientes";
	}

	@GetMapping("/Clientes")
	public String greeting( Model model) {
		model.addAttribute("clientes",repositorioCliente.findAll());
		return "listaClientes";
	}
	
	
}
