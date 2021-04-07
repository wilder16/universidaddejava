package secciones.secc4operadores;

public class Temario3 {
	public static void main(String args[])
	{
		// Operadores unarios
		
		// Operador de cambio de signo
		int a = 3; 
		int b = -a;
		System.out.println("Valor de a: " + a);
		System.out.println("Valor de b: " + b);
		
		// Operador de negacion
		var c = true;
		var d = !c;
		System.out.println("Valor de c: " + c);
		System.out.println("Valor de d: " + d);
		
		// Operador unario de ingremento 
		// Preincrementado (Simbilo antes de la variable)
		var e = 3; 
		var f = ++e; // Primero se incrementa la variable y luego se suma
		System.out.println("Variable e:" + e);
		System.out.println("Variable f:" + f);
		
		// Posincremento (Simbolo despues de la variable)
		var g = 5;
		var h = g++; // Primero se utiliza el valor y despues de incrementa 
		System.out.println("Variable g: " + g); // Se tenia pendiente un incremento por eso da como resultado 6 
		System.out.println("Variable h: " + h);
		
		// Operadores unario de decremento
		// Predecremento
		var i = 2; 
		var j = --i;
		System.out.println("Varible i: "  + i); // Ya esta decrementada 
		System.out.println("Varible i: "  + j);
		
		// Posdecremento
		var k = 4; 
		var l = k--;
		System.out.println("Variable k: " + k); // Se tenia pendiente un decremento
		System.out.println("Variable l: " + l);
		
		
	}
}
