package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
    
}
