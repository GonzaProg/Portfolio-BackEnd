/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dto.IEstudioService;
import com.example.demo.model.Estudio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gonzaa
 */

@RestController
public class EstudioController {
    @Autowired IEstudioService iestudioService;
    
    @GetMapping("/estudios/traer/{id}")
    public Estudio findEstudio(@PathVariable Long id){
        return iestudioService.findEstudio(id);
    }
    
    @PostMapping("/estudios/crear")
    public String createEstudio(@RequestBody Estudio estudio){
        iestudioService.saveEstudio(estudio);
        return "El estudio fue creado correctamente";
    }
            
    @DeleteMapping("/estudios/borrar/{id}")
    public String deleteEstudio(@PathVariable Long id){
        iestudioService.deleteEstudio(id);
        return "El estudio fue eliminado correctamente";
    }
    
    @PutMapping("/estudios/editar/{id}")
    public Estudio editEstudio(@PathVariable Long id,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("institucion") String nuevaInstitucion,
                               @RequestParam("inicio") String nuevoInicio,
                               @RequestParam("fin") String nuevoFin,
                               @RequestParam("descripcion") String nuevaDescripcion,
                               @RequestParam("urlTitulo") String nuevaUrlTitulo){
        Estudio estudio = iestudioService.findEstudio(id);
        
        estudio.setTitulo(nuevoTitulo);
        estudio.setInstitucion(nuevaInstitucion);
        estudio.setInicio(nuevoInicio);
        estudio.setFin(nuevoFin);
        estudio.setDescripcion(nuevaDescripcion);
        estudio.setUrlTitulo(nuevaUrlTitulo);
        
        iestudioService.saveEstudio(estudio);
        return estudio;
    }
    
}
