package hotelesBBDD;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Formularios {
	
	public static Cliente pedirDatosCliente(Scanner scan) {
		
		Cliente cliente = new Cliente();
		
		String dniIntro = introducirDniCliente(scan);
		String nombreIntro = introducirNombreCliente(scan);
		String apellidoIntro = introducirApellidoCliente(scan);
		String direccionIntro = introducirDireccionCliente(scan);
		String localidadIntro = introducirLocalidadCliente(scan);
		
		cliente.setDni(dniIntro);
		cliente.setNombre(nombreIntro);
		cliente.setApellidos(apellidoIntro);
		cliente.setDireccion(direccionIntro);
		cliente.setLocalidad(localidadIntro);
		
		return cliente;
		
	}

	private static String introducirLocalidadCliente(Scanner scan) {
		System.out.println("Introduce la localidad del cliente");
		String localidadIntro = scan.nextLine();
		return localidadIntro;
	}

	private static String introducirDireccionCliente(Scanner scan) {
		System.out.println("Introduce la direccion del cliente");
		String direccionIntro = scan.nextLine();
		return direccionIntro;
	}

	private static String introducirApellidoCliente(Scanner scan) {
		System.out.println("Introduce los apellidos del cliente");
		String apellidoIntro = scan.nextLine();
		return apellidoIntro;
	}

	private static String introducirNombreCliente(Scanner scan) {
		System.out.println("Introduce el nombre del cliente");
		String nombreIntro = scan.nextLine();
		return nombreIntro;
	}

	private static String introducirDniCliente(Scanner scan) {
		System.out.println("Introduce el dni del cliente");
		String dniIntro = scan.nextLine();
		return dniIntro;
	}
	
	public static Cliente modifcarCliente(Cliente cliente, Scanner scan) {
		
		String nombreIntro = introducirNombreCliente(scan);
		String apellidoIntro = introducirApellidoCliente(scan);
		String direccionIntro = introducirDireccionCliente(scan);
		String localidadIntro = introducirLocalidadCliente(scan);
		
		cliente.setNombre(nombreIntro);
		cliente.setApellidos(apellidoIntro);
		cliente.setDireccion(direccionIntro);
		cliente.setLocalidad(localidadIntro);
		
		return cliente;
	}
	
	public static Hotel pedirDatosHotel(Scanner scan) {
		
		Hotel hotel = new Hotel();
		
		String cifIntro = introduceCifHotel(scan);
		String nombreIntro = introduceNombreHotel(scan);
		String gerenteIntro = introduceGerenteHotel(scan);
		int estrellasIntro = introduceEstrellasHotel(scan);
		String companiaIntro = introduceCompaniaHotel(scan);
		
		hotel.setCif(cifIntro);
		hotel.setNombre(nombreIntro);
		hotel.setGerente(gerenteIntro);
		hotel.setEstrellas(estrellasIntro);
		hotel.setCompania(companiaIntro);
		
		return hotel;
		
	}

	private static String introduceCompaniaHotel(Scanner scan) {
		System.out.println("Introduce la compañia del hotel");
		String companiaIntro = scan.nextLine();
		return companiaIntro;
	}

	private static int introduceEstrellasHotel(Scanner scan) {
		System.out.println("Introduce las estrellas del hotel");
		int estrellasIntro = Integer.parseInt(scan.nextLine());
		return estrellasIntro;
	}

	private static String introduceGerenteHotel(Scanner scan) {
		System.out.println("Introduce el gerente del hotel");
		String gerenteIntro = scan.nextLine();
		return gerenteIntro;
	}

	private static String introduceNombreHotel(Scanner scan) {
		System.out.println("Introduce el nombre del hotel");
		String nombreIntro = scan.nextLine();
		return nombreIntro;
	}

	private static String introduceCifHotel(Scanner scan) {
		System.out.println("Introduce el cif del hotel");
		String cifIntro = scan.nextLine();
		return cifIntro;
	}
	
	public static Hotel modifcarHotel(Hotel hotel, Scanner scan) {
		
		String cifIntro = introduceCifHotel(scan);
		String nombreIntro = introduceNombreHotel(scan);
		String gerenteIntro = introduceGerenteHotel(scan);
		int estrellasIntro = introduceEstrellasHotel(scan);
		String companiaIntro = introduceCompaniaHotel(scan);
		
		hotel.setCif(cifIntro);
		hotel.setNombre(nombreIntro);
		hotel.setGerente(gerenteIntro);
		hotel.setEstrellas(estrellasIntro);
		hotel.setCompania(companiaIntro);
			
		return hotel;
	}
	
	
	public static Habitacion pedirDatosHabitacion(Scanner scan) {
		
		Habitacion habitacion = new Habitacion();
		
		int idIntro = introduceIdHabitacion(scan);
		int idHotelIntro = introduceIdHotel(scan);
		String numeroIntro = introduceNumeroHabitacion(scan);
		String descripcionIntro = introduceDescripcionHabitacion(scan);
		double precioIntro = introducePrecioHabitacion(scan);
		
		habitacion.setId(idIntro);
		habitacion.setId_hotel(idHotelIntro);
		habitacion.setNumero(numeroIntro);
		habitacion.setDescripcion(descripcionIntro);
		habitacion.setPrecio(precioIntro);
		
		return habitacion;
		
	}

	private static double introducePrecioHabitacion(Scanner scan) {
		System.out.println("Introduce el precio de la habitacion");
		double precioIntro = Double.parseDouble(scan.nextLine());
		return precioIntro;
	}

	private static String introduceDescripcionHabitacion(Scanner scan) {
		System.out.println("Introduce la descripcion de la habitacion");
		String descripcionIntro = scan.nextLine();
		return descripcionIntro;
	}

	private static String introduceNumeroHabitacion(Scanner scan) {
		System.out.println("Introduce el numero de la habitacion");
		String numeroIntro = scan.nextLine();
		return numeroIntro;
	}

	private static int introduceIdHotel(Scanner scan) {
		System.out.println("Introduce la id del hotel al que pertenece");
		int idHotelIntro = Integer.parseInt(scan.nextLine());
		return idHotelIntro;
	}

	private static int introduceIdHabitacion(Scanner scan) {
		System.out.println("Introduce la id de la habitacion");
		int idIntro = Integer.parseInt(scan.nextLine());
		return idIntro;
	}
	
	public static Habitacion modificardatosHabitacion(Habitacion habitacion, Scanner scan) {
		
		int idHotelIntro = introduceIdHotel(scan);
		String numeroIntro = introduceNumeroHabitacion(scan);
		String descripcionIntro = introduceDescripcionHabitacion(scan);
		double precioIntro = introducePrecioHabitacion(scan);
		
		habitacion.setId_hotel(idHotelIntro);
		habitacion.setNumero(numeroIntro);
		habitacion.setDescripcion(descripcionIntro);
		habitacion.setPrecio(precioIntro);
		
		return habitacion;
	}
	
	public static Reserva pedirDatosReserva(Scanner scan) {
		
		Reserva reserva = new Reserva();
		
		int idHabitacionIntro = introduceIdHabitacion(scan);
		String dniIntro = introducirDniCliente(scan);
		Date fechaInicio = introduceFechaInicio(scan);
		Date fechaFin = introduceFechaFinal(scan);
		
		reserva.setId_habitacion(idHabitacionIntro);
		reserva.setDni(dniIntro);
		reserva.setDesde(fechaInicio);
		reserva.setHasta(fechaFin);
		
		return reserva;
	}

	private static Date introduceFechaFinal(Scanner scan) {
		System.out.println("Introduce la fecha del final: ");
		Date fechaFin = null;
		
		try {
			fechaFin = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fechaFin;
	}

	private static Date introduceFechaInicio(Scanner scan) {
		System.out.println("Introduce la fecha de inicio: ");
		Date fechaInicio = null;
		
		try {
			fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fechaInicio;
	}
	
	public static Reserva modificaReserva(Reserva reserva, Scanner scan) {

		int idHabitacionIntro = introduceIdHabitacion(scan);
		String dniIntro = introducirDniCliente(scan);
		Date fechaInicio = introduceFechaInicio(scan);
		Date fechaFin = introduceFechaFinal(scan);
		
		reserva.setId_habitacion(idHabitacionIntro);
		reserva.setDni(dniIntro);
		reserva.setDesde(fechaInicio);
		reserva.setHasta(fechaFin);
		
		return reserva;
	}
}
