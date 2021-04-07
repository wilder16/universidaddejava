package secciones.secc17sobrecargademetodo.test;

import secciones.secc17sobrecargademetodo.operaciones.Operaciones;

public class TestOperaciones {

	public static void main(String[] args) {
	
		var resultado1 = Operaciones.sumar(1, 2);
		System.out.println("resultado1: " + resultado1);
		
		var resultado2  = Operaciones.sumar(2.5, 6.6);
		System.out.println("resultado2: " + resultado2);

	}

}
