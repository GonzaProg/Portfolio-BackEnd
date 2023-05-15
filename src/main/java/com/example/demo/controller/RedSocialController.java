/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.dto.IRedSocialService;
import com.example.demo.model.RedSocial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
public class RedSocialController {
    @Autowired IRedSocialService iredSocialService;
    
    @GetMapping("/redesSociales/traer/{id}")
    public RedSocial findRedSocial(@PathVariable Long id){
        return iredSocialService.findRedSocial(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/redesSociales/crear")
    public String createRedSocial(@RequestBody RedSocial redSocial){
        iredSocialService.saveRedSocial(redSocial);
        return "La Red Social fue creada correctamente";
    }
            
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/redesSociales/borrar/{id}")
    public String deleteRedSocial(@PathVariable Long id){
        iredSocialService.deleteRedSocial(id);
        return "La Red Social fue eliminada correctamente";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/redesSociales/editar/{id}")
    public RedSocial editRedSocial(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("urlImagen") String nuevaUrlImagen,
                               @RequestParam("urlSitioWeb") String nuevaUrlSitioWeb){
        RedSocial redSocial = iredSocialService.findRedSocial(id);
        
        redSocial.setNombre(nuevoNombre);
        redSocial.setUrlImagen(nuevaUrlImagen);
        redSocial.setUrlSitioWeb(nuevaUrlSitioWeb);
        
        iredSocialService.saveRedSocial(redSocial);
        return redSocial;
    }
    
}
