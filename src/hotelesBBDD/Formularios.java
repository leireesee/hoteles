package hotelesBBDD;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Formularios {
	
	public static Cliente pedirDatosCliente(Scanner scan) {
		
		Cliente cliente = new Cliente();
		
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
		
		cliente.setDni(dniIntro);
		cliente.setNombre(nombreIntro);
		cliente.setApellidos(apellidoIntro);
		cliente.setDireccion(direccionIntro);
		cliente.setLocalidad(localidadIntro);
		
		return cliente;
		
	}
	
	public static String pedirDniCliente(Scanner scan) {
		
		System.out.println("Introduce el dni del cliente");
		String dni = scan.nextLine();
		
		return dni;
		
	}
	
	
	public static Hotel pedirDatosHotel(Scanner scan) {
		
		Hotel hotel = new Hotel();
		
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
		
		hotel.setCif(cifIntro);
		hotel.setNombre(nombreIntro);
		hotel.setGerente(gerenteIntro);
		hotel.setEstrellas(estrellasIntro);
		hotel.setCompania(companiaIntro);
		
		return hotel;
		
	}
	
	
	public static int pedirIdHotel(Scanner scan) {
		
		System.out.println("Introduce el id del hotel");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
		
	}
	
	
	public static Habitacion pedirDatosHabitacion(Scanner scan) {
		
		Habitacion habitacion = new Habitacion();
		
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
		
		habitacion.setId(idIntro);
		habitacion.setId_hotel(idHotelIntro);
		habitacion.setNumero(numeroIntro);
		habitacion.setDescripcion(descripcionIntro);
		habitacion.setPrecio(precioIntro);
		
		return habitacion;
		
	}
	
	
	public static int pedirIdHabitacion(Scanner scan) {
		
		System.out.println("Introduce el id de la habitacion");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
		
	}
	
	
	public static Reserva pedirDatosReserva(Scanner scan) {
		
		Reserva reserva = new Reserva();
		
		System.out.println("Introduce la id de la habitacion");
		int idHabitacionIntro = Integer.parseInt(scan.nextLine());
		
		System.out.println("Introduce el dni del cliente");
		String dniIntro = scan.nextLine();
		
		System.out.println("Introduce la fecha de inicio: ");
		Date fechaInicio = null;
		
		try {
			fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Introduce la fecha del final: ");
		Date fechaFin = null;
		
		try {
			fechaFin = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		reserva.setId_habitacion(idHabitacionIntro);
		reserva.setDni(dniIntro);
		reserva.setDesde(fechaInicio);
		reserva.setHasta(fechaFin);
		
		
		return reserva;
	}
	
	
	public static int pedirIdReserva(Scanner scan) {
		
		System.out.println("Introduce el id de reserva");
		int id = Integer.parseInt(scan.nextLine());
		
		return id;
		
	}
	
	
}
