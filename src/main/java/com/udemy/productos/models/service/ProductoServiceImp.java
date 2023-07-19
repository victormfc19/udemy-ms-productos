package com.udemy.productos.models.service;
import com.udemy.productos.models.entity.Producto;
import com.udemy.productos.models.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;


@Service
public class ProductoServiceImp implements IProductoService{

    @Autowired
    private ProductoRepository producto_repository;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> findAll() {
        return (List<Producto>) producto_repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Producto findById(Long id) {
        return producto_repository.findById(id).orElse(null);
    }
}
