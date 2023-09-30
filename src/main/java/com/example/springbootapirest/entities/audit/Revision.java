package com.example.springbootapirest.entities.audit;

import com.example.springbootapirest.config.CustomRevisionListener;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "REVISION_INFO")

// Marcar esta entidad como la entidad de revisión y especificar la clase personalizada de RevisionListener.
@RevisionEntity(CustomRevisionListener.class)
@Data
// Definir la clase 'Revision' como serializable para fines de persistencia.
public class Revision implements Serializable
{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Marcar el campo 'id' como el número de revisión utilizando Envers.
    @RevisionNumber
    private int id;

    @Column(name = "REVISION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    // Marcar el campo 'date' como la marca de tiempo de revisión utilizando Envers.
    @RevisionTimestamp
    private Date date;
}
