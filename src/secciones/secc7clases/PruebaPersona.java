package secciones.secc7clases;

public class PruebaPersona {

	public static void main(String[] args) {
		
		Persona persona1; // Se declara una variables de tipo Persona 
		persona1 = new Persona();  // Se crea un objeto de la clase Persona, se reserva un espacio en memoria y se la asigna a la variable
		
		persona1.nombre = "Wilder";
		persona1.apellido = "Bernal";
		
		persona1.deplegarInformacion();
		
		Persona persona2 = new Persona();
		System.out.println("Persona1: " + persona1);
		System.out.println("Persona2: " + persona2);
		
		persona2.deplegarInformacion();
		
		persona2.nombre = "Celeste";
		persona2.apellido = "Lopez";
		
		persona2.deplegarInformacion();
		
	}

}
