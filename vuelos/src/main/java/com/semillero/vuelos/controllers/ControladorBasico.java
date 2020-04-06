package com.semillero.vuelos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/home")
public class ControladorBasico {

    @GetMapping(path={"/vuelos"})
    public String saludar(){
        return "index";
    }
}
