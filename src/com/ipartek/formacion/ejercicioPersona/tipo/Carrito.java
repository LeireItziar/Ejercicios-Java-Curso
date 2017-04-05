package com.ipartek.formacion.ejercicioPersona.tipo;

import java.util.ArrayList;

public class Carrito {
	private ArrayList<Producto> carrito = new ArrayList<>();

	public void add(Producto producto) {
		carrito.add(producto);

	}

	@Override
	public String toString() {

		String carro = "";
		for (Producto producto : carrito) {
			carro = carro + producto.toString();
		}

		return ("Factura \n\n" + carro);

	}

	public int getNumeroDeArticulos() {
		return carrito.size();

	}

	public double getPrecioTotal() {
		double precioTotal = 0.0;

		for (Producto producto : carrito)
			precioTotal = precioTotal + producto.getPrecio();

		return precioTotal;

	}

	public double getIvaSobrePrecioTotal() {

		return (getPrecioTotal() * 0.21);

	}

	public double getPrecioTotalConIva() {

		return (getPrecioTotal() + getIvaSobrePrecioTotal());
	}

}
