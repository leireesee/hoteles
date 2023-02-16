package hotelesBBDD;

import java.util.Scanner;

public class Comprobante {
	public static boolean comprobarDni(Scanner scan, String dni) {
		GestorBBDD gestorBBDD = new GestorBBDD();
		gestorBBDD.conectar();
		boolean existe = gestorBBDD.getCliente(dni).getDni().equals(dni);
		gestorBBDD.cerrar();
		
		return existe;
	}
	
	public static boolean comprobarHotel(Scanner scan, int idHotel) {
		GestorBBDD gestorBBDD = new GestorBBDD();
		gestorBBDD.conectar();
		boolean existe = gestorBBDD.getHotel(idHotel).getId() == idHotel;
		gestorBBDD.cerrar();
		
		return existe;
	}
}
