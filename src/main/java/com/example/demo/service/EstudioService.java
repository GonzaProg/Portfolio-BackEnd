/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author Gonzaa
 */

import com.example.demo.dto.IEstudioService;
import com.example.demo.model.Estudio;
import com.example.demo.reposity.EstudioRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class EstudioService implements IEstudioService{
    
    @Autowired
    private EstudioRepository estudioRepository;

    @Override
    public void saveEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }

    @Override
    public void deleteEstudio(Long id) {
        estudioRepository.deleteById(id);
    }

    @Override
    public Estudio findEstudio(Long id) {
        Estudio estudio = estudioRepository.findById(id).orElse(null);
        return estudio;
    }
            
}