package secciones.secc5sentenciasdecontrol;

import java.util.Scanner;

public class Temario1 {

	public static void main(String args[]) {
		// Estructura if else

		var condicion = true;

		if (condicion) {
			System.out.println("Condicion veradera");
		} else {
			System.out.println("Condicion falsa ");
		}

		var numero = 2;
		var numeroTexto = "";
		if (numero == 1) {
			numeroTexto = "Numero uno";
		} else if (numero == 2) {
			numeroTexto = "Numero dos";
		} else if (numero == 3) {
			numeroTexto = "Numero tres";
		} else if (numero == 4) {
			numeroTexto = "Numero cuatro";
		} else {
			numeroTexto = "Numero desconocido";
		}

		System.out.println(numeroTexto);
		

		var estacion = "Estacion desconocida";
		Scanner capturador = new Scanner(System.in);
		System.out.print("Por favor ingres el numero del mes: ");
		var mes = Integer.parseInt(capturador.nextLine());
		
		if(mes == 1 || mes == 2 || mes == 12)
		{
			estacion = "Invierno";
		}
		else if( mes == 3 || mes == 4 || mes == 5)
		{
			estacion = "Primavera";
		}
		else if ( mes == 6 || mes == 7 || mes == 8)
		{
			estacion = "Verano";
		}
		else if ( mes == 9 || mes == 10 || mes == 11)
		{
			estacion = "Otonio";
		}
	
		System.out.println("La estacion es: " + estacion);
	}
}
