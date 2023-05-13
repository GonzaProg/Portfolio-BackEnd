/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dto.IHabilidadService;
import com.example.demo.model.Habilidad;
import java.util.List;
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
public class HabilidadController {
    @Autowired IHabilidadService ihabilidadService;
    
    @GetMapping("/habilidades/traerAll")
    public List<Habilidad> getHabilidades(){
        return ihabilidadService.getHabilidades();
    }
    
    @GetMapping("/habilidades/traer/{id}")
    public Habilidad findHabilidad(@PathVariable Long id){
        return ihabilidadService.findHabilidad(id);
    }
    
    @PostMapping("/habilidades/crear")
    public String createHabilidad(@RequestBody Habilidad habilidad){
        ihabilidadService.saveHabilidad(habilidad);
        return "La habilidad fue creada correctamente";
    }
            
    @DeleteMapping("/habilidades/borrar/{id}")
    public String deleteHabilidad(@PathVariable Long id){
        ihabilidadService.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }
    
    @PutMapping("/habilidades/editar/{id}")
    public Habilidad editHabilidad(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("urlImagen") String nuevaUrlImagen,
                               @RequestParam("descripcion") String nuevaDescripcion){
        Habilidad habilidad = ihabilidadService.findHabilidad(id);
        
        habilidad.setNombre(nuevoNombre);
        habilidad.setUrlImagen(nuevaUrlImagen);
        habilidad.setDescripcion(nuevaDescripcion);
        
        ihabilidadService.saveHabilidad(habilidad);
        return habilidad;
    }
    
}
