package com.semillero.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semillero.entity.Cliente;
import com.semillero.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	ClienteRepository repositorioCliente;

	@Override
	public void registrar(String nombre) {
		
		
	}
	
	

}
