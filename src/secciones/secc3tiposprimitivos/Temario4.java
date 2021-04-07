package secciones.secc3tiposprimitivos;

public class Temario4 {

	public static void main(String args[]) {
		// Primitivos tipo char

		char miCaracter = 'a';
		System.out.println("Mi caracter: " + miCaracter);

		char varChar = '\u0021';
		System.out.println("Mi caracter usuando el codigo: " + varChar);

		char varChar2 = 33;
		System.out.println("Mi caracter usuando el decimal: " + varChar2);

		char varChar3 = '!';
		System.out.println("Mi caracter usuando el simbolo: " + varChar3);
		System.out.println("\n");

		// Usando la palabra reservada var
		var varChar4 = '\u0021';
		System.out.println("Mi caracter usuando el codigo: " + varChar4);

		var varChar5 = (char) 33;
		System.out.println("Mi caracter usuando el decimal: " + varChar5);

		var varChar6 = '!';
		System.out.println("Mi caracter usuando el simbolo: " + varChar6);

		// Usando int

		int variableEnteraSimbolo = '!';
		System.out.println("Soy  int por eso imprimo el valor decimal: " + variableEnteraSimbolo);

		int varChar7 = 'A';
		System.out.println("Soy  int por eso imprimo el valor decimal: " + varChar7);
	}
}
