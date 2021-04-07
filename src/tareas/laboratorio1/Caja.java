package tareas.laboratorio1;

public class Caja {

	private double ancho, alto, profundo;
	
	public Caja() {
		
	}
	
	public Caja(double ancho, double alto, double profundo)
	{
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	}
	
	public double volumen()
	{
		return ancho * alto * profundo;
	}
}
