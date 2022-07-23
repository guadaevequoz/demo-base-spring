package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@RestController
public class Controller {

    @Autowired 
    private IPersonaService service;

    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers){
        service.crearPersona(pers);
    }

    @GetMapping ("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return service.verPersonas();
    }

    @DeleteMapping ("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        service.borrarPersona(id);
    }

    @PutMapping ("/modify")
    public void modificarPersona(@RequestBody Persona pers){
        service.modificarPersona(pers);
    }
}
