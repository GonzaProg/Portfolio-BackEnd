/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dto.IProyectoService;
import com.example.demo.model.Proyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    @PostMapping("proyectos/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "El Proyecto fue creado correctamente";
    }
            
    @DeleteMapping("/proyectos/borrar/{id}")
    public String deleteProyecto(@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
        return "El Proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                               @RequestParam("titulo") String nuevoTitulo,
                               @RequestParam("descripcion") String nuevaDescripcion,
                               @RequestParam("urlProyecto") String nuevoUrlProyecto){
        Proyecto proyecto = iproyectoService.findProyecto(id);
        
        proyecto.setTitulo(nuevoTitulo);
        proyecto.setDescripcion(nuevaDescripcion);
        proyecto.setUrlProyecto(nuevoUrlProyecto);
        
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
}
