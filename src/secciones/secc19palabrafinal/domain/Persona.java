package secciones.secc19palabrafinal.domain;

public final class Persona {

	public final static String MI_CONSTANTE = "Wilder"; // Asi se define una constante 
	
	private String nombre;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public final void imprimir() {
		System.out.println("Metodo imprimir");
	}
}
