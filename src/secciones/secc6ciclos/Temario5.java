package secciones.secc6ciclos;

public class Temario5 {

	public static void main(String[] args) {
		
		// Utilizacion de etiquetas 
		/*
		 Lo que hace basicamente la etiqueda es identificar un seccion de codigo
		 que quiero que se ejecute cuando la invoco
		 */
		
		inicio: 
			for(int i = 0; i < 3; i++)
			{
				if (i % 2 != 0)
				{
					continue inicio; // No se recomienda utilziar esta programacion ya que se hace muy confusa.
				}
				System.out.println("Contador: " + i);
			}
	

	}

}
