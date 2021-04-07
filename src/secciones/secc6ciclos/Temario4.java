package secciones.secc6ciclos;

public class Temario4 {

	public static void main(String[] args) {
		
		// break, continue
		System.out.println("Usando break");
		for(var i = 0; i < 3; i++)
		{
			if( i % 2 == 0 )
			{
				System.out.println("Contador: " + i);
				break;
			}
		}
		System.out.println("Utilizando continue");
		for(var i = 0; i < 3; i++)
		{
			if( i % 2 != 0 )
			{
				continue;
			}
			System.out.println("Contador: " + i);
		}

	}

}
