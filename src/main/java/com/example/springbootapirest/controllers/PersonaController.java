package com.example.springbootapirest.controllers;

import com.example.springbootapirest.entities.Persona;
import com.example.springbootapirest.services.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Anotar la clase como un controlador REST.
@RestController
// Permitir solicitudes CORS desde cualquier origen (*).
@CrossOrigin(origins = "*")
// Especificar la ruta base para las solicitudes HTTP gestionadas por este controlador.
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl> {

    // Definir un endpoint para buscar personas por un filtro.
    /*
        @GetMapping("/search")
        public ResponseEntity<?> search(@RequestParam String filtro) {
            try {
                return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"Error\": \"" + e.getMessage() + "\"}"));
            }
        }
    */


    // Definir un endpoint para buscar personas por un filtro con paginación.
    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"Error\": \"" + e.getMessage() + "\"}"));
        }
    }
}
