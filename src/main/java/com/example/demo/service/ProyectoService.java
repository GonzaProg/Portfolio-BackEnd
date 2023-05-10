/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author Gonzaa
 */

import com.example.demo.dto.IProyectoService;
import com.example.demo.model.Proyecto;
import com.example.demo.reposity.ProyectoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = proyectoRepository.findById(id).orElse(null);
        return proyecto;
    }
            
}