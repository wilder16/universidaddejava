package secciones.secc17sobrecargademetodo.operaciones;

public class Operaciones {

	// Sobrecarga de metodo
	
	// Para que haya sobrecarga de metodo debe haber dos o mas metodos con el mismo nombre
	/* El tipo de retorno puede variar, tambien puede variar el modificador de acceso 
	 * pero no puede ser mas restrictivo y debe cambiar el tipo de variable en los 
	 * argumentos 
	 * 
	 */
	
	public static int sumar(int a, int b) {
		System.out.println("sumar(int a, int b)");
		return  a + b;
	}
	
	public static double sumar(double a, double b) {
		System.out.println("sumar(double a, double b)");
		return a + b;
	}
	
}
