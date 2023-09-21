package com.example.springbootapirest.repositories;

import com.example.springbootapirest.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long>{
    /*
        Esta interfaz extiende 'BaseRepository', que a su vez extiende 'JpaRepository', lo que significa que
        'AutorRepository' hereda automáticamente los métodos CRUD y otras funcionalidades proporcionadas por Spring Data JPA.

        Los parámetros genéricos '<Autor, Long>' indican que esta interfaz está específicamente destinada a la entidad 'Autor'
        y utiliza un tipo 'Long' como identificador de entidad.
     */
}
