package com.semillero.services;

import java.util.List;

import com.semillero.entity.Cliente;

public interface ClienteService {
	
	public Cliente buscarId(int cedula);
	
	public List<Cliente> listaClientes();
	
	public Cliente registroCliente(Cliente cliente);
	
	public Cliente actualizarCliente(Cliente cliente);
	
	public void eliminarCliente(int cedula);
	
	public List<Cliente> buscarClienteVuelo(int idVuelo);
}
