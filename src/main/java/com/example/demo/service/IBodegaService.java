package com.example.demo.service;

import com.example.demo.modelo.Bodega;

public interface IBodegaService {

	
	public void insertar(Bodega bodega);
	public Bodega encontrar(Integer numeroBodega);
}
