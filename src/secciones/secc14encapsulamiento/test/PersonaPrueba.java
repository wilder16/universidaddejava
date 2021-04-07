package secciones.secc14encapsulamiento.test;

import secciones.secc14encapsulamiento.domain.Persona;

public class PersonaPrueba {

	public static void main(String[] args) {
		// Se crea un objeto de la clase persona y se inicializa con el constructor
		Persona persona1 = new Persona("Wilder", 2000000, false);
		
		// Se imprime el nombre 
		System.out.println("Pernasa1 nombre: " + persona1.getNombre());
		
		// Se cambia el nombre del objeto persona1 
		persona1.setNombre("Wilder de Jesus");
		
		// Se imprimen los valores de los atributos del objeto
		System.out.println("Persona1 nombre: " + persona1.getNombre());
		System.out.println("Persona1 sueldo: " + persona1.getSueldo());
		System.out.println("Persona1 eliminado: " + persona1.isEliminado());

		// Imprimiendo con el objeto toString 
		System.out.println("Persona1: " + persona1.toString());
		
		/*
		 * Si se tiene definido el metodo toString en la clase 
		 * con tan solo utilizar el metodo print o println se impreme todos los valores 
		 * de los atributos del objeto 
		 */
		System.out.println("Persona1: " + persona1);
	}

}
