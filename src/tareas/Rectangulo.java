package tareas;

import java.util.Scanner;

public class Rectangulo {
	
	public static void main(String args[])
	{
		int alto, ancho, area, perimetro;
		
		Scanner capturador = new Scanner(System.in);
		
		System.out.print("Proporciona el alto: ");
		alto = capturador.nextInt();
		System.out.print("Proporciona el ancho: ");
		ancho = capturador.nextInt();
		
		area = alto * ancho;
		perimetro = (alto + ancho) / 2;
		
		System.out.println("El area del rectangulo es: " + area);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
		
		
	}

}
