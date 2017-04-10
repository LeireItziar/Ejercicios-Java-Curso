package com.ipartek.formacion.ejercicioPersona.tipo;

import java.util.ArrayList;

public class Empleado {
	private String dni;
	private int numeross;
	private Puesto puesto;
	private double sueldobruto;
	private Empresa empresa;

	private ArrayList<Puesto> id = new ArrayList<>();

	public void add(Puesto denominacion) {
		id.add(denominacion);
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", numeross=" + numeross + ", puesto=" + puesto + ", sueldobruto=" + sueldobruto + ", empresa=" + empresa + ", id=" + id + "]";
	}

	// constructores
	public Empleado() {
		super();

	}

	public Empleado(String dni, int numeross, Puesto puesto, double sueldobruto, Empresa empresa) {
		super();
		this.dni = dni;
		this.numeross = numeross;
		this.puesto = puesto;
		this.sueldobruto = sueldobruto;
		this.empresa = empresa;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNumeross() {
		return numeross;
	}

	public void setNumeross(int numeross) {
		this.numeross = numeross;
	}

	public Puesto getPuesto() {
		return puesto;
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public double getSueldobruto() {
		return sueldobruto;
	}

	public void setSueldobruto(double sueldobruto) {
		this.sueldobruto = sueldobruto;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
