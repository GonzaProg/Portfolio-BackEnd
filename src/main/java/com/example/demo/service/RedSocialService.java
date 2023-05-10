/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

/**
 *
 * @author Gonzaa
 */

import com.example.demo.dto.IRedSocialService;
import com.example.demo.model.RedSocial;
import com.example.demo.reposity.RedSocialRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class RedSocialService implements IRedSocialService{
    @Autowired
    private RedSocialRepository redSocialRepository;

    @Override
    public void saveRedSocial(RedSocial redSocial) {
        redSocialRepository.save(redSocial);
    }

    @Override
    public void deleteRedSocial(Long id) {
        redSocialRepository.deleteById(id);
    }

    @Override
    public RedSocial findRedSocial(Long id) {
        RedSocial redSocial = redSocialRepository.findById(id).orElse(null);
        return redSocial;
    }
            
}