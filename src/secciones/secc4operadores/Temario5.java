package secciones.secc4operadores;

public class Temario5 {

	public static void main(String[] args) {
	
		// Operadores condicionales
		
		var a = 10;
		var valorMinimo = 0;
		var valorMaximo = 10; 
		
		// Operador && AND 
		var resultado  = a >= valorMinimo && a <= valorMaximo;
		System.out.println("Resultado es: " + resultado);
		if(resultado)
		{
			System.out.println("Estas dentro del rango");
		}else
		{
			System.out.println("Estas fuera del rango");
		}

		
		var vacaciones = true; 
		var diaDescanso = false;
		
		// Operador || OR
		if(vacaciones || diaDescanso) {
			System.out.println("El padre puede asistir al juego del hijo");
		}
		else {
			System.out.println("El padre está ocupado");
		}
	}

}
