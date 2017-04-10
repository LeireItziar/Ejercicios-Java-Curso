package com.ipartek.formacion.ejercicioPersona.programa;

import com.ipartek.formacion.ejercicioPersona.tipo.Empleado;
import com.ipartek.formacion.ejercicioPersona.tipo.Puesto;

public class EmpleadoPrueba {

	public static void main(String[] args) {

		Empleado a = new Empleado();
		a.add(new Puesto("Administrativo", 950.00));
		a.add(new Puesto("Gerente", 250.80));
		a.add(new Puesto("Limpieza", 650.05));
		System.out.println(a);

	}

}
