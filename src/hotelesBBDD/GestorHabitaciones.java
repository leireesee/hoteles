package hotelesBBDD;

import java.util.Scanner;

public class GestorHabitaciones {
	
	public void run(Scanner scan) {

		int opcionMenu;

		do {
			VisorMenu.visualizarMenuHabitaciones();
			opcionMenu = Integer.parseInt(scan.nextLine());

			switch (opcionMenu) {
			case VisorMenu.ANADIR_HABITACION: {
				System.out.println("Añadir habitacion");
				break;
			}

			case VisorMenu.ELIMINAR_HABITACION: {
				System.out.println("Eliminar habitacion");
				break;
			}

			case VisorMenu.MODIFICAR_HABITACIONES: {
				System.out.println("Modificar habitacion");
				break;
			}

			case VisorMenu.VER_HABITACIONES: {
				System.out.println("Ver habitaciones");
				break;
			}

			case VisorMenu.SALIR: {
				System.out.println("Salir");
				break;
			}

			default:
				System.out.println("ERROR");
			}

		} while (opcionMenu != VisorMenu.SALIR);
	}
}
