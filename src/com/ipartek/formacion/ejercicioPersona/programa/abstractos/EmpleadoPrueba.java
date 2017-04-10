package com.ipartek.formacion.ejercicioPersona.programa.abstractos;

import java.util.ArrayList;

import com.ipartek.formacion.ejercicioPersona.tipo.abstractos.Empleado;
import com.ipartek.formacion.ejercicioPersona.tipo.abstractos.EmpleadoIndefinido;
import com.ipartek.formacion.ejercicioPersona.tipo.abstractos.EmpleadoPorHoras;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();

		empleados.add(new EmpleadoPorHoras("Javier", 60, 20.0));
		empleados.add(new EmpleadoIndefinido("Ander", 14, 30000.0));

		for (Empleado empleado : empleados)
			System.out.println(empleado.getSueldoMensual());
	}

}
