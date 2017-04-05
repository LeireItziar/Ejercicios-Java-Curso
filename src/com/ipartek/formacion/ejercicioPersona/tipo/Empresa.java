package com.ipartek.formacion.ejercicioPersona.tipo;

import java.util.ArrayList;
import java.util.Arrays;

public class Empresa {
	// declarar variables nombre empresa y diirector
	private String nombre;
	private Persona director; // Cogemos Persona del package tipos, ya teniamos una definicion de persona
	private Persona[] junta = new Persona[5]; // creamos un array de Persona (puntero)
	// Add personas, no sabemos cuantos se añaden. Se hace con COLECCIONES
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	public Persona getDirector() {
		return director;
	}

	public void setDirector(Persona director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", director=" + director + ", junta=" + Arrays.toString(junta) + ", personas=" + personas + "]";
	}

	//CONSTRUCTOR
	public Empresa(String nombre, Persona director) {
		super();
		this.nombre = nombre;
		this.director = director;
	}

	//AL AÑADIR TO STRING CON TODOS LOS CAMPOS VARIA, METE TODOS LOS CAMPOS

}
