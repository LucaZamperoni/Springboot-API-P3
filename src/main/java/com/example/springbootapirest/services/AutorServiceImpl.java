package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Autor;
import com.example.springbootapirest.repositories.AutorRepository;
import com.example.springbootapirest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Definir la clase 'AutorServiceImpl' que implementa 'AutorService' y extiende 'BaseServiceImpl'.
@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {
    // La clase 'AutorServiceImpl' implementa 'AutorService' y extiende 'BaseServiceImpl', lo que significa que hereda
    // los métodos CRUD de 'BaseService' para operaciones en la entidad 'Autor'.

    @Autowired // Inyección de dependencia de 'AutorRepository' para acceder a la capa de persistencia.
    private AutorRepository autorRepository;

    // Constructor que recibe un 'BaseRepository' como parámetro y lo pasa al constructor de la clase base 'BaseServiceImpl'.
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
