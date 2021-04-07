package secciones.secc15contextoestatico.domain;

public class Persona {

	// Contexto estatico y dinamico 
	
	/*
	 * Contexto estatico cuando se esta trabajando con las clases
	 * Contexto dinamico cuando se crea un objeto que ya esta en memoria
	 * 
	 * El contexto estatico no puede acceder al contexto dinamico, 
	 * pero el contexto dinamico si puede acceder al contexto estatico 
	 *
	 * Cuando se usa la palabra static se esta asociando al contexto estatico,
	 * es decir que se van a sociar con la clase mas no con los objetos 
	 * 
	 * Los atributos y metodos que no tengan la palabra static se asocian con los objetos
	 * 
	 * Cuando los atributos y metodos son static pueden ser accedidos desde cualquier objeto, 
	 * ya que la informacion no se va a sociar con los objetos sino con la clase directamente, 
	 * por lo tanto la informacion que se modifique a nivel de clase se podra ver por todos 
	 * los objetos de la clase. 
	 * 
	 * La informacion de los atributos no static no se comparte entre los objetos, es decir 
	 * que mantienen su informacion por separado 
	 * 
	 */
	
	private int idPersona;
	private String nombre;
	private static int contadorPersona;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		
		// No se recomiendo utilizar la palabra this con los atributos static 
		// Incrementamos el contatod por cada objeto nuevo
		Persona.contadorPersona++;
		
		this.idPersona = Persona.contadorPersona;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersona() {
		return contadorPersona;
	}

	public static void setContadorPersona(int contadorPersona) {
		Persona.contadorPersona = contadorPersona;
	}

	@Override
	public String toString() {
		return "Persona [idPersona = " + idPersona + ", nombre = " + nombre + "]";
	}
	
	
	
}
