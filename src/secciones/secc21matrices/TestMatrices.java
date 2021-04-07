package secciones.secc21matrices;

import secciones.secc20arreglos.domain.Persona;

public class TestMatrices {

	// Matrices
	public static void main(String[] args) {
		// Se crea un objeto matriz de tipo int
		int edades[][] = new int[3][2];
		System.out.println("Edades: " + edades);

		// Modificando valores
		edades[0][0] = 1;
		edades[0][1] = 2;
		edades[1][0] = 3;
		edades[1][1] = 4;

		// Imprimiento los valores
		System.out.println("edades 0-0: " + edades[0][0]);
		System.out.println("edades 0-1: " + edades[0][1]);

		// Iterando todos los elementos de una matriz con for
		for (int ren = 0; ren < edades.length; ren++) {
			for (int col = 0; col < edades[ren].length; col++) {
				System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
			}
		}

		// Sintaxis simplificada
		String frutas[][] = { { "Mango", "Pera" }, { "Manzana", "Banano", "Mora" } };
		imprimir(frutas);

		// Matriz de objetos
		Persona personas[][] = new Persona[2][3];
		personas[0][0] = new Persona("Wilder");
		personas[0][1] = new Persona("Celeste");
		personas[0][2] = new Persona("Isai");
		imprimir(personas);
	}

	public static void imprimir(Object matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				System.out.println("frutas " + i + "-" + j + ": " + matriz[i][j]);
			}
		}
	}
}
