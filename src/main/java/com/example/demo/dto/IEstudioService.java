/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.dto;

import com.example.demo.model.Estudio;

/**
 *
 * @author Gonzaa
 */

public interface IEstudioService {
    
    public void saveEstudio(Estudio estudio);
    
    public void deleteEstudio(Long id);
    
    public Estudio findEstudio(Long id);
    
}
