package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Producto;
import com.example.demo.repo.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{
@Autowired
private IProductoRepo repo;
	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.repo.crear(producto);
	}

	@Override
	public Producto encontrar(String codigoBarrasP) {
		// TODO Auto-generated method stub
		return this.repo.buscar(codigoBarrasP);
	}

}
