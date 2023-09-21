package com.example.springbootapirest.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

// Anotar la clase como una superclase mapeada (MappedSuperclass).
// Esta anotación indica que esta clase es una superclase mapeada y no se mapeará directamente a una tabla en la base de datos.
// En cambio, sus campos y anotaciones se heredarán por las clases que extiendan esta superclase.
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
