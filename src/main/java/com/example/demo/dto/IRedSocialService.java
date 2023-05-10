/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.dto;

import com.example.demo.model.RedSocial;

/**
 *
 * @author Gonzaa
 */

public interface IRedSocialService {
    
    public void saveRedSocial(RedSocial redSocial);
    
    public void deleteRedSocial(Long id);
    
    public RedSocial findRedSocial(Long id);
    
}