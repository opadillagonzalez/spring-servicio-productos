package com.springapp.productos.models.service;

import java.util.List;

import com.springapp.productos.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> buscaTodos();
	public Producto buscaPorId(Long id);

}
