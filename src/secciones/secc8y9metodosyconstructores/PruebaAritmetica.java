package secciones.secc8y9metodosyconstructores;

public class PruebaAritmetica {

	public static void main(String[] args) {
		
		Aritmetica aritmetica1 = new Aritmetica();
		aritmetica1.a = 5;
		aritmetica1.b = 3;
		aritmetica1.sumar();
		int resultado = aritmetica1.sumarConRetorno();
		
		System.out.println("Resultado dede la clase de prueba: " + resultado);
		
		resultado = aritmetica1.sumarConArgumentos(5, 8);
		
		System.out.println("Resultado usando argumentos: " + resultado);
		
		Aritmetica aritmetica2 = new Aritmetica(12, 58);
		System.out.println("Atributo 1: " + aritmetica2.a);
		System.out.println("Atributo 1: " + aritmetica2.b);
		
	}

}
