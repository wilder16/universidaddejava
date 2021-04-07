package secciones.secc20arreglos.test;

public class TestArreglo {

	// Arreglos 
	public static void main(String[] args) {
		// Se esta creando un objeto de tipo arreglo de longitud 3
		int edades[] = new int[3]; // A los arreglos se les debe asignar una cantidad de elementos que va almecenar no son dinamicos 
		
		System.out.println("edades: " + edades);
		
		// accediendo a los elementos del arreglo
		edades[0] = 10;
		System.out.println("edades 0: " + edades[0]);
		
		edades[1] = 11;
		edades[2] = 12;
		
		// edades[3] = 5; muestra un error en tiempo de ejecuion ya que el vector solo tiene 3 pocisiones
		
		// Imprimiento los elementos de un vector con un for 
		for(int i = 0; i < edades.length; i++)
		{
			System.out.println("edades elemento " + i + ": "+ edades[i]);
		}
		
		// Sintaxis resumida para definir arreglos
		String frutas[] = {"Manzana", "Pera", "Mango"};
		
		for (int i = 0; i < frutas.length; i++) {
			System.out.println("frutas " + i + ": " + frutas[i]);
		}
	}

}
