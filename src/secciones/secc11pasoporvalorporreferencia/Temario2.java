package secciones.secc11pasoporvalorporreferencia;

import secciones.secc7clases.Persona;

public class Temario2 {

	// Paso por referencia
	public static void main(String[] args) {
		
		Persona persona = new Persona();
		persona.nombre = "Wilder";
		
		System.out.println("Nombre: " + persona.nombre);
		
		cambiarValor(persona);
		System.out.println("Nombre cambiado ya que se esta pasando el valor de la refererencia del objeto: "  + persona.nombre);
	}

	// A este metodo recibe la referencia en la cual esta almacenado el objeto persona
	public static void cambiarValor(Persona persona)
	{
		persona.nombre = "Celeste";
	}
		
}
