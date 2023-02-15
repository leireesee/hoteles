package hotelesBBDD;

import java.util.ArrayList;
import java.util.Scanner;

public class Visor {
	public static void mostrarClientes(ArrayList<Cliente> clientes) {
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		
	}
	
	public static void mostrarClientesOrdenadosPorNombre(ArrayList<Cliente> clientes) {
		clientes.sort((arg0, arg1) -> arg0.getNombre().toLowerCase().compareTo(arg1.getNombre().toLowerCase()));
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}
	
	public static void mostrarClientesOrdenadosPorApellido(ArrayList<Cliente> clientes) {
		clientes.sort((arg0, arg1) -> arg0.getApellidos().toLowerCase().compareTo(arg1.getApellidos().toLowerCase()));
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
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
}
