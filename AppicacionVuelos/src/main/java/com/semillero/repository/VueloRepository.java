package com.semillero.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Vuelo;
import com.semillero.entity.Cliente;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {
	
	
}
