package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class ProductoRepoImpl implements IProductoRepo{
@PersistenceContext
private EntityManager manager;
	@Override
	public void crear(Producto producto) {
		// TODO Auto-generated method stub
		this.manager.persist(producto);
	}

	@Override
	public Producto buscar(String codigoBarrasP) {
		// TODO Auto-generated method stub
		return this.manager.find(Producto.class, codigoBarrasP);
	}

}
