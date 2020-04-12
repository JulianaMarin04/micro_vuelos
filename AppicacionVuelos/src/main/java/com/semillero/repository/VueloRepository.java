package com.semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Vuelo;
import com.semillero.entity.Cliente;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
	
//	@Query ("select cliente.nombre as Pasajero, cliente.cedula as Cedula, vuelo.numero_vuelo, vuelo.modelo_avion as Avion from tikete inner join cliente on tikete.fk_cliente = cliente.id_clienteinner join vuelo on tikete.fk_vuelo = vuelo.id_vuelo")
//	public List<Cliente> findVueloPasajero(int idVuelo);

}
