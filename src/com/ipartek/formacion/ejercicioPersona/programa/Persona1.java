package com.ipartek.formacion.ejercicioPersona.programa;

import java.util.Date;

public class Persona1 {
	private int id;
	private String nombre;
	private Date FechaNacimiento;

	public Persona1(int id, String nombre) {
		setId1(id);
		setNombre(nombre);
	}

	void setId1(int id2) {
		this.id = (int) id;

	}

	void setNombre(String nombre2) {
		this.nombre = (String) nombre;

	}

	public void Persona(int id, String nombre) {
		this.id = (int) id;
		this.nombre = (String) nombre;
	}

	public Persona1() {
		this(0, 0);
	}

	public Persona1(int id2, int i) {

	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setId(int i) {

	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

}
