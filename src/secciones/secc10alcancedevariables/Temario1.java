package secciones.secc10alcancedevariables;

public class Temario1 {

	public static void main(String[] args) {
		// Variables locales 
		var a = 1;
		var b = 2;
		miMetodo();
	}
	
	public static void miMetodo()
	{
		//a = 2; // la variable a solo exsite en el metodo main por eso no se puede acceder en este otro metodo 
		System.out.println("Otro metodo");
	}

	/* La variables locales se almacen en la memoria Stack
	 * La variables de tipo Object se almacenan en la memoria Heap 
	 * 
	 */
}
