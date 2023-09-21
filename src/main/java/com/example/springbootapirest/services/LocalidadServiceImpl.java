package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Localidad;
import com.example.springbootapirest.repositories.BaseRepository;
import com.example.springbootapirest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Definir la clase 'LocalidadServiceImpl' que implementa 'LocalidadService' y extiende 'BaseServiceImpl'.
@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    // La clase 'LocalidadServiceImpl' implementa 'LocalidadService' y extiende 'BaseServiceImpl', lo que significa que
    // hereda los métodos CRUD de 'BaseService' para operaciones en la entidad 'Localidad'.

    @Autowired // Inyección de dependencia de 'LocalidadRepository' para acceder a la capa de persistencia.
    private LocalidadRepository localidadRepository;

    // Constructor que recibe un 'BaseRepository' como parámetro y lo pasa al constructor de la clase base 'BaseServiceImpl'.
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
