package hotelesBBDD;

import java.util.Scanner;

public class Formularios {
	
	public static void pedirDatosCliente(Scanner scan) {
		
		System.out.println("Introduce el dni del cliente");
		String dniIntro = scan.nextLine();
		
		System.out.println("Introduce el nombre del cliente");
		String nombreIntro = scan.nextLine();
		
		System.out.println("Introduce los apellidos del cliente");
		String apellidoIntro = scan.nextLine();
		
		System.out.println("Introduce la direccion del cliente");
		String direccionIntro = scan.nextLine();
		
		System.out.println("Introduce la localidad del cliente");
		String localidadIntro = scan.nextLine();
		
	}
	
	public static void pedirDatosHotel(Scanner scan) {
		
	}
	
	
	public static void pedirDatosHabitacion(Scanner scan) {
		
	}
	
	public static void pedirDatosReserva(Scanner scan) {
		
	}
	
}
