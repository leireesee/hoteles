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
				if(!gestorBBDD.insertarHabitacion(habitacion))
					System.out.println("Habitacion introducido con exito");
				else
					System.out.println("ERROR!!! Habitacion no introducido");
				gestorBBDD.cerrar();
				break;
			}

			case VisorMenu.ELIMINAR_HABITACION: {
				gestorBBDD.conectar();
				int id = Formularios.pedirIdHabitacion(scan);
				if(!gestorBBDD.eliminarHabitacion(id))
					System.out.println("Habitacion eliminado con exito");
				else
					System.out.println("ERROR!!! Habitacion no eliminado");
				gestorBBDD.cerrar();
				break;
			}

			case VisorMenu.MODIFICAR_HABITACIONES: {
				gestorBBDD.conectar();
				int id = Formularios.pedirIdHabitacion(scan);
				habitacion = gestorBBDD.getHabitacion(id);
				gestorBBDD.modificarHabitacion(Formularios.modificardatosHabitacion(habitacion, scan));
				gestorBBDD.cerrar();
				break;
			}

			case VisorMenu.VER_HABITACIONES: {
				gestorBBDD.conectar();
				Visor.mostrarHabitaciones(gestorBBDD.verHabitaciones());
				gestorBBDD.cerrar();
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
