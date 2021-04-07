package tareas;

import java.util.Scanner;

public class SistemaDeCalificacion {

	public static void main(String[] args) {

		Scanner capturador = new Scanner(System.in);

		System.out.print("Proporciona un valor entre 0 y 10: ");
		var nota = Double.parseDouble(capturador.nextLine());
		var notaTexto = "Nota desconocida";

		if (nota >= 9 && nota <= 10) {
			notaTexto = "A";
		} else if (nota >= 8 && nota < 9) {
			notaTexto = "B";
		} else if (nota >= 7 && nota < 8) {
			notaTexto = "C";
		} else if (nota >= 6 && nota < 7) {
			notaTexto = "D";
		} else if (nota >= 0 && nota < 6) {
			notaTexto = "F";
		}

		System.out.println("La nota optenida es: " + notaTexto);
	}
}
