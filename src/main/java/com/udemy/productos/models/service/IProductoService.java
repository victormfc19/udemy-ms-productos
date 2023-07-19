package com.udemy.productos.models.service;

import com.udemy.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    public List<Producto> findAll();
    public Producto findById(Long id);
}
