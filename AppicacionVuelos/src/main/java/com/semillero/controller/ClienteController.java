package com.semillero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semillero.entity.Cliente;
import com.semillero.services.ClienteServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Home")
public class ClienteController {
	
	@Autowired
	private ClienteServiceImpl clienteServiceImpl;
	
	@GetMapping("/Pasajeros")
	public List<Cliente> listaClientes(){
		return clienteServiceImpl.listaClientes();
	}

	@PostMapping("/Pasajeros")
	public Cliente registroCliente(@RequestBody Cliente cliente) {
		return clienteServiceImpl.registroCliente(cliente);
	}
	
	@GetMapping("/Pasajeros/{idCliente}")
	public Cliente busvarId(@PathVariable(name = "idCliente") int idCliente){
		Cliente cliente = new Cliente();
		cliente = clienteServiceImpl.buscarId(idCliente);
		System.out.println("El cliente es:"+ cliente);
		return cliente;
	}
	
	@PutMapping("/Pasajeros/{idCliente}")
	public Cliente actualizarCliente(@PathVariable(name = "idCliente") int idCliente, @RequestBody Cliente cliente){
		Cliente clienteSeleccionado = new Cliente();
		Cliente clienteActualizado = new Cliente();
		
		clienteSeleccionado = clienteServiceImpl.buscarId(idCliente);
		
		clienteSeleccionado.setNombre(cliente.getNombre());
		clienteSeleccionado.setCedula(cliente.getCedula());
		clienteSeleccionado.setTelefono(cliente.getTelefono());
		clienteActualizado = clienteServiceImpl.actualizarCliente(clienteSeleccionado);
		
		System.out.println("Actualizacion de cliente:" + clienteActualizado);
		return clienteActualizado;
	}
	
	@DeleteMapping("/Pasajeros/{idCliente}")
	public void eliminarCliente(@PathVariable(name = "idCliente") int idCliente){
		clienteServiceImpl.eliminarCliente(idCliente);
	}
	
	@GetMapping("/Pasajeros/Vuelos/{idVuelo}")
	public List<Cliente> buscarClienteVuelo(@PathVariable(name = "idVuelo") int idVuelo){
		return clienteServiceImpl.buscarClienteVuelo(idVuelo);
	}
}
