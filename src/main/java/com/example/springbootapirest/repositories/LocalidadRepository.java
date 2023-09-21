package com.example.springbootapirest.repositories;

import com.example.springbootapirest.entities.Localidad;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad, Long> {
    /*
        Esta interfaz extiende 'BaseRepository', que a su vez extiende 'JpaRepository', lo que significa que
        'LocalidadRepository' hereda automáticamente los métodos CRUD y otras funcionalidades proporcionadas por Spring Data JPA.

        Los parámetros genéricos '<Localidad, Long>' indican que esta interfaz está específicamente destinada a la entidad 'Localidad'
         y utiliza un tipo 'Long' como identificador de entidad.
     */
}
