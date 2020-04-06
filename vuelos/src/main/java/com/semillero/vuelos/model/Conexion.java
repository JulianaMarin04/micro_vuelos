package com.semillero.vuelos.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Conexion {
    @Autowired
    @Qualifier("beanCliente")
    private Cliente cliente();

    private String db,url;

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
