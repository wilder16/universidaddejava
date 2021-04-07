package secciones.secc12palabrareturnynull;

import secciones.secc7clases.Persona;

public class Temario1 {

	// Uso de la palabra return y null
	public static void main(String[] args) {

//		Persona persona = new Persona();
		Persona persona = null; // El objeto no ha sido inicializado
//		persona.nombre = "Wilder"; // esto me mostraria un error en tiempo de ejecucion ya que el objeto aun no se ha inicializado 

//		System.out.println("Nombre: " + persona.nombre);

		persona = cambiarValor(persona);
		System.out.println("Nombre cambiado: " + persona);
	}

	/*
	 * A este metodo recibe la referencia en la cual esta almacenado el objeto
	 * persona y torna el objeto persona es decir retor la misma referencia
	 */

	// Las lineas de codigo se van a ejecutar hasta la linea que dice return 
	public static Persona cambiarValor(Persona persona) {
		if (persona == null) {
			System.out.println("Valor de persona invalido: null");
			return null;
		}
		persona.nombre = "Celeste";
		return persona;

	}

}
