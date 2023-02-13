package hotelesBBDD;

import java.util.Scanner;

public class GestorHabitaciones {
	
	public void run(Scanner scan) {

		int opcionMenu;
		GestorBBDD gestorBBDD = new GestorBBDD();
		Habitacion habitacion = null;

		do {
			VisorMenu.visualizarMenuHabitaciones();
			opcionMenu = Integer.parseInt(scan.nextLine());

			switch (opcionMenu) {
			case VisorMenu.ANADIR_HABITACION: {
				gestorBBDD.conectar();
				habitacion = Formularios.pedirDatosHabitacion(scan);
				if(gestorBBDD.insertarHabitacion(habitacion))
					System.out.println("Habitacion introducido con exito");
				else
					System.out.println("ERROR!!! Habitacion no introducido");
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
