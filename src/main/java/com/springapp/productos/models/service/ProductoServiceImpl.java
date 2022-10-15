package com.springapp.productos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springapp.productos.models.entity.Producto;
import com.springapp.productos.models.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private ProductoRepository prodDao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> buscaTodos() {
		
		return (List<Producto>) prodDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto buscaPorId(Long id) {

		return prodDao.findById(id).orElse(null);
	}

	

}
