package com.ipartek.formacion.ejercicioPersona.programa.abstractos;

import com.ipartek.formacion.ejercicioPersona.tipo.abstractos.Contrato;
import com.ipartek.formacion.ejercicioPersona.tipo.abstractos.ContratoEspecial;

public class ContratoPrueba {

	public static void main(String[] args) {
		Contrato c;
		c = new ContratoEspecial();
		c.clausula1();
		System.out.println(c.clausula2("Prueba"));
	}

}
