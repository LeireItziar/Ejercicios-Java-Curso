package com.ipartek.formacion;

public class perro {

	//atributos
	private String nombre;
	private String raza;
	private String dueno;
	private boolean pulgas;

	//constructores
	public perro() {
		super();
		System.out.println("No se puede dar de alta un perro sin nombre");
	}

	public perro(String nombre, String raza, String dueno, boolean pulgas) {
		super();
		this.nombre = nombre;
		this.raza = "Milrazas";
		this.dueno = "Sin dueño";
		this.pulgas = false;
	}

	//getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {
		return "perro [nombre=" + nombre + ", raza=" + raza + ", dueno=" + dueno + ", pulgas=" + pulgas + "]";
	}

}
