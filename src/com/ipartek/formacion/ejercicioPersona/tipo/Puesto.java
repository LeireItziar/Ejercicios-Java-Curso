package com.ipartek.formacion.ejercicioPersona.tipo;

public class Puesto {

	private String nombrepuesto;
	private double sueldo;

	public Puesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Puesto(String nombrepuesto, double sueldo) {
		super();
		this.nombrepuesto = nombrepuesto;
		this.sueldo = sueldo;
	}

	public String getNombrepuesto() {
		return nombrepuesto;
	}

	public void setNombrepuesto(String nombrepuesto) {
		this.nombrepuesto = nombrepuesto;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
