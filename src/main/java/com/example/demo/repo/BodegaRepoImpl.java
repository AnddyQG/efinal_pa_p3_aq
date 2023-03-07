package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class BodegaRepoImpl implements IBodegaRepo{
@PersistenceContext
private EntityManager manager;

@Override
public void crear(Bodega bodega) {
	// TODO Auto-generated method stub
	this.manager.persist(bodega);
}

@Override
public Bodega buscar(Integer numeroBodega) {
	// TODO Auto-generated method stub
	return this.manager.find(Bodega.class, numeroBodega);
}


}
