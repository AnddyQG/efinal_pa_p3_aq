package com.example.demo.service;

import com.example.demo.modelo.Inventario;

public interface IInventarioService {

	
	public void insertar(Inventario inventario);
	public Inventario insertarInventarios(Integer numeroB,String codigoBarraMaes,Integer cantidad);
	
}
