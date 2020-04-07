package com.semillero.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.semillero.entity.Vuelo;

@Repository
public interface VueloRepository extends CrudRepository<Vuelo, Integer> {

}
