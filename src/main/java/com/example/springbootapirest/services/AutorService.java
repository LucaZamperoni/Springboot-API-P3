package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Autor;

// Definir la interfaz 'AutorService' que extiende 'BaseService' y se especializa en la entidad 'Autor'.
public interface AutorService extends BaseService<Autor, Long> {
    /*
        Esta interfaz hereda automáticamente los métodos CRUD declarados en 'BaseService' para operaciones en la entidad 'Autor'.
        Los parámetros genéricos '<Autor, Long>' indican que esta interfaz está específicamente destinada a la entidad 'Autor' y
        utiliza un tipo 'Long' como identificador de entidad.
     */
}
