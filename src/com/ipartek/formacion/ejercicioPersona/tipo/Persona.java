package com.ipartek.formacion.ejercicioPersona.tipo;

public class Persona {
	private int id;
	private String nombre;

	public Persona(int id, String nombre) {
		setid(id);
		setnombre(nombre);
	}

	private void setId(int id2) {
		this.id = (int) id;

	}

	private void seNnombre(String nombre2) {
		this.nombre = (String) nombre;

	}

	public void Persona(int id, String nombre) {
		this.id = (int) id;
		this.nombre = (String) nombre;
	}

	public Persona() {
		this(0, 0);
	}

	public Persona(int id2, int i) {

	}

	public int getId() {
		return (int) id;
	}

	public String getNombre() {
		return (String) nombre;
	}

}
