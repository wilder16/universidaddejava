package secciones.secc16herenciaysobrecargadeconstructor.domain;

public class Persona {

	protected String nombre;
	protected char genero;
	protected int edad;
	protected String direccion;

	
	/*
	 * Los contructores no se heredan pero se pueden acceder por medio de la palabr super()
	 * Si la clase padre tiene mas de un contructor entonces para saber que contructor 
	 * utilizar dependera del numero de parametros que se le envie segun sea el caso 
	 * del contrucctor que tenga la clase padre 
	 */
	
	// Sobrecarga de constructores 
	public Persona() {

	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}

	public Persona(String nombre, char genero, int edad, String direccion) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [nombre=");
		builder.append(nombre);
		builder.append(", genero=");
		builder.append(genero);
		builder.append(", edad=");
		builder.append(edad);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	

}
