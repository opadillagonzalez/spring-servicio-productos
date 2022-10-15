package com.springapp.productos.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.productos.models.entity.Producto;
import com.springapp.productos.models.service.IProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private IProductoService productoServ;
	
	@GetMapping("/v1/listar")
	public List<Producto> listar(){
		return productoServ.buscaTodos();
	}
	
	@GetMapping("/v1/ver/{id}")
	public Producto verProducto( @PathParam(value = "id") Long id) {
		return productoServ.buscaPorId(id);
	}
	

}
