package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

// Definir la interfaz 'PersonaService' que extiende 'BaseService' y añade métodos específicos de búsqueda.
public interface PersonaService extends BaseService<Persona, Long> {
    /*
        Esta interfaz hereda automáticamente los métodos CRUD declarados en 'BaseService' para operaciones en la entidad 'Persona'.
        Los parámetros genéricos '<Persona, Long>' indican que esta interfaz está específicamente destinada a la entidad 'Persona'
        y utiliza un tipo 'Long' como identificador de entidad.
     */

    // Métodos específicos de búsqueda que no son heredados de 'BaseService'.
    List<Persona> search(String filtro) throws Exception;
    Page<Persona> search(String filtro, Pageable pageable) throws Exception;

    /*
        Diferencia con las interfaces anteriores:
        'PersonaService' agrega métodos específicos de búsqueda que no son parte de 'BaseService' para permitir la
        búsqueda de personas por un filtro y paginada por filtro. Esto hace que 'PersonaService' sea diferente de las
        interfaces anteriores porque introduce funcionalidades adicionales específicas de búsqueda para la entidad 'Persona'.
     */
}
