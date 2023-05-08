/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.model;

/**
 *
 * @author Gonzaa
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
    private String presentacion;
    private String email;

    public void setId(Long id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    public Long getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getImagen(){
        return imagen;
    }

    public String getPresentacion(){
        return presentacion;
    }

    public String getEmail(){
        return email;
    }

}