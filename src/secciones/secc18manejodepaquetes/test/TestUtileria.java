package secciones.secc18manejodepaquetes.test;

//import secciones.secc18manejodepaquetes.*;
//import secciones.secc18manejodepaquetes.Utileria;

// Importacion estatica 
import static secciones.secc18manejodepaquetes.Utileria.imprimir;
public class TestUtileria {

	// Manejo de paquetes 
	public static void main(String[] args) {
		
//		Utileria.imprimir("Wilder");
		/*
		 * Si se utiliza la importacion estatica ya no es necesario utilizar 
		 * el nombre de la clase en el metodo estatico 
		 */
		imprimir("Wilder");
		
		// Tambien se puede utilizar el nombre completamente califacado de la clase 
		 secciones.secc18manejodepaquetes.Utileria.imprimir("Isai");
	}

}
