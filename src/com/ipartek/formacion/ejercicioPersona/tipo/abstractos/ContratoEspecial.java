package com.ipartek.formacion.ejercicioPersona.tipo.abstractos;

public class ContratoEspecial implements Contrato {

	@Override
	public void clausula1() {
		System.out.println("Clausula 1 de contrato especial");

	}

	@Override
	public int clausula2(String s) {
		System.out.println("Clausula 2 " + s);
		return s.length();
	}

}
