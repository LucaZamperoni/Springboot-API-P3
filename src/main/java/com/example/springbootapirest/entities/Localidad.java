package com.example.springbootapirest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "localidad")
@Data
@NoArgsConstructor
@AllArgsConstructor
// Anotar la clase para habilitar la auditoría de cambios utilizando Hibernate Envers.
@Audited
public class Localidad extends Base {
    @Column(name = "denominacion")
    private String denominacion;
}