package com.ipartek.formacion;

public class Dado {

	public static void main(String[] args) {
		
		//TODO buscar en google como generar numero aleatorio
		// variable entera para numeros
		int numeroAleatorio = int (Math.random()*4);
		/*
		 * variable de tipo array para guardar la lista de voluntarios,
		 * Los arrays empiezan por la posicion 0 siempre.
		 * En este caso inicializamos el array con 4 nombres de tipo String.
		 * 
		 * */
		String [] aVoluntarios = {"Manolo", // posicion 0
								  "Juan", // posicion 1
								  "Manolito", // posicion 2
								  "Paloma" // posicion 3
								 };
		
		// guardar en una variable tipo string una posicion del array
		String voluntario = aVoluntarios[numeroAleatorio];
		
		//mostramos por consola la persona voluntaria
		System.out.println("El voluntario es: " + voluntario);
		
		System.out.println("Listado de Voluntarios:");
		System.out.println("---------------------------------------");
		
		for(int i=0;i< aVoluntarios.length;i++){
			System.out.println((i+1) + ". " + aVoluntarios[i]);
		}
		//end for
		
	}

}
