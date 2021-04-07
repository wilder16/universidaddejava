package tareas;

import java.util.Scanner;

public class Libro {

	public static void main(String args[]) {

		System.out.print("Por favor ingrese el titulo del libro: ");
		Scanner capturador = new Scanner(System.in);
		var titulo1 = capturador.nextLine();
		System.out.print("Por favor ingrese el nombre del autor del libro: ");
		var autor = capturador.nextLine();

		System.out.println("El libro " + "\"" + titulo1 + "\"" + " fue escrito por el autor " + "\"" + autor + "\"");
	}
}
