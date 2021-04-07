package secciones.secc15contextoestatico.test;

import secciones.secc15contextoestatico.domain.Persona;

public class PruebaPersona {
	
	private int contador;

	public static void main(String[] args)
	{
		Persona persona1 = new Persona("Wilder");
//		System.out.println("pesona1: " + persona1);
		
		Persona persona2 = new Persona("Celeste");
//		System.out.println("persona2: " + persona2);
		
		imprimir(persona1);
		imprimir(persona2);
	}
	
	public static void imprimir(Persona persona) {
		
		System.out.println("Persona = " + persona);
	}
	
	/*
	 *  La palabra this no se puede utilizar en un contexto estatico (dentro de un metodo static)
	 *  ya que esta esta relacionado con el contexto dinamico 
	 */
	/*
	 *  Desde un metodo no estatico se puede mandar a llamar un metodo static 
	 *  Esto se debe a que desde el contexto dinamico si se puede acceder al contextro static
	 */
	public int getContador()
	{
		imprimir(new Persona("Isai"));
		return this.contador;
	}
	
}
