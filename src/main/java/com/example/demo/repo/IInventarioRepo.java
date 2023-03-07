package com.example.demo.repo;

import com.example.demo.modelo.Inventario;

public interface IInventarioRepo {
	public void insertar(Inventario inventario);
public Inventario insertarInventarios(Integer numeroB,String codigoBarraMaes,Integer cantidad);

}
