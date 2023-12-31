package com.example.springbootapirest.services;

import com.example.springbootapirest.entities.Localidad;

// Definir la interfaz 'LocalidadService' que extiende 'BaseService' y se especializa en la entidad 'Localidad'.
public interface LocalidadService extends BaseService<Localidad, Long>{
    /*
        Esta interfaz hereda automáticamente los métodos CRUD declarados en 'BaseService' para operaciones en la entidad 'Localidad'.
        Los parámetros genéricos '<Localidad, Long>' indican que esta interfaz está específicamente destinada a la entidad
        'Localidad' y utiliza un tipo 'Long' como identificador de entidad.
    */
}
