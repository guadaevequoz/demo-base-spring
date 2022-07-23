package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repositorio.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    PersonaRepository repo;

    @Override
    public List<Persona> verPersonas() {
        return repo.findAll();
    }

    @Override
    public void crearPersona(Persona p) {
        repo.save(p);
    }

    @Override
    public void borrarPersona(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Persona encontrarpPersona(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona p) {
        repo.save(p);
    }
    
}
