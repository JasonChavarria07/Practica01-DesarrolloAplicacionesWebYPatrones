/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica01.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author jafet
 */
@Data
@Entity
@Table(name= "categoria")
public class categoria {
     private static final long serialVersionUID =1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id_cita")
    private long id_cita;
    private String nombre;
    private String imagen;
    private boolean activo;

    public categoria() {
        
    }

    public categoria(String nombre, boolean activo) {
        this.nombre = nombre;
        this.activo = activo;
    }
    
    
}
    

