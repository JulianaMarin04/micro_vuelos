package com.semillero;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.semillero.services.ClienteService;



@SpringBootApplication
public class VuelosApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(VuelosApplication.class);
	
	@Autowired
	private  ClienteService clienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(VuelosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("Hola mundo");
		//LOG.info("Hola mundo");
		
		
		
	}

}
