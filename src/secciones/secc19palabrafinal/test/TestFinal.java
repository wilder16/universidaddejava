package secciones.secc19palabrafinal.test;

import secciones.secc19palabrafinal.domain.Persona;

public class TestFinal {

	// Palabra final 
	
	// En variables: Evita cambiar el valor que almacena la variable
	
	/*
	 *  En metodos: Evita que los metodos de la clase hija modifiquen el comportamiento
	 *	definido de un metodo en la clase padre 
	 */
	
	// En clases: evita que se creen hijos de la clase 
	
	/*
	 *  Normalmente la palabra final en variables se convina con static, para convertir una 
	 *  En una constante 
	 */
	
	public static void main(String[] args)
	{
		final int num = 10;
		System.out.println("num: "  + num);
		
//		Persona.MI_CONSTANTE = "Celeste";  no se puede cambiar un valor de una constante 
		
		System.out.println("Imprimiendo constante: " + Persona.MI_CONSTANTE);
		
		final Persona persona1 = new Persona(); // Objeto Persona de tipo final
		
//		persona1 = new Persona();  /No se le puede asignar una referencia de un nuevo objeto ya que se marco como final 
		
		// Si se puede modificar los valores de los atributos 
		persona1.setNombre("Isai");
		System.out.println("Nombre: " + persona1.getNombre());
		persona1.setNombre("Celeste");
		System.out.println("Nombre cambiado a pesar de ser final: " + persona1.getNombre());
		
		
		
		
	}
}
