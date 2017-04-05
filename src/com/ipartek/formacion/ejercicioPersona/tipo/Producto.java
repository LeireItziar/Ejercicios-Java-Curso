package com.ipartek.formacion.ejercicioPersona.tipo;

public class Producto {
	private int id;
	private String producto;
	private double precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto(int id, String producto, double precio) {
		setId(id);
		setProducto(producto);
		setPrecio(precio);
	}

	@Override
	public String toString() {
		//return "\n Id=" + id + " \t" + producto + " \t" +  precio;
		return String.format("ID: %5d %-50s %10.2f€ \n", id, producto, precio);
	}
}
