package com.semillero.vuelos.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.sql.DataSource;

@Component
public class CreandoConexio {

    @Bean(name = "beanCliente")
    pubic Cliente getUsuario(){
        return new Cliente();
    }

    @Bean(name = "beanConexion")
    public Conexion getConexion(){
        Conexion conexion = new Conexion();
        conexion.setDB("mysql");
        conexion.setUrl("localhost");
        return conexion;
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/dbtaller?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        dataSource.setUsername("usuario");
        dataSource.setPassword("12345");

        return dataSource;
    }
}
