package secciones.secc5sentenciasdecontrol;

import java.util.Scanner;

public class Temario2 {
	public static void main(String args[]) {
		
		// Estructura switch
		var numero = 2;
		var numeroTexto = "Numero desconocido";

		switch (numero) {
		case 1:
			numeroTexto = "Numero uno";
			break;
		case 2:
			numeroTexto = "Numero dos";
			break;
		case 3:
			numeroTexto = "Numero tres";
			break;
		case 4:
			numeroTexto = "Numero cuatro";
			break;
		}
		System.out.println(numeroTexto);

		Scanner capturador = new Scanner(System.in);
		System.out.print("Por favor ingrese el numero del mes: ");
		var mes = Integer.parseInt(capturador.nextLine());
		var estacion = "Estacion desconcida";

		switch (mes) {
		case 1:
		case 2:
		case 12:
			estacion = "Invierno";
			break;
		case 3:
		case 4:
		case 5:
			estacion = "Primavera";
			break;
		case 6:
		case 7:
		case 8:
			estacion = "Verano";
			break;
		case 9:
		case 10:
		case 11:
			estacion = "Otonio";
			break;
		}
		System.out.println("La estacion es: " + estacion);

	}

}
