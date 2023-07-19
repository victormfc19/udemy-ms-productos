package com.udemy.productos.models.repository;

import com.udemy.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {


}
