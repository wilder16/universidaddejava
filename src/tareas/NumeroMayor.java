package tareas;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String args[])
	{
		int num1, num2;
		
		Scanner capturador = new Scanner(System.in);
		
		System.out.print("Por favor ingrese el primer numero: ");
		num1 = capturador.nextInt();
		System.out.print("Por favor ingrese el segundo numero: ");
		num2 = capturador.nextInt();
		
		if(num1 > num2)
		{
			System.out.println("El numero mayor es: " + num1);
		}
		else if (num2 > num1)
		{
			System.out.println("El numero mayor es: " + num2);
		}
		else {
			System.out.println("Los numeros ingresados son iguales");
		}
	}
}
