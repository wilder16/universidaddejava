package secciones.secc11pasoporvalorporreferencia;

public class Temario1 {

	// Paso por valor en java : signifaca que se esta pasando una copia del valor de la variable al metodo utilizado 

	public static void main(String[] agrs) {
		var x = 10;
		System.out.println("X: " + x);

		cambioValor(x);
		
		// El paso por valor solo se envia una copia el valor que almacena la variable mas no la variable en si
		System.out.println("X: " + x);
	}

	/*
	 * Si se desea utilizar o llamar un metodo desde un metodo estatico el metodo
	 * invocado o llamado también tiene que ser estatico
	 */

	// El paso por valor aplica para los tipos primitivos
	public static void cambioValor(int arg1) {
		System.out.println("arg1: " + arg1);
		
		// Se esta cambiando el valor que se paso   
		arg1 = 15;
	}

}
