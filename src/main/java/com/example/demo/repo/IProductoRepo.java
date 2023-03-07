package com.example.demo.repo;

import com.example.demo.modelo.Producto;

public interface IProductoRepo {

	
public void crear(Producto producto);
public Producto buscar(String codigoBarrasP);
	
	
}
