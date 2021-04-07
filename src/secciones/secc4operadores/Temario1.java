package secciones.secc4operadores;

public class Temario1 {

	public static void main(String args[]) {
		
		// Operadores aritmeticos
		
		int a = 3, b = 2;
		// Suma
		var resultado = a + b; 
		System.out.println("Resultado suma: " + resultado);
		
		// Resta
		resultado = a - b;
		System.out.println("Resultado resta: " + resultado);
		
		// Multiplicacion 
		resultado = a * b;
		System.out.println("Resultado multiplicacion: " + resultado);
		
		// Division
		resultado = a / b;
		System.out.println("Resultado division: " + resultado);
		
		// Division con flotante 
		var resultado2 = 3D / b;
		System.out.println("Resultado division con  flotante: " + resultado2);
		
		// Operador modulo
		resultado = a % b;
		System.out.println("Resultado modulo: " + resultado);
		
		if( a % 2 == 0)
			System.out.println("El numero es par");
		else
			System.out.println("El numero es impar");
		
	}
}
