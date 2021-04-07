package secciones.secc4operadores;

public class Temario4 {

	public static void main(String args[]) {
		// Operadores de asignacion y relacionales

		var a = 3;
		var b = 2;

		// Operador de igualdad
		var c = (a == b);
		System.out.println("Valor de c: " + c);

		// Operador diferente
		var d = a != b;
		System.out.println("Valor de d: " + d);

		// Trabajando con cadenas

		var cadena = "Hola";
		var cadena2 = "Adios";
		var e = cadena == cadena2; // Se compara la referencia de la memoria del objeto que almacena la variable
		System.out.println("Valor de e: " + e);

		var f = cadena.equals(cadena2);
		System.out.println("Valor de f: " + f);

		cadena2 = "Hola";
		f = cadena.equals(cadena2); // Se compara el contenido de las cadenas
		System.out.println("Nuevo valor de f: " + f);

		// Operadores relacionales
		var g = a > b; // >= , <= , > , <
		System.out.println("Valor de g: " + g);

		if (a % 2 == 0) {
			System.out.println("A es par");
		} else {
			System.out.println("A es impar");
		}

		var edad = 10;
		var adulto = 18;

		if (edad >= adulto) {
			System.out.println("Es adulto");
		} else {
			System.out.println("Es menor de edad");
		}

	}
}
