package com.semillero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entity.Cliente;
import com.semillero.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository repositorioCliente;

	@Override
	public Cliente buscarId(int idCliente) {
		return repositorioCliente.findById(idCliente).get();
	}

	@Override
	public List<Cliente> listaClientes() {
		return repositorioCliente.findAll();
		
	}

	@Override
	public Cliente registroCliente(Cliente cliente) {
		return repositorioCliente.save(cliente);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return repositorioCliente.save(cliente);
	}

	@Override
	public void eliminarCliente(int idCliente) {
		repositorioCliente.deleteById(idCliente);

	}

}
