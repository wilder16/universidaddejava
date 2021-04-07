package secciones.secc20arreglos.domain;

public class Persona {

	private String nombre;
	
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/*
	 *  El motodo toString nos permite ver una representacion de los valores 
	 *  de los diferentes atribustos que conforma un objeto de la clase.
	 */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", " + super.toString()); // si se quiere ver la direccion de memoria en donde esta alojado el objeto se tiene que utilizar la palabra super.toString 
		builder.append("]");
		return builder.toString();
	}
	
	
}
