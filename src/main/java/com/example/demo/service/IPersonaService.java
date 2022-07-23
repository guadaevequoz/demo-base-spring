package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {
    public List<Persona> verPersonas();
    public void crearPersona(Persona p);
    public void borrarPersona(Long id);
    public Persona encontrarpPersona(Long id);
    public void modificarPersona(Persona p);
}
