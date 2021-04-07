package secciones.secc1y2variables;

import java.util.Scanner;

public class Temario {

	public static void main(String args[]) {

		System.out.println("Hola mundo desde Java");

		int miVaribaleEntera = 10;
		System.out.println(miVaribaleEntera);

		miVaribaleEntera = 5;
		System.out.println(miVaribaleEntera);

		String miVariableCadena = "Saludos";
		System.out.println(miVariableCadena);

		miVariableCadena = "Adios";
		System.out.println(miVariableCadena);

		// La palabra var se puede utilizar a partir de la version 10 de JAVA
		var miVariableEntera2 = 100;
		System.out.println(miVariableEntera2);
		;
		var miVariableCadena2 = "Soy cadena";

		System.out.println(miVariableCadena2);

		// Concatenacion
		var usuario = " Wilder";
		var titulo = "Ingeniero";

		var union = titulo + usuario;
		System.out.println(union);

		var i = 3;
		var j = 4;

		System.out.println(i + j); // Se realiza la suma
		System.out.println(i + j + usuario); // Evaluacion de izq a der realiza la suma
		System.out.println(usuario + i + j); // Contexto cadena, todo es una cadena
		System.out.println(usuario + (i + j)); // Uso de parentesis modifican la prioridad en la evaluacion

		// Caracter de salto de line.
		var nombre = "Isai";
		System.out.println("Nueva line: \n" + nombre);

		// Caracter de tabulador
		System.out.println("Tabulador \t" + nombre);

		// Caracter de retroceso
		System.out.println("Retroceso: \b" + nombre);

		// Caracter de comillas simple
		System.out.println("Comillas simpbre: \'" + nombre + "\'");

		// Caracter de comilla doble
		System.out.println("Comilla doble: \"" + nombre + "\" ");

		// Utilizacon de la clase Scanner
		System.out.print("Ingrese el nombre del usuario: ");
		Scanner capturador = new Scanner(System.in);
		var nombreUsuario = capturador.nextLine();
		System.out.println("Nombre del usuario: " + nombreUsuario);
		System.out.print("Ingrese el titulo del usario: ");
		var tituloUsuario = capturador.nextLine();
		System.out.println("Nombre del usuario es " + nombreUsuario + " y su titulo es: " + tituloUsuario);

	}
}
