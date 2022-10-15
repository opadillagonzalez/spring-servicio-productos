package com.springapp.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.springapp.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	
}
