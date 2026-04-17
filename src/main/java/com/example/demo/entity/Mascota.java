package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name ="mascota")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "especie", nullable = false)
    private String especie;

    @Column(name = "raza", nullable = false)
    private String raza;

    @Column(name = "edad", nullable = false)
    private String edad;

    @Column(name = "nombre_dueno", nullable = false)
    private String nombreDueño;

    @Column(name = "estado", nullable = false)
    private int estado;
}
