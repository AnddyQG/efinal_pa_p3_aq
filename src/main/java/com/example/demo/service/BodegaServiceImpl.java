package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodega;
import com.example.demo.repo.IBodegaRepo;
@Service
public class BodegaServiceImpl implements IBodegaService{
@Autowired
private IBodegaRepo repo;
	@Override
	public void insertar(Bodega bodega) {
		// TODO Auto-generated method stub
		this.repo.crear(bodega);
	}

	@Override
	public Bodega encontrar(Integer numeroBodega) {
		// TODO Auto-generated method stub
		return this.repo.buscar(numeroBodega);
	}

}
