package secciones.secc16herenciaysobrecargadeconstructor.test;

import java.util.Date;

import secciones.secc16herenciaysobrecargadeconstructor.domain.Cliente;
import secciones.secc16herenciaysobrecargadeconstructor.domain.Empleado;

public class TestHerrencia {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado("Wilder", 2000000);
		
		System.out.println("Empleado1: " + empleado1);
		
		Date fecha = new Date();
		
		Cliente cliente1 = new Cliente(fecha, true, "Isai", 'M', 8, "Cr 25");
		System.out.println("Cliente1: " + cliente1);
		
//		Cliente cliente2 = new Cliente("Wilson", fecha, false);
//		System.out.println("Cliente2: " + cliente2);
		

	}

}
