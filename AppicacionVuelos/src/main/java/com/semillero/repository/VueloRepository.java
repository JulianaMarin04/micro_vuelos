package com.semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Vuelo;
import com.semillero.entity.Cliente;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
	
//	@Query (value="select cliente.id_cliente, cliente.nombre, cliente.cedula, cliente.telefono from tikete inner join cliente on tikete.fk_cliente = cliente.id_cliente inner join vuelo on tikete.fk_vuelo = vuelo.id_vuelo;", nativeQuery=true)
//	public List<Cliente> findVueloPasajero(int idVuelo);

}
