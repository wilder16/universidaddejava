package secciones.secc4operadores;

public class Temario2 {

	public static void main(String args[])
	{
		// Operadores de asignacion 
		int a = 3, b = 2;
		int c = a + 5 - b;
		
		System.out.println("Valor de c: " + c);
		
		// Operador signacion de composicion
		a += 1;  // a = a + 1
		System.out.println("Valor de a con +: " + a);
		
		a = 3 ;
		a -= 1; // a = a - 1 
		System.out.println("Valor de a con -: " + a);
 	
		a = 3 ;
		a *= 1;  // a = a + 1
		System.out.println("Valor de a con *: " + a);
		
		a = 3 ;
		a /= 1;  // a = a + 1
		System.out.println("Valor de a con /: " + a);
		
		a = 3 ;
		a %= 1;  // a = a + 1
		System.out.println("Valor de a con %: " + a);
 	}
}
