package secciones.secc4operadores;

public class Temario7 {

	public static void main(String[] args) {
		
		// Presedencia de operadores
		
		var x = 5;
		var y = 10; 
		var z = ++x + y--;
		 
		System.out.println("X es: " + x);
		System.out.println("Y es: " + y);
		System.out.println("Z es: " + z);
		
		 var resultado = 4 + 5 * 6 / 3;
		 
		 System.out.println("Resultado es: " + resultado);
		 
		 resultado = (4 + 5) * 6 / 3;
		 System.out.println("Resultado es: " + resultado);
	}

}
