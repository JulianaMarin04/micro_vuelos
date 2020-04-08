package com.semillero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Integer> {

}
