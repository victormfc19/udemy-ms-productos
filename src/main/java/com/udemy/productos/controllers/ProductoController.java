package com.udemy.productos.controllers;


import com.udemy.productos.models.entity.Producto;
import com.udemy.productos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService producto_service;

    @GetMapping("/listar")
    public List<Producto> listar(){
        return producto_service.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id){
        return producto_service.findById(id);
    }
}
