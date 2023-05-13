/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.dto;

import com.example.demo.model.Habilidad;
import java.util.List;

/**
 *
 * @author Gonzaa
 */

public interface IHabilidadService {
    
    public List<Habilidad> getHabilidades();
    
    public void saveHabilidad(Habilidad habilidad);
    
    public void deleteHabilidad(Long id);
    
    public Habilidad findHabilidad(Long id);
    
}
