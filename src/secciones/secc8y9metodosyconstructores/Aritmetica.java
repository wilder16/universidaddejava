package secciones.secc8y9metodosyconstructores;

public class Aritmetica {
	
	// Artibutos 
	int a, b;
	
	// Contructor vacio
	public Aritmetica()
	{
		System.out.println("Ejecutando constructor");
	}
	
	// Sobrecarga de contructores 
	public Aritmetica(int a, int b)
	{
		this.a = a;
		this.b = b; 
		System.out.println("Ejecutando constructor con argumento");
	}
	// Metodos
	public void sumar( )
	{
		int resultado = a + b;
		System.out.println("Resultado: " + resultado);
	}
	
	// Metodo con retorno
	public int sumarConRetorno()
	{
//		int resultado = a + b;
//		return resultado;
		return a + b;
	}
	
	// Meotodo con parametros
	public int sumarConArgumentos(int arg1, int arg2)
	{
		this.a = arg1; // El uso de this es opcional se usa como buena práctica, se lee el argumento a se le asigna a atributos this.a
		this.b = arg2; // Si los argumentos del metodo se llama igual al atributos de la clase se recomiendo utilizar this
//		return a + b;
		return this.sumarConRetorno();
	}
	
}
