package com.semillero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	
	

	
}
