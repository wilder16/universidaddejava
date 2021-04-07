package tareas.laboratorio1;

import java.util.Scanner;

public class PruebaCaja {

	public static void main(String[] args) {
		
		// Definicion de variables 
		double ancho, alto, profundo, volumen;
		
		// Objeto capturador 
		Scanner capturador = new Scanner(System.in);
		
		// Se crea un objeto de tipo caja sin inicializar sus atributos
		Caja caja = new Caja();
		
		// Se pide por consola las dimensiones de la caja 
		System.out.print("Por favor ingrese el ancho de la caja: ");
		ancho = capturador.nextDouble();
		System.out.print("Por favor ingrese el alto de la caja: ");
		alto = capturador.nextDouble();
		System.out.print("Por favor ingrese lo profundo de la caja: ");
		profundo = capturador.nextDouble();
		
		// Se inicializa el objeto caja con la informacion proporcionada por el usuario 
		caja = new Caja(ancho, alto, profundo);
		
		// Se le asigna el resultado de calcular el volumen a la variable volumen
		volumen = caja.volumen();
		
		// Se imprime en consola el volumen de la caja
		System.out.println("El volumen de la cada es: " + volumen);

	}

}
