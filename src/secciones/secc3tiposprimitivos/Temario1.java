package secciones.secc3tiposprimitivos;

public class Temario1 {

	public static void main(String args[]) {
		
		// Primitivos tipo enteros
		/*
		  Tipos primitivos enteros: byte, short, int, long
		
		*/
		byte numeroByte = 10; 
		System.out.println("Valor minimo de byte: " + Byte.MIN_VALUE);
		System.out.println("Valor maximo de byte: " + Byte.MAX_VALUE);
		
		numeroByte = (byte) 129; // Conversion de tipo, se oblica al compilador a convertir un valor en especicico al tipo encerrado en el parentesis
		System.out.println(numeroByte);
		
		short numeroShort = 11;
		System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
		System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
		
		numeroShort = (short) 32768;
		System.out.println(numeroShort);
		
		int numeroInt = 12;
		System.out.println("Valor minimo de int: " + Integer.MIN_VALUE);
		System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);
		
		numeroInt = (int) 2147483648L;
		System.out.println(numeroInt);
		
		long numeroLong = 13;
		System.out.println("Valor minimo de long: " + Long.MIN_VALUE);
		System.out.println("Valor maximo de long: " + Long.MAX_VALUE);
		
		numeroLong = 9223372036854775807L;
		System.out.println(numeroLong);
		
		
	}
	
}
