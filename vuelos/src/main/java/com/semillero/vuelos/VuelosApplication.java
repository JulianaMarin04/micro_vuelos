package com.semillero.vuelos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class VuelosApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public VuelosApplication(){

	}

	public static void main(String[] args) {

		SpringApplication.run(VuelosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//jdbcTemplate.execute("inser into cliente (nombre,cedula,telefono) values ('hola mundo',4584569,44774)");

	}
}
