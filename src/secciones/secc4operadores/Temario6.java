package secciones.secc4operadores;

public class Temario6 {

	public static void main(String[] args) {
		
		// Operador ternario
		var resultado = (3 > 2) ? "Verdadero": "Falso";
		
		System.out.println("Resultado es: " + resultado);

		var numero = 7 ; 
		
		resultado = (numero % 2 == 0) ? "En numero es par" : "El numero es impar";
		System.out.println(resultado);
	}

}
