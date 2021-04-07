package tareas;

import java.util.Scanner;

public class TiendaDeLibros {

	public static void main(String[] args) {
		
		// Definicion de variables 
		String nombre; 
		int id; 
		double precio; 
		boolean envioGratuito;
		
		// Objeto capturador
		Scanner capturador = new Scanner(System.in);
		
		// Toma de información del usuario
		System.out.print("Proporciona el nombre: ");
		nombre = capturador.nextLine();
		System.out.print("Proporciona el id: ");
		id = capturador.nextInt();
		System.out.print("Proporciona el precio: ");
		precio = capturador.nextDouble();
		System.out.print("Proporciona el envio gratuito: true o false: ");
		envioGratuito = capturador.hasNext();
		
		// Imprimiendo informacion
		System.out.println("El nombres es: " + nombre);
		System.out.println("El id es: " + id);
		System.out.println("El precio es: " + precio);
		System.out.println("El envio gratuito es: " + envioGratuito);
		
	}

}
