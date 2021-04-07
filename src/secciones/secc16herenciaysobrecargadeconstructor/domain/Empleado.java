package secciones.secc16herenciaysobrecargadeconstructor.domain;

public class Empleado extends Persona  {
	
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	public Empleado() {
		super();
		this.idEmpleado = ++Empleado.contadorEmpleado;
	}
	
	public Empleado(String nombre, double sueldo) {
		this(); // se esta llamando el contructor vacio sin argumento, se llamada de manera interna
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	/*
	 * Se utiliza la clase StringBuilder para hacer mas eficiente la concatenacion de cadenas
	 * utilizando el + en la concatenacion se hace mas lento ya que por cada concatenacion
	 * crea un nuevo objeto de tipo String y los objetos de tipo String una vez creado no 
	 * se pueden modificar, son inmutables
	 * 
	 * StringBuilder se pueden modificar los calores utilizando el metodo append
	 */
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", sueldo=");
		builder.append(this.sueldo);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]"); 
		return builder.toString();
	}

	
	
	
	
	
	
	
	
	
	
	


}
