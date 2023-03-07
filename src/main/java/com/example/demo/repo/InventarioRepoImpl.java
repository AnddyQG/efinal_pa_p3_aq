package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class InventarioRepoImpl implements IInventarioRepo{
@PersistenceContext
private EntityManager manager;

	
	
		@Override
		public void insertar(Inventario inventario) {
			// TODO Auto-generated method stub
			this.manager.persist(inventario);
			
		}



		@Override
		public Inventario insertarInventarios(Integer numeroB, String codigoBarraMaes, Integer cantidad) {
			// TODO Auto-generated method stub
		
			return null;
		}

}
