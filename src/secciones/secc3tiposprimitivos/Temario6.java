package secciones.secc3tiposprimitivos;

import java.util.Scanner;

public class Temario6 {
	
	public static void main(String args[]) {
		
		// Coversiones de tipo utilizando tipos primitivos 
		
		// String a int 
		var edad = Integer.parseInt("20");
		System.out.println("Edad: " + (edad + 1));
		
		var valorPI = Double.parseDouble("3.1416");
		System.out.println("ValorPI: " + valorPI);
		
		// Pedir un valor 
		var capturador = new Scanner(System.in);
		System.out.print("Ingresa tu edad por favor: ");
		edad = Integer.parseInt(capturador.nextLine());
		System.out.println("Tu edad es: " + edad);
		
		// int a String 
		var edadTexto = String.valueOf(10);
		System.out.println("EdadTexto: " + edadTexto);
		
		//String a char 
		var caracter = "Hola".charAt(0);
		System.out.println("Caracter: " + caracter);
		System.out.print("Ingrese un caracter: ");
		caracter = capturador.nextLine().charAt(0);
		System.out.println("Estoy imprimiento el primer caracter de la cadena ingresada: " + caracter);
		
		
	}
}
