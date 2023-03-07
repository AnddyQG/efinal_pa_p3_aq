package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	
@Id
@SequenceGenerator(name="seq_prod", sequenceName = "seq_prod", allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_prod")
@Column(name = "prod_id")
	 private Integer id;
@Column(name = "prod_nombre")
	 private String nombre;
@Column(name = "prod_codigoBarrasMaestro")
	 private String codigoBarrasMaestro;
@Column(name = "prod_categoria")
	 private String categoria;
@Column(name = "prod_stock")
	 private Integer stock;


@OneToMany(mappedBy = "producto")
private List<Inventario> inventario;
	 
	 //toString
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", codigoBarrasMaestro=" + codigoBarrasMaestro + ", categoria="
				+ categoria + "]";
	}
	
	
	//gettersysetters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoBarrasMaestro() {
		return codigoBarrasMaestro;
	}
	public void setCodigoBarrasMaestro(String codigoBarrasMaestro) {
		this.codigoBarrasMaestro = codigoBarrasMaestro;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Integer getStock() {
		return stock;
	}


	public void setStock(Integer stock) {
		this.stock = stock;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	 
	
	
	
	
	 
	 
	 
}
