package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Bodega;
import com.example.demo.modelo.Producto;
import com.example.demo.service.IBodegaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EfinalPaP3AqApplication implements CommandLineRunner{
@Autowired
private IBodegaService bodegaService;
@Autowired
private IProductoService iProductoService;
	public static void main(String[] args) {
		SpringApplication.run(EfinalPaP3AqApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto producto= new Producto();
		producto.setNombre("papel");
		producto.setCategoria("higiene");
		producto.setCodigoBarrasMaestro("123abc");
		producto.setStock(1);
		//this.iProductoService.insertar(producto);
		
		Bodega bodega= new Bodega();
		bodega.setNombre("Bodega 1");
		bodega.setDireccion("Quito Calderon");
		bodega.setNumero(1);
		bodega.setTelefono("153684787");
		//this.bodegaService.insertar(bodega);
	
	}

}
