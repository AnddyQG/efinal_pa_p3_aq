package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Inventario;
import com.example.demo.modelo.Producto;
import com.example.demo.repo.IInventarioRepo;

@Service
public class InventarioServiceImpl implements IInventarioRepo{
@Autowired
private IInventarioRepo iInventarioRepo;
	@Override
	public void insertar(Inventario inventario) {
		// TODO Auto-generated method stub
		this.iInventarioRepo.insertar(inventario);
	}

	@Override
	public Inventario insertarInventarios(Integer numeroB, String codigoBarraMaes, Integer cantidad) {
		// TODO Auto-generated method stub
		Inventario inventario= new Inventario();
		inventario.setCodigoBarrasInd(codigoBarraMaes+ "123");
		Bodega bodega= new Bodega();
		bodega.setNumero(numeroB);
		Producto producto= new Producto();
		producto.setCodigoBarrasMaestro(codigoBarraMaes);
		return this.iInventarioRepo.insertarInventarios(numeroB, codigoBarraMaes, cantidad);
	}

}
