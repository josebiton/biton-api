package com.biton.bitonapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="autor")
@Data
public class Autor implements Serializable {

    @Id
    @Column(name = "idautor")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "estado",columnDefinition = "BIT")
    private Boolean estado;

    private String nombres;
}
