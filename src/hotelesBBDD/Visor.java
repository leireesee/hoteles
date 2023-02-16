package hotelesBBDD;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Visor {
	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
	}
	
	public static void mostrarClientesOrdenadosPorNombre(ArrayList<Cliente> clientes) {
		clientes.sort((arg0, arg1) -> arg0.getNombre().toLowerCase().compareTo(arg1.getNombre().toLowerCase()));
		mostrarClientes(clientes);
	}
	
	public static void mostrarClientesOrdenadosPorApellido(ArrayList<Cliente> clientes) {
		clientes.sort((arg0, arg1) -> arg0.getApellidos().toLowerCase().compareTo(arg1.getApellidos().toLowerCase()));
		mostrarClientes(clientes);
	}
	
	public static void filtrarClientes(Scanner scan, ArrayList<Cliente> clientes) {
		
		System.out.println("Buscar:");
		String buscado = scan.nextLine();
		
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().contains(buscado) || cliente.getApellidos().contains(buscado)) {
				System.out.println(cliente);
			}
		}
	}
	
	public static void mostrarHoteles(ArrayList<Hotel> hoteles) {
		for (Hotel hotel : hoteles) {
			System.out.println(hotel);
		}
		
	}
	
	public static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
		for (Habitacion habitacion : habitaciones) {
			System.out.println(habitacion);
		}
		
	}
	public static void mostrarReservas(ArrayList<Reserva> reservas) {
		for (Reserva reserva : reservas) {
			System.out.println(reserva);
		}
		
	}
	
	public static void mostrarReservasEntreFechas(ArrayList<Reserva> reservas, Date desde, Date hasta) {
		for (Reserva reserva : reservas) {
			if (desde.after(reserva.getDesde()) && hasta.before(reserva.getHasta())) {
				System.out.println(reserva);
			}
		}
	}
	
	public static void mostrarReservasDeUnaPersona(ArrayList<Reserva> reservas, String dni) {
		int cont = 0;
		
		for (Reserva reserva : reservas) {
			if (dni.equals(reserva.getDni())) {
				System.out.println(reserva);
				cont++;
			}
		}
		
		if(cont == 0 )
			System.out.println("No se han encontrado reservas");
	}
}
