package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "inventario")
public class Inventario {
	
	@Id
	
	@SequenceGenerator(name="seq_inve", sequenceName = "seq_inve", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_inve")
	@Column(name = "inve_id")
	
	private Integer id;
	@Column(name = "inve_cantidad")
	private Integer cantidad;
	@Column(name = "inve_codigoBarrasInd")
	private String codigoBarrasInd;
	//relaciones
	
	@ManyToOne
	@JoinColumn(name = "inve_id_producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "inve_id_bodega")
	private Bodega bodega;
	
	
	
	//toString
	@Override
	public String toString() {
		return "Inventario [id=" + id + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
	//gettersYsetters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}




	public Producto getProducto() {
		return producto;
	}




	public void setProducto(Producto producto) {
		this.producto = producto;
	}




	public Bodega getBodega() {
		return bodega;
	}




	public void setBodega(Bodega bodega) {
		this.bodega = bodega;
	}




	public String getCodigoBarrasInd() {
		return codigoBarrasInd;
	}




	public void setCodigoBarrasInd(String codigoBarrasInd) {
		this.codigoBarrasInd = codigoBarrasInd;
	}

	
	
	
	
	
}
