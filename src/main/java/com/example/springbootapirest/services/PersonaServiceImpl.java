package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Persona;
import com.example.springbootapirest.repositories.BaseRepository;
import com.example.springbootapirest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

// Definir la clase 'PersonaServiceImpl' que implementa 'PersonaService' y extiende 'BaseServiceImpl'.
@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired // Inyección de dependencia de 'PersonaRepository' para acceder a la capa de persistencia.
    private PersonaRepository personaRepository;

    // Constructor que recibe un 'BaseRepository' como parámetro y lo pasa al constructor de la clase base 'BaseServiceImpl'.
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

    // Implementación de métodos específicos de búsqueda definidos en 'PersonaService'.
    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            // Realizar una búsqueda de personas que contengan el filtro en el nombre o apellido.
            List<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            // List<Persona> personas = personaRepository.search(filtro);
            // List<Persona> personas = personaRepository.searchNativo(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> search(String filtro, Pageable pageable) throws Exception {
        try {
            // Realizar una búsqueda paginada de personas que contengan el filtro en el nombre o apellido.
            Page<Persona> personas = personaRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            // Page<Persona> personas = personaRepository.search(filtro, pageable);
            // Page<Persona> personas = personaRepository.searchNativo(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
