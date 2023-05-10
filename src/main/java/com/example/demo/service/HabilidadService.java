/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author Gonzaa
 */

import com.example.demo.dto.IHabilidadService;
import com.example.demo.model.Habilidad;
import com.example.demo.reposity.HabilidadRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class HabilidadService implements IHabilidadService{
    @Autowired
    private HabilidadRepository habilidadRepository;

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        habilidadRepository.save(habilidad);
    }

    @Override
    public void deleteHabilidad(Long id) {
        habilidadRepository.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad habilidad = habilidadRepository.findById(id).orElse(null);
        return habilidad;
    }
            
}