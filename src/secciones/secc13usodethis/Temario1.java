package secciones.secc13usodethis;

public class Temario1 {

	// Uso de la palabra this
	public static void main(String[] args) {

		/*
		 * En este caso se esta utilizando el pull string que es un espacio de memoria
		 * eso con el objetivo de utilizar el menor espacio en memori posible
		 */
		Persona persona1 = new Persona("Wilder", "Bernal");
		System.out.println("Persona1: " + persona1);
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Apellido: " + persona1.apellido);

		/*
		 * No es tan comun ver que se utilice new String dentro del los argumentos del
		 * contructor con eso se esta creando un objeto en una posicion de momoria unica
		 */
//		Persona persona2 = new Persona(new String("Celeste"), new String("Bernal"));
	}
}

/*
 * En java se recomienda que una clase este en un solo archivo si se desea usar
 * mas de un clase en un mismo archivo, a las demas clase no se le puede colocar
 * el modificar de acceso public
 */

/*
 * estas clases solo seran accedidas por las clases que estan en el mimo archivo
 * o por todas las que estan en el mismo paquete
 * 
 * son llamadas clases default o package, esto por lo general no se utliza
 */
class Persona {

	String nombre;
	String apellido;

	Persona(String nombre, String apellido) {
//		super(); // Aca se manda a llamar el constructor de la clase padre (object) para reservar memoria
		this.nombre = nombre;
		this.apellido = apellido;
		System.out.println("Objeto persona usando this: " + this);
		
		// Aca el this aun sigue apuntando a la clase persona ya que se esta dentro de la clase persona
		new Imprimir().imprimir(this);
	}
}

class Imprimir {
	
	public void imprimir (Persona persona)
	{
		System.out.println("Persona desde la clase imprimir: " + persona);
		System.out.println("Impresion del objeto actual (this)" + this);
	}
}

/*
 * El operador this va a puntando a los objetos segun el objeto que se este ejecutando
 * en el momento 
*/
