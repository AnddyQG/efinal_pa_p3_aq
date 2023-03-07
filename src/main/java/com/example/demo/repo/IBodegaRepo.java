package com.example.demo.repo;

import com.example.demo.modelo.Bodega;


public interface IBodegaRepo {

	public void crear(Bodega bodega);
	public Bodega buscar(Integer numeroBodega);
}
