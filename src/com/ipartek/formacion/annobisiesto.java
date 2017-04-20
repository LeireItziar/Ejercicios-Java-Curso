package com.ipartek.formacion;

import java.util.Scanner;

public class annobisiesto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un año:");
		short anno = sc.nextShort();
		if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) { // si el resto del año (dividido entre 4) es 0 y el resto del año (dividido por 100) no es 0
			System.out.println(anno + " bisiesto");
		} else {
			System.out.println(anno + " no es bisiesto");
		}
		sc.close(); // Si abrimos Scanner siempre hay que cerrarlo.
	}

}
