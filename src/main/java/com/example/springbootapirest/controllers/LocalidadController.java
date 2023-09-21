package com.example.springbootapirest.controllers;

import com.example.springbootapirest.entities.Localidad;
import com.example.springbootapirest.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Anotar la clase como un controlador REST.
@RestController
// Permitir solicitudes CORS desde cualquier origen (*).
@CrossOrigin(origins = "*")
// Especificar la ruta base para las solicitudes HTTP gestionadas por este controlador.
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
