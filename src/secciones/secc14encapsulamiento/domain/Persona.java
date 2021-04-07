package secciones.secc14encapsulamiento.domain;

public class Persona {

	// Encapsulamiento

	private String nombre;
	private double sueldo;
	private boolean eliminado;

	public Persona(String nombre, double sueldo, boolean eliminado) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return this.sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isEliminado() {
		return this.eliminado;
	}

	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	// Metodo toString 
	/*
	 * Nos permite el estado el objeto en cualquier momento 
	 * Basicamente nos permite imprimir los valores de los atribitos del objeto
	 */
	
	public String toString() {
		return "Persona [nombre: " + this.nombre +
				", sueldo: " + this.sueldo +
				", eliminado: " + this.eliminado + "]";
	}
	
}
