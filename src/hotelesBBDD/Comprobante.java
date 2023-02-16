package hotelesBBDD;

import java.util.Scanner;

public class Comprobante {
	public static boolean comprobarDni(Scanner scan, String dni) {
		GestorBBDD gestorBBDD = new GestorBBDD();
		gestorBBDD.conectar();
		Cliente cliente = gestorBBDD.getCliente(dni);
		gestorBBDD.cerrar();
		
		return cliente != null ? true : false;
	}
	
	public static boolean comprobarHotel(Scanner scan, int idHotel) {
		GestorBBDD gestorBBDD = new GestorBBDD();
		gestorBBDD.conectar();
		Hotel hotel = gestorBBDD.getHotel(idHotel);
		gestorBBDD.cerrar();
		
		return hotel != null ? true : false;
	}
}
