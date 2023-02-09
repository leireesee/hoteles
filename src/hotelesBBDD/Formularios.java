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
		
		System.out.println("Introduce el cif del hotel");
		String cifIntro = scan.nextLine();
		
		System.out.println("Introduce el nombre del hotel");
		String nombreIntro = scan.nextLine();
		
		System.out.println("Introduce el gerente del hotel");
		String gerenteIntro = scan.nextLine();
		
		System.out.println("Introduce las estrellas del hotel");
		int estrellasIntro = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce la compañia del hotel");
		String companiaIntro = scan.nextLine();
		
	}
	
	
	public static void pedirDatosHabitacion(Scanner scan) {
		
		System.out.println("Introduce la id de la habitacion");
		int idIntro = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce la id del hotel al que pertenece");
		int idHotelIntro = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce el numero de la habitacion");
		String numeroIntro = scan.nextLine();
		
		System.out.println("Introduce la descripcion de la habitacion");
		String descripcionIntro = scan.nextLine();
		
		System.out.println("Introduce el precio de la habitacion");
		double precioIntro = Double.parseDouble(scan.nextLine());
		
	}
	
	public static void pedirDatosReserva(Scanner scan) {
		
	}
	
}
