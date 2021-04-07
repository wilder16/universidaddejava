package secciones.secc20arreglos.test;

import secciones.secc20arreglos.domain.Persona;

public class TestArregloObject {

	public static void main(String[] args) {
		
		// Es buena practica colocar los nombre de los arreglos en plural
		Persona personas[] = new Persona[2];
		
		personas[0] = new Persona("Wilder");
		personas[1] = new Persona("Celeste");
		
		System.out.println("personas 0: " + personas[0]);
		System.out.println("personas 0: " + personas[1]);
		
		// iterando vectores de tipo object 
		for(int i = 0; i < personas.length; i++)
		{
			System.out.println("personas " + i +": " + personas[i]);
		}
	}

}
