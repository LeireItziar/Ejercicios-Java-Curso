package com.ipartek.formacion.ejercicioPersona.programa;

import com.ipartek.formacion.ejercicioPersona.tipo.Carrito;
import com.ipartek.formacion.ejercicioPersona.tipo.Producto;

public class CarritoPrueba {

	public static void main(String[] args) {
		Carrito c = new Carrito();

		c.add(new Producto(1, "Monitor 21\"", 125.03));
		c.add(new Producto(2, "Placa base ...", 100.2));
		c.add(new Producto(3, "Ratón", 10.3));

		System.out.println(c);

		/*
		 * ID: 1, Monitor 21", 125.03€ ...
		 */

		System.out.println("Total Productos: " + c.getNumeroDeArticulos() + "\n");
		System.out.println(String.format("Precio Total: \t %5.2f€", c.getPrecioTotal()));
		System.out.println(String.format("IVA: \t %14.2f€", c.getIvaSobrePrecioTotal())); // Asumimos IVA 21%
		System.out.println(String.format("Total con IVA: \t %4.2f€", c.getPrecioTotalConIva()));
	}
}
