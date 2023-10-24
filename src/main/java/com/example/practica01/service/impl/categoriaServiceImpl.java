/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.practica01.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jafet
 */

/**
 *
 * @author jafet
 */
@Service
public class categoriaServiceImpl implements categoriaService{
    
    @Autowired
    private categoriaDao CategoriaDao;
    
    @Override
    public List<categoria>getCategoria (boolean activo){
        var lista = categoriaDao.findAll();
        
        if (activo){
            lista.removeIf(e-> !e.isActivo());
        }
    return lista;
   } 
}

