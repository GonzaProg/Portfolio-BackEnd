 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author Gonzaa
 */

import com.example.demo.dto.IPersonaService;
import com.example.demo.model.Persona;
import com.example.demo.reposity.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public void savePersona(Persona persona) {
        persoRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = persoRepository.findById(id).orElse(null);
        return persona;
    }
            
}
