package com.semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	
	@Query (value="select cliente.id_cliente, cliente.nombre, cliente.cedula, cliente.telefono from tikete inner join cliente on tikete.fk_cliente = cliente.id_cliente inner join vuelo on tikete.fk_vuelo=1 and vuelo.id_vuelo=1;", nativeQuery=true)
	public List<Cliente> buscarClienteVuelo1(int idVuelo);
	
	@Query (value="select cliente.id_cliente, cliente.nombre, cliente.cedula, cliente.telefono from tikete inner join cliente on tikete.fk_cliente = cliente.id_cliente inner join vuelo on tikete.fk_vuelo=2 and  vuelo.id_vuelo=2;", nativeQuery=true)
	public List<Cliente> buscarClienteVuelo2(int idVuelo);

	
}
